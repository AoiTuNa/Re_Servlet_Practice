package com.nhnacademy.practice.chain;

import com.nhnacademy.practice.chain.filter.Filter;
import com.nhnacademy.practice.chain.request.Request;
import com.nhnacademy.practice.chain.response.impl.AdminPageResponse;
import com.nhnacademy.practice.chain.response.impl.MyPageResponse;
import com.nhnacademy.practice.chain.response.impl.NonePageResponse;
import com.nhnacademy.practice.chain.response.impl.OrderResponse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FilterChain {
    private List<Filter> filterList = new LinkedList<>();
    private Iterator iterator;

    public void addFilter(Filter filter){
        filterList.add(filter);
        iterator = filterList.iterator();
    }
    public void doFilter(Request request){
        if(iterator.hasNext()){
            Filter nextFilter = (Filter) iterator.next();
            nextFilter.doFilter(request,this);
        }else {
            if(request.getPath().equals("/mypage")){
                new MyPageResponse().doResponse(request);
            } else if (request.getPath().equals("/admin")) {
                new AdminPageResponse().doResponse(request);
            } else if (request.getPath().equals("/order")) {
                new OrderResponse().doResponse(request);
            } else{
                new NonePageResponse().doResponse(request);
            }
        }
    }
}
