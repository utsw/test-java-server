package com.wordpress.baddestcoder.api;

import com.wordpress.baddestcoder.store.Store;

import javax.inject.Inject;
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

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return store.getFirstName() + store.toString();
    }
}
