package com.company;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api")
public class PersonResource {



    @Path("/persons")
    @GET
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAll(){

       return Person.listAll();
    }


    @Path("/persons")
    @POST
    @Transactional
    public Response save(Person entity){
        if(entity.id !=null){
            throw new WebApplicationException("Id was set invalidly on request", 404);
        }
        entity.persist();

        return Response.ok().entity(entity).build();
    }

}
