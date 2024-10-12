package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.interceptors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;

@Component("time")
public class TimeInterceptor implements HandlerInterceptor {

    @Value("${config.calendar.open}")
    private Integer open;

    @Value("${config.calendar.close}")
    private Integer close;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);

        if (hour >= open && hour < close) {
            request.setAttribute("message", "Bienvenidos al horario de atención a clientes, atendemos desde las " + open
                    + " hrs. hasta las " + close + " hrs. Gracias por su visita!");
                    return true;
        }

        ObjectMapper json = new ObjectMapper();
        Map<String,Object> data = new HashMap<>();
        data.put("message", "Cerrado, fuera del horario de atención, por favor visitenos desde las "+open+" y las "+close+" hrs. Gracias.");
        data.put("date", new Date().toString());

        response.setContentType("application/json");
        response.setStatus(401);
        response.getWriter().write(json.writeValueAsString(data));

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {

    }

}
