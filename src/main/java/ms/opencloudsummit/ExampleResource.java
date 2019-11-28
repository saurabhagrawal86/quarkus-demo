package ms.opencloudsummit;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello OSS SUMMIT 2019";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String helloPOST() {
        return "Hello OSS SUMMIT 2019 - POST testing";
    }
}
