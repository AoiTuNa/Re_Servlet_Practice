package com.nhnacademy.practice.chain.filter.impl;

import com.nhnacademy.practice.chain.FilterChain;
import com.nhnacademy.practice.chain.Member;
import com.nhnacademy.practice.chain.filter.Filter;
import com.nhnacademy.practice.chain.request.Request;

public class OrderPageFilter implements Filter {
    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        if(request.getPath().equals("/order")){
            Member member = (Member) request.get("member");
            if(!member.hasRole(Member.Role.NONE)){
                filterChain.doFilter(request);
            }else{
                System.out.println("권한 없대요~");
            }
        }else {
            System.out.println("OrderPageFilter : 다음 필터로 넘김! ");
            filterChain.doFilter(request);
        }
    }
}
