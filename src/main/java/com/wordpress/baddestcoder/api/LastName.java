package com.wordpress.baddestcoder.api;

import com.wordpress.baddestcoder.store.Store;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by xpan on 4/26/15.
 */
@Path("/last-name")
public class LastName extends BaseResponse {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return store.getLastName() + store.toString();
    }
}
