package org.curso.jakarta.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.curso.jakarta.model.Categoria;
import org.curso.jakarta.service.CategoriaService;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/categoria")
public class CategoriaController {

    @Inject
    private CategoriaService service;

    @GET
    @Produces(APPLICATION_JSON)
    public Response getAll(){
        Object list = service.getList();
        return Response.ok().status(Response.Status.OK).entity(list).build();
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response create(Categoria categoria){
        Categoria c = service.save(categoria);
        return Response.ok().status(Response.Status.OK).entity(c).build();
    }

    @Path("/{id}")
    @GET
    @Produces(APPLICATION_JSON)
    public Response getItem(@PathParam("id") int id){
        Categoria c = service.getCategoria(id);

        if(c == null){
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        }
        return Response.ok().status(Response.Status.OK).entity(c).build();
    }

    @Path("/{id}")
    @DELETE
    public Response deleteItem(@PathParam("id") int id){

        Categoria c = service.getCategoria(id);

        if(c == null){
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        }

        service.delete(id);
        return Response.ok().status(Response.Status.OK).build();
    }

}
