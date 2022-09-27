package com.aditya.Inheritance;
import java.util.Scanner;
class Shapes {
    int area;
    int perimeter;
    String color;

    void area(){
        System.out.println("This is general");
    }
}

class Circle extends Shapes{
//    int area;
//    @Override
    void area(){
        System.out.println("pi*r*r");
    }
}

class Square extends Shapes{

}
public class Main{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Shapes s1 = new Shapes();
        c1.area = 54;
        c1.area();
        s1.area();
    }
}
