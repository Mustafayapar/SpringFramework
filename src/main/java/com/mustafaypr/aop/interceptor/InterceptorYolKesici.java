package com.mustafaypr.aop.interceptor;

import jakarta.interceptor.InterceptorBinding;

import java.lang.annotation.*;

@InterceptorBinding
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RUNTİME)
@Inherited
@Documented
public @interface InterceptorYolKesici {


}
