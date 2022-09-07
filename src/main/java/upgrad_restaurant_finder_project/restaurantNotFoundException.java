package upgrad_restaurant_finder_project;
public class restaurantNotFoundException extends Throwable {
    public restaurantNotFoundException(String restaurantName) {
        super(restaurantName);
    }
}
