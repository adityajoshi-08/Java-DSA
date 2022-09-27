package com.aditya;

public class SortedMatrix {
    public static void main(String[] args) {

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart)/2;
            if (matrix[row][mid]== target){
                return new int[]{row, mid};
            }
            if (matrix[row][mid] > target){
                cEnd = mid -1;
            }
            if (matrix[row][mid] < target){
                cStart = mid + 1;
            }


        }
        return new int[]{-1,-1};
    }

    static int[] matrixSearch(int[][] matrix, int target) {
        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cmid = matrix[0].length-1;
        while (rEnd -1 > rStart){
            int rmid = rStart + (rEnd - rStart)/2;
            if (matrix[rmid][cmid] == target){
                return new int[]{rmid,cmid};
            }
            if (matrix[rmid][cmid] > target){
                rStart = rmid;
            }
            if (matrix[rmid][cmid] < target){
                rEnd = rmid;
            }
        }
        return new int[]{-1,-1};
    }
}
