package api;

import java.lang.Integer;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/_health")
public interface _healthResource {
  /**
   * Get Middleware health
   */
  @GET
  @Produces("application/json")
  @Consumes("application/json")
  void generatedMethod1(Integer X_BU);
}
