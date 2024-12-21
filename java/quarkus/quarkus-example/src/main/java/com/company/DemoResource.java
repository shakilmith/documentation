package com.company;

import com.company.model.Person;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/")
@ApplicationScoped
public class DemoResource {

    @Inject
    Template hello;

    @Inject
    Template page;


    @GET
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.TEXT_HTML)
    @Path("/hello")
    public TemplateInstance hello() {


        return hello.data("name", "Fruits List", "fruits", List.of(
               "Apple",
                "Banana",
                "Orange",
                "Guava"
        ));
    }



    @GET
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.TEXT_HTML)
    @Path("/page")
    public TemplateInstance page() {

        return page.data("fruits", List.of(
                "Apple",
                "Orange",
                "Guava"
        ));
    }
}




/**
 *     @CheckedTemplate
 *     public static class Templates{
 *         public static native TemplateInstance hello(); //template location: templates/DemoResource/hello.html
 *         public static native TemplateInstance list(); //template location: templates/DemoResource/list.html
 *     }
 */