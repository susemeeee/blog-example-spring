/*
 * Role.java
 * Author : 박찬형
 * Created Date : 2021-12-18
 */
package com.example.examplespringsecurity.members;

public enum Role {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private final String value;

    Role(String value){
        this.value = value;
    }

    public String value(){
        return value;
    }
}
