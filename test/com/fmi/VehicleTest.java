package com.fmi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Frati on 10/27/2016.
 */
public class VehicleTest {
    Vehicle vehicul;

    @Before
    public void initialize()
    {
        vehicul = new Vehicle(1,"BMW");
    }

    @Test
    public void getSpeed() throws Exception {
        assertEquals(1,vehicul.getSpeed());
    }

    @Test
    public void accelereaza() throws Exception {
        assertEquals(2,vehicul.accelereaza());
    }

}