package com.maltron.exemplohackaton;

import java.io.Serializable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/exemplo")
public class Recurso implements Serializable {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response meuNome() {
        return Response.ok("Maltron").build();
    }
}
