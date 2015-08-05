package com.wordpress.baddestcoder.config;

import com.wordpress.baddestcoder.store.Store;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreProvider {
    @Bean
    public Store provideStore() {
        System.out.println("HERE?");
        return new Store("Xiaosong", "Pan");
    }
}
