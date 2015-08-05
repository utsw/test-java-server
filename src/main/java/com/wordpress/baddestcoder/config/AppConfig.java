package com.wordpress.baddestcoder.config;

import com.wordpress.baddestcoder.api.BaseResponse;
import com.wordpress.baddestcoder.store.Store;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(
    StoreProvider.class
)
public class AppConfig {

    //private Store store = new StoreProvider().provideStore();

    @Bean
    public BaseResponse baseResponse() {
        return new BaseResponse(new Store("Xiaosong", "Pan"));
    }
}
