package com.wordpress.baddestcoder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by xpan on 4/23/15.
 */
@Path("/entry-point")
public class EntryPoint {
    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "Test";
    }
}
