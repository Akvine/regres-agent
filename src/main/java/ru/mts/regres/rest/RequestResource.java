package ru.mts.regres.rest;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import ru.mts.regres.mappers.RequestMapper;
import ru.mts.regres.services.RequestService;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Path("/api/v1/requests")
public class RequestResource {
    @Inject
    RequestService requestService;

    @Inject
    RequestMapper requestMapper;

    @Operation(
            operationId = "findAll",
            summary = "Get requests",
            description = "Get all requests from DB"

    )
    @APIResponse(
            responseCode = "200",
            description = "Requests list has gotten",
            content = @Content(mediaType = MediaType.APPLICATION_JSON)
    )
    @GET
    public Response findAll() {
        return Response.status(200).entity(requestService.findAll()).build();
    }

    @Operation(
            operationId = "findById",
            summary = "Find request",
            description = "Find request by id from DB"
    )
    @APIResponse(
            responseCode = "200",
            description = "Requst has gotten",
            content = @Content(mediaType = MediaType.APPLICATION_JSON)
    )
    @GET
    @Path("/{id}")
    public Response findById(@NotNull
                             @PathParam("id") Long id) {
        return Response.ok(200).entity(requestService.findById(id)).build();
    }

    @Operation(
            operationId = "deleteById",
            summary = "Delete request",
            description = "Delete request by id from DB"
    )
    @APIResponse(
            responseCode = "200",
            description = "Request has deleted",
            content = @Content(mediaType = MediaType.APPLICATION_JSON)
    )
    @DELETE
    @Path("/{id}")
    public Response deleteById(@NotNull
                               @PathParam("id") Long id) {
        return Response.ok(200).entity(requestService.deleteById(id)).build();
    }
}
