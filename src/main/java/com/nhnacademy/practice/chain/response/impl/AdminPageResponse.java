package com.nhnacademy.practice.chain.response.impl;

import com.nhnacademy.practice.chain.Member;
import com.nhnacademy.practice.chain.request.Request;
import com.nhnacademy.practice.chain.response.Response;

public class AdminPageResponse implements Response {

    public AdminPageResponse(){
    }
    @Override
    public void doResponse(Request request) {
        System.out.println("###### response:AdminPageResponse #####");
        Member member = (Member) request.get("member");
        System.out.println("아이디:" + member.getId());
        System.out.println("이름:" + member.getName());
        System.out.println("등급:" + Member.Role.ADMIN);
        System.out.println("이메일: marco@nhnacademy.com");
        System.out.println("do something ... ADMIN ...");
    }
}
