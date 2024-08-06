package com.nhnacademy.practice.chain.request;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Request {
    @Getter
    private final String path;
    private final Map<String, Object> map = new HashMap<>();

    public Request(String path) {
        this.path = path;
    }

    public void put(String key, Object value) {
        map.put(key, value);
    }

    public Object get(String key) {
        return map.get(key);
    }

}
