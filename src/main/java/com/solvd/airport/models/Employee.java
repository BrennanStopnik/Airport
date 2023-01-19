package com.solvd.airport.models;

import com.solvd.airport.interfaces.IPerson;

public class Employee implements IPerson {
    private String name;
    private String position;
    private String working;

    public Employee(String empName, String empPosition, String empWorking){
        this.name = empName;
        this.position = empPosition;
        this.working = empWorking;
    }

    public String getName() {
        return name;
    }

    @Override
    public String setName() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public int setAge() {
        return 0;
    }

    @Override
    public String getGender() {
        return null;
    }

    @Override
    public String setGender() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString(){ return this.name + " works as a/an " + this.position + " and is " + this.working + ".";}
}
