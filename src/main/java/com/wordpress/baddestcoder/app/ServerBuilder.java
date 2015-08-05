package com.wordpress.baddestcoder.app;

import com.google.inject.Injector;
import com.google.inject.servlet.GuiceFilter;
import com.google.inject.servlet.ServletModule;
import com.squarespace.jersey2.guice.BootstrapUtils;
import com.wordpress.baddestcoder.api.BaseResponse;
import com.wordpress.baddestcoder.config.AppConfig;
import com.wordpress.baddestcoder.guice.GuiceApplication;
import com.wordpress.baddestcoder.guice.MyModule;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

public class ServerBuilder {

    private int port = 8080;

    public ServerBuilder() {
    }

    public ServerBuilder(int port) {
        this.port = port;
    }

    public Server build() {
        //ServiceLocator locator = BootstrapUtils.newServiceLocator();
        //Injector injector = BootstrapUtils.newInjector(locator, Arrays.asList(new ServletModule(), new MyModule()));

        //BootstrapUtils.install(locator);

        Server jettyServer = new Server(port);

        //ResourceConfig config = ResourceConfig.forApplication(new GuiceApplication());

        ServletContainer servletContainer = new ServletContainer(resourceConfig());

        ServletHolder jerseyServlet = new ServletHolder(servletContainer);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        //FilterHolder filterHolder = new FilterHolder(GuiceFilter.class);
        //context.addFilter(filterHolder, "/*", EnumSet.allOf(DispatcherType.class));

        context.addServlet(jerseyServlet, "/*");

        context.setInitParameter(ContextLoader.CONTEXT_CLASS_PARAM, AnnotationConfigWebApplicationContext.class.getName());
        context.setInitParameter(ContextLoader.CONFIG_LOCATION_PARAM, AppConfig.class.getName());

        jettyServer.setHandler(context);

        //jerseyServlet.setInitOrder(0);
        //jerseyServlet.setInitParameter(ServerProperties.PROVIDER_PACKAGES, BaseResponse.class.getPackage().getName());

        return jettyServer;
    }

    private ResourceConfig resourceConfig() {
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.packages(BaseResponse.class.getPackage().getName());
        return resourceConfig;
    }
}
