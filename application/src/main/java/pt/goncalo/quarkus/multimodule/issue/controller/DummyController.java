package pt.goncalo.quarkus.multimodule.issue.controller;

import pt.goncalo.quarkus.multimodule.issue.DummyService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Dumb as it gets.
 */
@Path("/dummy")
@Produces(MediaType.APPLICATION_JSON)
public class DummyController {
    private final DummyService service;

    @Inject
    public DummyController(DummyService service) {
        this.service = service;
    }

    @GET
    @Path("/")
    public Response getImplementationName() {
        return Response.status(200).entity(service.getImplementationName()).build();
    }
}
