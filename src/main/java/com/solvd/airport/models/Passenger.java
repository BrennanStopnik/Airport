package com.solvd.airport.models;


import com.solvd.airport.interfaces.IPerson;

public class Passenger implements IPerson {
    private String name;
    private String gender;
    private int age;
    private boolean assistance;
    private boolean guardian;
    private boolean security;

    public Passenger(String passName, String mOrF, int whatAge, boolean needsAssistance, boolean guardianPresent, boolean passedSec ) {
        this.name = passName;
        this.gender = mOrF;
        this.age = whatAge;
        this.assistance = needsAssistance;
        this.guardian = guardianPresent;
        this.security = passedSec;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public java.lang.String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public void setAssistance(boolean assistance) {
        this.assistance = assistance;
    }
    public boolean getAssistance(){
        return assistance;
    }

    public void setGuardian(boolean guardian) {
        this.guardian = guardian;
    }
    public boolean getGuardian(){
        return guardian;
    }

    public void setSecurity(boolean security) {
        this.security = security;
    }
    public boolean getSecurity(){
        return security;
    }

    @Override
    public String toString() { return " Classes.Passenger name: " + this.name + "\n Sex: " + this.sex + "\n Age: " + this.age + "\n Needs assistance: " + this.assistance + "\n Has a guardian: " + this.guardian + "\n Passed security: " + this.security;}
}
