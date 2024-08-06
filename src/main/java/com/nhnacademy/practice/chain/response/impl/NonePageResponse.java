package com.nhnacademy.practice.chain.response.impl;

import com.nhnacademy.practice.chain.request.Request;
import com.nhnacademy.practice.chain.response.Response;

public class NonePageResponse implements Response {
    @Override
    public void doResponse(Request request) {
        System.out.println("구현 안되어 있음...!");
    }
}
