package com.solvd.airport.models;

import com.solvd.airport.interfaces.IStore;

public class DutyFree implements IStore {
    private String storeName;
    private boolean open;

    public DutyFree(String storeName, boolean open){
        this.storeName = storeName;
        this.open = open;
    }

    public String getStoreName(){
        return this.storeName;
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

    public boolean isOpen(){
        return this.open;
    }

    public void setStoreName(String storeName){
        this.storeName = storeName;
    }

    public void setOpen(boolean open){
        this.open = open;
    }

    public void openStore(){
        if(this.open){
            System.out.println(this.storeName + " is open!");
        }else{
            System.out.println(this.storeName + " is closed.");
        }
    }

}
