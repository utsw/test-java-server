package com.wordpress.baddestcoder.app;

import org.eclipse.jetty.server.Server;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.LogManager;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        LogManager.getLogManager().reset();
        SLF4JBridgeHandler.install();
        Server jettyServer = new ServerBuilder().build();

        try {
            jettyServer.start();
            jettyServer.join();
        } finally {
            jettyServer.destroy();
        }
    }
}
