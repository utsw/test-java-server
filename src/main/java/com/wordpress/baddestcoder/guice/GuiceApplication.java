package com.wordpress.baddestcoder.guice;

import com.wordpress.baddestcoder.api.BaseResponse;
import com.wordpress.baddestcoder.api.FirstName;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by xpan on 4/25/15.
 */
@ApplicationPath("/")
public class GuiceApplication extends ResourceConfig {
    public GuiceApplication() {
        System.out.println(BaseResponse.class.getPackage().getName());
        packages(FirstName.class.getPackage().getName());
    }
}
