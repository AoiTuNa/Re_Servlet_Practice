package com.nhnacademy.practice.chain;

import lombok.Getter;

@Getter
public class Member {
    public enum Role{
        ADMIN, USER, MANAGER, NONE
    }
    private final String name;
    private final String id;
    private final String password;
    private final Role role;

    public Member(String name,String id,String password,Role role){
        this.name = name;
        this.id = id;
        this.password = password;
        this.role = role;
    }
    public static Member createAdmin(String name,String id,String password){
        return new Member(name,id,password,Role.ADMIN);
    }
    public static Member createManager(String name,String id,String password){
        return new Member(name,id,password,Role.MANAGER);
    }
    public static Member createUser(String name,String id,String password){
        return new Member(name,id,password,Role.USER);
    }
    public static Member createUncertifiedMember(String name,String id,String password){
        return new Member(name,id,password,Role.NONE);
    }
    public boolean hasRole(Role role){
        return this.role.equals(role);
    }

}
