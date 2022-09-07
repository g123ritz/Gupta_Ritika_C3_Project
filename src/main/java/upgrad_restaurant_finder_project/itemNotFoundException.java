package upgrad_restaurant_finder_project;
public class itemNotFoundException extends Throwable {
    public itemNotFoundException(String itemName) {
        super(itemName);
    }
}
