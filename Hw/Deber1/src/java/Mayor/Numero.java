/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mayor;

import javax.jws.WebParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author acvp_
 */
@Path("numero")
public class Numero {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Numero
     */
    public Numero() {
    }

    /**
     * Retrieves representation of an instance of Mayor.Numero
     * @return an instance of java.lang.String
     */
    @Path("{num1}/{num2}/{num3}")
    @GET       
    @Produces(MediaType.TEXT_PLAIN)   
    public String getGrades(@PathParam("num1")String num1 ,@PathParam("num2")String num2,@PathParam("num3")String num3)
    {        
       try
       {      
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);       
        int n3 = Integer.parseInt(num3);       
      /*  if (n1 > n2){
            if (n1 > n3) {
                return "n1 " ;
            } else {
                return "n3 " ;
            }
        } if (n2 > n3) {
            return "n2 " ;
        }else {
            return "n3 " ;
        }
       }catch(Exception e) 
       {
           return "no es valido";
       }*/            
       if(n1 > n2 && n1 > n3){
        return "n1";
        }else{
            if(n2 > n1 && n2 > n3){
            return "n2";
            }else{
            return "n3";
            }
        }     
      }catch(Exception e) 
       {
           return "no es valido";
       }        
    }
    /**
     * PUT method for updating or creating an instance of Numero
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
