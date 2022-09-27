package com.aditya.LL;

public class LL {


    Node head;
    Node tail;
    int size;

    public LL() {
        this.size = 0;
    }


    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertlast(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        if (head == null){
            head = tail;
        }
        tail.next = null;
        size++;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
    }
        node.next = insertRec(val,--index,node.next);
        return node;
}

    public void insert(int value, int index) {
        if (index == 0){
            insertfirst(value);
        }

        else{
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
            
        }
    }

    public void delete(int index){
        Node temp = head;
        if (index == 0){
            head = head.next;
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public class Node {

        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void removeduplicate(){
        // Question 1 : https://leetcode.com/problems/remove-duplicates-from-sorted-list/

        Node node = head;
        while(node.next != null){
            if (node.value == node.next.value){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public LL mergeTwoLists(LL list1, LL list2) {

        Node node1 = list1.head;
        Node node2 = list2.head;
        LL list3 = new LL();
        Node node3 = list3.head;
        while (node1 != null && node2 != null) {
            if (node1.value < node2.value) {

                node3.next.value = node1.value;
                node3 = node3.next;
                node1 = node1.next;

            } else if (node1.value > node2.value) {

                node3.next.value = node2.value;
                node3 = node3.next;
                node2 = node2.next;

            }

            if (node1.next != null) {
                node3.next = node1.next;
            } else if (node2.next != null) {
                node3.next = node2.next;
            }
        }
        return list3;
    }

    public boolean hasCycle(LL link) {
//        function to check whether the Linked list has a repetition
       /*
        1->2->3->4
           |     |
           5<-4<-
        */
        Node fast = link.head;
        Node slow = link.head;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(LL link){
//        function to return the length of the repeated cycle in the linked list
        Node fast = link.head;
        Node slow = link.head;
        int count = 0;
        while (fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                fast = fast.next;
                count++;
                while(fast != slow){
                    fast = fast.next;
                    count++;
                }
                break;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        // Question 1 : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
        LL link = new LL();
        LL link2 = new LL();

        link.insertfirst(4);
        link.insertfirst(3);
        link.insertfirst(2);
        link.insertfirst(1);link.insertfirst(0);
        link2.insertfirst(9);
        link2.insertfirst(8);
        link2.insertfirst(7);
        link2.insertfirst(6);link2.insertfirst(5);


    }
}
