package com.nhnacademy.practice.chain.request;

import com.nhnacademy.practice.chain.FilterChain;
import com.nhnacademy.practice.chain.filter.impl.AdminPageFilter;
import com.nhnacademy.practice.chain.filter.impl.MyPageFilter;
import com.nhnacademy.practice.chain.filter.impl.OrderPageFilter;

public class HttpRequest {
    private final FilterChain filterChain = new FilterChain();

    public HttpRequest(){
        initFilter();
    }
    public void doRequest(Request request){
        filterChain.doFilter(request);
    }

    private void initFilter(){
        filterChain.addFilter(new MyPageFilter());
        filterChain.addFilter(new AdminPageFilter());
        filterChain.addFilter(new OrderPageFilter());
    }
}
