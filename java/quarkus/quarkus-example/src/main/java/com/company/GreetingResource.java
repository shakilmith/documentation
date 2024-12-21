package com.company;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/greeting")
public class GreetingResource {

    //inject the template (greeting.html)
    @Inject
    Template greeting;

    //define TemplateInstance
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.TEXT_HTML)
    public TemplateInstance showGreeting(){

        String title = "Demo Greeting Messages";

        List<String> list = List.of(
                "Java",
                "Python",
                "Rust",
                "C++",
                "JavaScript"
        );

        return greeting.data
                (
                "title", title,
                "languages", list
                ); //define as many keys with values as you wish
    }
}
