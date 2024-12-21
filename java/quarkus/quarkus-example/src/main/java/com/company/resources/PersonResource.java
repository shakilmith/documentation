package com.company.resources;

import com.company.model.Person;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class PersonResource {

    //method for getting all person records
    @GET
    public List<Person> getAll(){
        //call the listAll() method
        return Person.listAll();
    }

    //method for saving new person record
    @POST
    @Transactional
    public Response save(Person person){
        if(person.id !=null){
            throw new WebApplicationException("Id was set invalidly on request", 404);
        }
        //call the persist() method
        person.persist();
        return Response.ok().entity(person).build();
    }

    //method for each person records by its id
    @GET
    @Path("/{id}")
    public Person getPersonById(@PathParam("id") int id){
        Person entity = Person.findById(id);
        if(entity.id == null){
            throw new WebApplicationException("Person with id of " + id + "doesn't not exist", 404);
        }
        return Person.findById(id);
    }

    //method for updating person records
    @PUT
    @Path("/{id}")
    @Transactional
    public Person updatePerson(int id, Person person){

        Person entity = Person.findById(id);
        if ( entity.id == null) {
            throw new WebApplicationException("Person with id of " + id + "doesn't not exist", 404);
        }
        entity.firstName = person.firstName; //actually it calls setFirstName under the hood
        entity.lastName = person.lastName;
        entity.age = person.age;
        entity.email = person.email;
        entity.role = person.role;

        return entity;
    }



    //method for deleting person records
    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteStudent(int id){
        Person entity = Person.findById(id);
        if(entity.id == null){
            throw new WebApplicationException("The person of id "+ id +"doesn't exist", 404);
        }
        entity.delete();
        return Response.status(204).build();
    }
}
