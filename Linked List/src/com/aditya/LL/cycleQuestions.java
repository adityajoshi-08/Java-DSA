package com.aditya.LL;

public class cycleQuestions {

    public ListNode locateCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = fast.next;
                length++;
                while (fast != slow) {
                    fast = fast.next;
                    length++;
                }
                break;
            }
        }


        if (length == 0) {
            return null;
        }

//        find the start node from here
        ListNode first = head;
        ListNode second = head;
        while (length > 0) {
            second = second.next;
            length--;
        }

        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return first;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = square(slow);
            fast = square(square(fast));
        }while(fast!=slow);

        if (slow == 1){
            return true;
        }
        return false;
    }
    private int square(int n){
        int sum = 0;
        int num;
        while(n>0){
            num = n/10;
            sum += num * num;
            n/=10;
        }
    return sum;
    }


    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode() {
        }

        public ListNode middleNode(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;

        }
    }
}