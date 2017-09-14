package minfil;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/restauranter")
public class RestaurantService {
    private static Map<String, Restaurant> restauranter = new HashMap<String, Restaurant>();

    @GET
    @Path("/restaurantId")
    @Produces(MediaType.APPLICATION_JSON)
    public Restaurant getRestaurant(@PathParam("restaurantId")String restaurantId){
        return restauranter.get(restaurantId);
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Restaurant>getKunder(){
        return restauranter.values();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addKunde(Restaurant restaurant){
        restauranter.put(restaurant.getId(), restaurant);
    }
}
