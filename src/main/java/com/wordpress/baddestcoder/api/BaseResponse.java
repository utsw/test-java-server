package com.wordpress.baddestcoder.api;

import com.wordpress.baddestcoder.store.Store;

/**
 * Created by xpan on 4/24/15.
 */
public class BaseResponse {
    final Store store;

    public BaseResponse(Store store) {
        this.store = store;
    }
}
