package com.wordpress.baddestcoder.api;

import com.wordpress.baddestcoder.store.Store;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class BaseResponse {
    @Autowired //@Named("Not Real")
    Store store;
}
