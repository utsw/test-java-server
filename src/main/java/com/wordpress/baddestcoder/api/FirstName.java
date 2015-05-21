package com.wordpress.baddestcoder.api;

import com.wordpress.baddestcoder.annotation.Notice;
import com.wordpress.baddestcoder.interceptor.NoticeInterceptor;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by xpan on 4/23/15.
 */
//http://localhost:8080/first-name
@Path("/first-name")
public class FirstName extends BaseResponse {

    @Notice
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return store.getFirstName() + store.toString();
    }
}
