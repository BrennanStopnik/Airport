public class FoodCourt implements IEat {
    private String foodType;
    private String restaurantName;
    private float price;

    public FoodCourt(String food, String place, float foodPrice){
        this.foodType = food;
        this.restaurantName = place;
        this.price = foodPrice;
    }

    public String getFoodType() {
        return this.foodType;
    }

    public String getRestaurant() {
        return this.restaurantName;
    }

    public float getPrice() {
        return this.price;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void setRestaurant(String restaurant) {
        this.restaurantName = restaurant;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void eat(){
        System.out.println("I am eating " + this.foodType + " from " + this.restaurantName + " and it costs $" + this.price);
    }
}
