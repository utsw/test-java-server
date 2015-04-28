package com.wordpress.baddestcoder.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.wordpress.baddestcoder.api.BaseResponse;
import com.wordpress.baddestcoder.store.Store;

/**
 * Created by xpan on 4/24/15.
 */
public class MyModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(BaseResponse.class);
    }

    @Provides
    public Store provideContent() {
        return new Store("Xiaosong", "Pan");
    }
}