package minfil;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;

import java.util.Collections;

@Path("/restauranter")
public class RestaurantService {
    private static Map<String, Restaurant> restauranter = new HashMap<String, Restaurant>();
    private static List<Order> orders = new ArrayList<Order>();
    @GET
    @Path("/{restaurantId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Restaurant getRestaurant(@PathParam("restaurantId")String restaurantId){ return restauranter.get(restaurantId); }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Order>getOrders(){
        System.out.println("Returnrerer ordrer: " + orders);
        return orders;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String addOrder(Order order){
        String id = UUID.randomUUID().toString();
        order.setId(id);
        orders.add(order);
        //Collections.sort(orders);
        System.out.println("La til ordre: " + order);
        return id;
    }
}
