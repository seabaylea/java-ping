package knapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;;

@Path("/")
public class HelloWorld {

    @GET
    public Response getRoot() {
        return Response.ok("Hello, World!")
                .build();
    }
} 
