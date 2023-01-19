package com.solvd.airport.models;

import com.solvd.airport.interfaces.IStore;

public class FoodCourt implements IStore {
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
    public String getStoreName() {
        return null;
    }

    @Override
    public String setStoreName() {
        return null;
    }

    @Override
    public String getStoreType() {
        return null;
    }

    @Override
    public String setStoreType() {
        return null;
    }

    @Override
    public String getStoreId() {
        return null;
    }

    @Override
    public String setStoreId() {
        return null;
    }

    @Override
    public String getStoreCapacity() {
        return null;
    }

    @Override
    public String setStoreCapacity() {
        return null;
    }

    @Override
    public String getStoreOpen() {
        return null;
    }

    @Override
    public String setStoreOpen() {
        return null;
    }
}
