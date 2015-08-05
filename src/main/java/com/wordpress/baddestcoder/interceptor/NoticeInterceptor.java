package com.wordpress.baddestcoder.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class NoticeInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("before");

        Object obj = methodInvocation.proceed();

        System.out.println("after");

        return obj;
    }
}
