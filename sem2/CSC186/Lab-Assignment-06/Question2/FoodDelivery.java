public class FoodDelivery extends Service {
    private String restaurantName;
    private String restaurantLocation;
    private String orderDetail;

    public FoodDelivery() {
        super();
        this.restaurantName = null;
        this.restaurantLocation = null;
        this.orderDetail = null;
    }

    public FoodDelivery(String customerName, String customerLocation, String paymentType, int totalAmount, String orderTime, String restaurantName, String restaurantLocation, String orderDetail) {
        super(customerName, customerLocation, paymentType, totalAmount, orderTime);
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.orderDetail = orderDetail;
    }

    /* Setters */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }
    /* Setters */

    /* Getters */
    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public String getOrderDetail() {
        return orderDetail;
    }
    /* Getters */

    public double calculateProfit() {
        if (totalAmount > 100 && paymentType.equalsIgnoreCase("Cash")) {
            return totalAmount * 0.30;
        }

        return totalAmount * 0.20;
    }

    public String toString() {
        return super.toString() +
               "\nRestaurant Name: " + restaurantName +
               "\nRestaurant Location: " + restaurantLocation +
               "\nOrder Detail: " + orderDetail;
    }
}
