package com.aditya.LL;

public class Linked_List {
    public class Node{

        int value;
//            ↑___This is value any Node will store
        Node next;
//            ↑___This will store the address of next node

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
