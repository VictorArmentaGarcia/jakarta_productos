package org.curso.jakarta.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.curso.jakarta.model.Producto;
import org.curso.jakarta.service.ProductoService;

import java.util.List;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/producto")
public class ProductosController {

    @Inject
    private ProductoService productoService;

    @GET
    @Produces(APPLICATION_JSON)
    public Response getProductos(){
        List<Producto> list = productoService.getProductos();
        return Response.ok().status(Response.Status.OK).entity(list).build();
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response createProducto(Producto producto){
        Producto p = productoService.save(producto);
        return Response.ok().status(Response.Status.OK).entity(p).build();
    }

    @Path("/{id}")
    @GET
    @Produces(APPLICATION_JSON)
    public Response getProducto(@PathParam("id") int id){
        Producto p = productoService.getProductoByID(id);

        if(p == null){
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        }
        return Response.ok().status(Response.Status.OK).entity(p).build();
    }

    @Path("/{id}")
    @DELETE
    public Response deleteProducto(@PathParam("id") int id){

        Producto p = productoService.getProductoByID(id);

        if(p == null){
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        }

        productoService.deleteById(id);
        return Response.ok().status(Response.Status.OK).build();
    }


}
