package com.fmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Vehicle vehicul = new Vehicle(34, "Ferrari");
        System.out.println(vehicul.accelereaza());
    }
}
