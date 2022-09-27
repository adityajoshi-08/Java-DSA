package com.aditya.LL;

public class DLL {

    Node head;
    Node tail;

    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head!= null){
            head.prev = node;
        }
        head = node;
    }



    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void displayprev(){
        Node temp = head;
        Node node = null;
        while (temp != null){
            node = temp;
            temp = temp.next;
        }
        while (node != null){
            System.out.print(node.value + "-->");
            node = node.prev;
        }
        System.out.print("START");
        System.out.println();
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
