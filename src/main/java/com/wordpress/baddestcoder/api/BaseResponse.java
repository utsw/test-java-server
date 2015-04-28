package com.wordpress.baddestcoder.api;

import com.wordpress.baddestcoder.store.Store;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by xpan on 4/26/15.
 */
public class BaseResponse {
    @Inject @Named("Not Real")
    Store store;
}
