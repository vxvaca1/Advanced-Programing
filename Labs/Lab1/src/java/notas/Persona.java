/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

///@ son anotaciones

/**
 * REST Web Service
 *
 * @author Xavier
 */

@Path("persona")
public class Persona {

    @Context///URI Info
    private UriInfo context;

    /**
     * Creates a new instance of Persona
     */
    public Persona() {
    }

    /**
     * Retrieves representation of an instance of notas.Persona
     * @return an instance of java.lang.String
     */
    @Path("lastname")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    
    public String getPersonaData() {
        ///Lo que queda por hacer
        //TODO return proper representation object
        
        //throw new UnsupportedOperationException();
        return "Hello word from Xavier Vaca";
    }
    
    @Path("{lastname}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)///Si no se establece el producer devuelbe un html
    
    public String getGrade(@PathParam("lastname") String lastname)
    {
        if(lastname.equals("Lascano"))
        {
            return "10/20";
        }
        
        if(lastname.equals("Vaca"))
        {
            return "20/20";
        }else
        {
            return "[ " + lastname + " ] no esta definido en el sistema";
        }
    }
    
    /**
     * PUT method for updating or creating an instance of Persona
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)///lo que debuelve
    public void putText(String content) {
    }
}
