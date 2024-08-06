package com.nhnacademy.practice.chain.filter;

import com.nhnacademy.practice.chain.FilterChain;
import com.nhnacademy.practice.chain.request.Request;

public interface Filter {
    void doFilter(Request request, FilterChain filterChain);
}
