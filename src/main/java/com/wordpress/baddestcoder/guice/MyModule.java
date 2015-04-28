package com.wordpress.baddestcoder.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.wordpress.baddestcoder.api.BaseResponse;
import com.wordpress.baddestcoder.store.Store;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by xpan on 4/24/15.
 */
public class MyModule extends AbstractModule {

    @Override
    protected void configure() {
        //bind(BaseResponse.class).in(Scopes.SINGLETON);
    }

    @Provides @Named("Really")
    @Singleton
    public Store provideContent() {
        return new Store("Xiaosong", "Pan");
    }

    @Provides @Named("Not Real")
    @Singleton
    public Store pprovideContent() {
        return new Store("AAA", "BB");
    }
}