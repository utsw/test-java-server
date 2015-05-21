package com.wordpress.baddestcoder.guice;

import com.google.inject.*;
import com.google.inject.matcher.Matchers;
import com.wordpress.baddestcoder.annotation.Notice;
import com.wordpress.baddestcoder.api.BaseResponse;
import com.wordpress.baddestcoder.api.FirstName;
import com.wordpress.baddestcoder.api.LastName;
import com.wordpress.baddestcoder.interceptor.NoticeInterceptor;
import com.wordpress.baddestcoder.store.Store;

import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;

/**
 * Created by xpan on 4/24/15.
 */
public class MyModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(FirstName.class);
        bind(LastName.class);
        bind(Store.class).toProvider(StoreProvider.class).in(Scopes.SINGLETON);
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(Notice.class), new NoticeInterceptor());

    }


    /*
    @Provides @Named("Really")
    @Singleton
    public Store provideContent() {
        return new Store("Xiaosong", "Pan");
    }

    @Provides @Named("Not Real")
    @Singleton
    public Store pprovideContent() {
        return new Store("AAA", "BB");
    }*/


    static class StoreProvider implements Provider<Store> {

        @Override
        public Store get() {
            return new Store("Xiaosong", "Pan");
        }
    }
}