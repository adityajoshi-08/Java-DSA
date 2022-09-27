package com.aditya.Human;


import java.util.Arrays;

public class Human {

    String name;
    int age;
    int legs = 2;
    static int population;

    public void beat(Human obj){
        System.out.println(this.name + " shouted "+obj.name+"  Madarchod");
    }

    public static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
// 1 2 3 4 5 6 7 8 9
    public static void printarr(int[] arr, int index){
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
        }
    }

    public Human(){
        name = null;
        age = 0;
        legs = 0;
//        population++;
    }

    public Human(String name, int age, int legs){
        this.name = name;
        this.age = age;
        this.legs = legs;
//        population = population +1;
    }

    void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void printArr(int[] arr, int index){
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }

//    polymorphism
// -> Method Overloading
// -> Method Overriding



    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        Human ram = new Human();
        ram.printArr(arr, 3);
    }
}
