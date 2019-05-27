package api;

import api.beans.Widget;
import java.lang.String;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/widgets")
public interface WidgetsResource {
  /**
   * Gets a list of all `Widget` entities.
   */
  @GET
  @Produces("application/json")
  @Consumes("application/json")
  List<Widget> getWidgets();

  /**
   * Creates a new instance of a `Widget`.
   */
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  void createWidget(Widget body);

  /**
   * Gets the details of a single instance of a `Widget`.
   */
  @Path("/{widgetId}")
  @GET
  @Produces("application/json")
  @Consumes("application/json")
  Widget getWidget(@PathParam("widgetId") String widgetId);

  /**
   * Updates an existing `Widget`.
   */
  @Path("/{widgetId}")
  @PUT
  @Produces("application/json")
  @Consumes("application/json")
  void updateWidget(@PathParam("widgetId") String widgetId, Widget body);

  /**
   * Deletes an existing `Widget`.
   */
  @Path("/{widgetId}")
  @DELETE
  @Produces("application/json")
  @Consumes("application/json")
  void deleteWidget(@PathParam("widgetId") String widgetId);
}
