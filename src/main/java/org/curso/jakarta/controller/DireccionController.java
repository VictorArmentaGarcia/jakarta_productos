package org.curso.jakarta.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.curso.jakarta.model.Direccion;
import org.curso.jakarta.service.DireccionService;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/direccion")
public class DireccionController {

    @Inject
    private DireccionService service;

    @GET
    @Produces(APPLICATION_JSON)
    public Response getAll(){
        Object list = service.getList();
        return Response.ok().status(Response.Status.OK).entity(list).build();
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response create(Direccion direccion){
        Direccion d = service.save(direccion);
        return Response.ok().status(Response.Status.OK).entity(d).build();
    }

    @Path("/{id}")
    @GET
    @Produces(APPLICATION_JSON)
    public Response getItem(@PathParam("id") int id){
        Direccion d = service.getDireccion(id);

        if(d == null){
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        }
        return Response.ok().status(Response.Status.OK).entity(d).build();
    }

    @Path("/{id}")
    @DELETE
    public Response deleteItem(@PathParam("id") int id){

        Direccion d = service.getDireccion(id);

        if(d == null){
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        }

        service.delete(id);
        return Response.ok().status(Response.Status.OK).build();
    }

}
