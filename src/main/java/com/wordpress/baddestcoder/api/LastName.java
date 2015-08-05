package com.wordpress.baddestcoder.api;

import com.wordpress.baddestcoder.annotation.Notice;
import com.wordpress.baddestcoder.store.Store;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/last-name")
public class LastName extends BaseResponse {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Notice
    public String test() {
        System.out.println("Store is null? " + (store == null));
        //return "yes";
        return store.getLastName() + store.toString();
    }
}
