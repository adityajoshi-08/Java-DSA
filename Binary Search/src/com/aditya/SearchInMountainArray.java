//package com.aditya;
//
//public class SearchInMountainArray {
//    public static void main(String[] args) {
//        int[] arr = {11,22,33,44,55,66,5,4,3,2,1};
//        System.out.println(ans(arr,Arr[peak(mountainArr)]){
//            end = peak(mountainArr)-1;
//        }else if (target>mountainArr[peak(mountainArr)]){
//            start = peak(mountainArr)+1;
//        }else{
//            return peak(mountainArr);
//        }
//        while (end >= start) {
//            int mid = start + (end - start) / 2;
//            if (target < mountainArr[mid]) {
//                end = mid - 1;
//            } else if (target > mountainArr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//    static int peak(int[] mountainArr) {
//        int start = 0;
//        int end = mountainArr.length-1;
//        if (mountainArr[mountainArr.length-1]>mountainArr[mountainArr.length-2]){
//            return mountainArr.length-1;
//        }
//        while (end >= start) {
//            int mid = start + (end - start) / 2;
//
//            if (mid <= mountainArr.length-1){
//                if (mountainArr[mid] > mountainArr[mid+1]) {
//                    if (mountainArr[mid]>mountainArr[mid-1]){
//                        return mid;
//                    }else if(mountainArr[mid]<mountainArr[mid-1]){
//                        end = mid-1;
//                    }
//                } else if (mountainArr[mid] < mountainArr[mid+1]) {
//                    start = mid + 1;
//                } else {
//                    return mid;
//                }
//            }
//        }
//        return -1;
//    }
//}
