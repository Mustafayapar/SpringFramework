package com.mustafaypr.aop.interceptor;

@InterceptorYolKesici
public class Login {
    public String isLogin(String username) {

        return "login" + username;
    }
}
