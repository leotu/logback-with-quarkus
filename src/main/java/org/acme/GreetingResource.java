package org.acme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * http://127.0.0.1:8080/hello
 */
@Path("/hello")
public class GreetingResource {
    private static final Logger log = LoggerFactory.getLogger(GreetingResource.class);
    
    static {
        log.debug("static init...");
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        log.debug("...");
        return "Hello from RESTEasy Reactive";
    }
}
