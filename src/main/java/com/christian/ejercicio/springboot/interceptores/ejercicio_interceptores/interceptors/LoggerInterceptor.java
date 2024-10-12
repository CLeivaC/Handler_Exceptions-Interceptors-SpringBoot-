package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Random;

@Component("logger")
public class LoggerInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        HandlerMethod controller = ((HandlerMethod) handler);
        logger.info("LoogerInterceptor: preHandle() entrando...."+ controller.getMethod().getName());
        
        long start = System.currentTimeMillis();
        request.setAttribute("start", start);

        Random random = new Random();
        int delay = random.nextInt(2000);
        Thread.sleep(delay);
        
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        
       long end = System.currentTimeMillis();
       long start = (long) request.getAttribute("start");
       long result = end-start;
       logger.info("Tiempo transcurrido: "+result + "milisegundos");
       logger.info("LoggerInterceptor: postHandle() saliendo....."+ ((HandlerMethod)handler).getMethod().getName());
       
    }

   
    

}
