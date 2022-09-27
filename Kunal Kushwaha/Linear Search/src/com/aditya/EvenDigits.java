//https://leetcode.com/problems/find-numbers-with-even-number-of-digits
package com.aditya;//package com.aditya;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {1, 254, 613, 26, 2124, 51, 321, 651};
        int count = 0;
        for (int element : nums) {
            if (iseven(element)) {
                count++;
            }
        }
        System.out.println(count); //while running on IDE
//        return count; // while making submission on leetcode
    }

    static boolean iseven(int num) {
        if (digit(num) % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digit(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num *= -1;
        }
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}