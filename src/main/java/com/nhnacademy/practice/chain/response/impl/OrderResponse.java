package com.nhnacademy.practice.chain.response.impl;

import com.nhnacademy.practice.chain.Member;
import com.nhnacademy.practice.chain.request.Request;
import com.nhnacademy.practice.chain.response.Response;

public class OrderResponse implements Response {
    @Override
    public void doResponse(Request request) {
        System.out.println("###### response:OrderPageResponse#####");
        Member member = (Member) request.get("member");
        System.out.println("아이디:" + member.getId());
        System.out.println("이름:" + member.getName());
        System.out.println("사과 10만개 구매 완료");
    }
}
