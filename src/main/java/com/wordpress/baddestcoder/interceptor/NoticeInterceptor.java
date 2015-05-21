package com.wordpress.baddestcoder.interceptor;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xpan on 5/20/15.
 */
public class NoticeInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("before");

        Object obj = methodInvocation.proceed();

        System.out.println("after");

        return obj;
    }
}
