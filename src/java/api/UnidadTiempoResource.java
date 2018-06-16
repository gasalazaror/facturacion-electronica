/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Gabriel
 */
@Path("UnidadTiempo")
public class UnidadTiempoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UnidadTiempoResource
     */
    public UnidadTiempoResource() {
    }

    /**
     * Retrieves representation of an instance of api.UnidadTiempoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        //TODO return proper representation object
        return Response.ok("{\n" +
"    \"glossary\": {\n" +
"        \"title\": \"example glossary\",\n" +
"		\"GlossDiv\": {\n" +
"            \"title\": \"S\",\n" +
"			\"GlossList\": {\n" +
"                \"GlossEntry\": {\n" +
"                    \"ID\": \"SGML\",\n" +
"					\"SortAs\": \"SGML\",\n" +
"					\"GlossTerm\": \"Standard Generalized Markup Language\",\n" +
"					\"Acronym\": \"SGML\",\n" +
"					\"Abbrev\": \"ISO 8879:1986\",\n" +
"					\"GlossDef\": {\n" +
"                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n" +
"						\"GlossSeeAlso\": [\"GML\", \"XML\"]\n" +
"                    },\n" +
"					\"GlossSee\": \"markup\"\n" +
"                }\n" +
"            }\n" +
"        }\n" +
"    }\n" +
"}")
                
                .header("Access-Control-Allow-Origin", "http://localhost:4200/")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD")
                .header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With")
                .build();
    }

    /**
     * PUT method for updating or creating an instance of UnidadTiempoResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
