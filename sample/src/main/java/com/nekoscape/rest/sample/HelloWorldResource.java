package com.nekoscape.rest.sample;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldResource {
	@Context
	HttpServletRequest webRequest;
	
	@GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
         String output = "Hello! : " + msg + "¥n";
         return Response.status(200).entity(output).build();
    }
	

}
