package ru.mts.regres.rest;

import ru.mts.regres.services.ReasonService;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Path("/api/v1/reasons")
public class ReasonResource {
    @Inject
    ReasonService reasonService;

    @GET
    public Response findAll() {
        return Response.status(200).entity(reasonService.findAll()).build();
    }

    @GET
    @Path("/{id}")
    public Response findById(Long id) {
        return Response.status(200).entity(reasonService.findById(id)).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteById(Long id) {
        return Response.status(200).entity(reasonService.deleteById(id)).build();
    }
}
