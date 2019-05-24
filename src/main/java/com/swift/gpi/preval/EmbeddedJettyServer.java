
package com.swift.gpi.preval;

import java.io.File;
import java.net.URL;
import java.security.ProtectionDomain;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

public final class EmbeddedJettyServer
{
    public static void main(String[] args) throws Exception
    {
        /*int port = Integer.parseInt(System.getProperty("port", "7443"));
        Server server = new Server(port);

        ProtectionDomain domain = EmbeddedJettyServer.class.getProtectionDomain();
        URL location = domain.getCodeSource().getLocation();
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setDescriptor("../../src/main/webapp/WEB-INF/web.xml");
        webapp.setServer(server);
        webapp.setWar(location.toExternalForm());

        // (Optional) Set the directory the war will extract to.
        // If not set, java.io.tmpdir will be used, which can cause problems
        // if the temp directory gets cleaned periodically.
        // Your build scripts should remove this directory between deployments
        //webapp.setTempDirectory(new File("yinwebapp"));

        server.setHandler(webapp);
        server.start();
        server.join(); */

        Server server = new Server(8080);
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        ProtectionDomain domain = EmbeddedJettyServer.class.getProtectionDomain();
        URL location = domain.getCodeSource().getLocation();
        webapp.setWar(location.toExternalForm());
        server.setHandler(webapp);
        server.start();
        server.join();
    }
}
