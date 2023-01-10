package com.solvd.airport.models;

public class Luggage {
    int bagCount;
    int weight;

    public Luggage(int bagCount, int weight) {
        this.bagCount = bagCount;
        this.weight = weight;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Classes.Luggage [bagCount=" + bagCount + ", weight=" + weight + "]";
    }
}
