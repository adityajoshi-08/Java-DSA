package com.aditya.Room;

public class Kurkure {
    int noOfItems;
    String wrapper;

    void eat(){
        System.out.println("IU made a sound");
    }

    public static void main(String[] args) {
        Kurkure x = new Kurkure();
        x.noOfItems = 50;
        Kurkure y = new Kurkure();
        y.wrapper = "plastic";
    }
}
