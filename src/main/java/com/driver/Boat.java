package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    @Override
    public String getVehicleName(){
        return this.name=name;
    }

    @Override
    public int getVehicleCapacity(){
        return this.capacity=capacity;
    }

}
