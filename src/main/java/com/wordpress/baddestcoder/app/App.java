package com.wordpress.baddestcoder.app;

import org.eclipse.jetty.server.Server;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Server jettyServer = new ServerBuilder().build();

        try {
            jettyServer.start();
            jettyServer.join();
        } finally {
            jettyServer.destroy();
        }
    }
}
