package com.fmi;

/**
 * Created by Frati on 10/27/2016.
 */
public class Vehicle {
    private int speed;
    private String name;

    public Vehicle(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }


    public int getSpeed()
    {
        return this.speed;
    }


    public int accelereaza()
    {
        return speed+1;
    }

}
