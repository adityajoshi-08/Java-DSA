package com.aditya.LL;

public class Main {
    public static void main(String[] args) {
//        LL link = new LL();
//        link.insertfirst(1);
//        link.insertfirst(2);
//        link.insertfirst(3);
//        link.insert(5,2);
//        link.delete(0);
//        link.display();

        LL dl = new LL();
        dl.insertfirst(1);
        dl.insertfirst(2);
        dl.insertfirst(3);
        dl.insertfirst(4);
        dl.insertRec(5,3);
        dl.display();
        int n1 = 5;

    }
}
