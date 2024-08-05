package com.nhnacademy.practice.util;

import javax.servlet.ServletContext;

public final class CounterUtils {
    private CounterUtils(){
        throw new IllegalStateException("Utility class");
    }
    public static void increaseCounter(ServletContext servletContext){
        Long counter = (Long) servletContext.getAttribute("counter");
        counter += counter;
        servletContext.setAttribute("counter",counter);
    }
}
