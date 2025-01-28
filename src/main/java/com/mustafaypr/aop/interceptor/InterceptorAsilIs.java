package com.mustafaypr.aop.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@InterceptorYolKesici
@Interceptor
public class InterceptorAsilIs {
    @AroundInvoke public Object aroundInvoke(InvocationContext ic) throws Exception {

        System.out.println("ilk hali "+ ic.getMethod().getName());

        boolean isLogin = false;
        Object isContinue = null;

        if(isLogin){
            //Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yapsın" );
            return  null;
        }else{
            try {
                isContinue=context.proceed(); //devam etmesini sağlamak
                System.out.println("Sonraki hali "+isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }


    }
}
