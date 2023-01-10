package com.solvd.airport.models;

public abstract class Gate extends Airplane {
    private String gateNumber;
    private String gateType;
    private String gateStatus;

    public Gate(int capacity, int tailNumber, String gateNumber, String gateType, String gateStatus){
        super(capacity, tailNumber);
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
    }

    public String getGateNumber(){
        return this.gateNumber;
    }

    public String getGateType(){
        return this.gateType;
    }

    public String getGateStatus(){
        return this.gateStatus;
    }

    public void setGateNumber(String gateNumber){
        this.gateNumber = gateNumber;
    }

    public void setGateType(String gateType){
        this.gateType = gateType;
    }

    public void setGateStatus(String gateStatus){
        this.gateStatus = gateStatus;
    }

    @Override
    public String toString(){
        return "Classes.Gate Number: " + this.gateNumber + " Classes.Gate Type: " + this.gateType + " Classes.Gate Status: " + this.gateStatus;
    }
}
