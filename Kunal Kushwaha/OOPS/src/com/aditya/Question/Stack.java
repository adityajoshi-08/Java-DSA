package com.aditya.Question;

public class Stack {
    final int size = 10;
    int[] arr = new int[size];
    int last = -1;

    public void push(int value){
        if (last < size -1){
            last++;
//            System.out.println(value +" was pushed successfully at index " + last);
            arr[last] = value;
        }
        else {
            System.out.println("Stack Overflow error");
        }
    }

    public void pop(){
        System.out.println(arr[last] + " was removed");
        arr[last] = 0;
        last--;
    }

    public static void printStack(Stack s){
        for (int i = 0; i <= s.last; i++) {
            System.out.print(s.arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(2);
        s1.push(3);
        s1.push(2);
        s1.push(3);
        s1.push(2);
        s1.push(3);
        s1.push(2);
        s1.push(3);

        printStack(s1);
        System.out.println();
        s1.pop();

        printStack(s1);
    }
}
