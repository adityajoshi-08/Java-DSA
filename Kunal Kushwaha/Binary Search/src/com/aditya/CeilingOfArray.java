package com.aditya;

import java.util.Scanner;

public class CeilingOfArray {

        public static void main(String[] args) {
            int[] arr = {1,2,3,5,10,11,15,19,25,29};
            Scanner in = new Scanner(System.in);
//            System.out.print("Which element do you want to find? ");
//            int target = in.nextInt();
            System.out.println("Element found at " + index(arr, 18) + " index");
        }

        //return the index
        static int index(int[] arr, int target) {
            int start = 0;
            int end = arr.length;
            if (arr[0] < arr[arr.length - 1]) {
                while (end >= start) {
                    int mid = start + (end - start) / 2;
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else if (target > arr[mid]) {
                        start = mid + 1;
                    } else {
                        return mid;
                    }
                }

            }
            else if(arr[0]>arr[arr.length-1]){
                while (end >= start) {
                    int mid = start + (end - start) / 2;
                    if (target < arr[mid]) {
                        start = mid + 1;
                    } else if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        return mid;
                    }
                }
            }
            return start;
        }
    }


