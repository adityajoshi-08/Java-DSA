package Arrays;

import java.util.Vector;

//https://leetcode.com/problems/build-array-from-permutation/
public class ArrayfromPermutation {
    public static void main(String[] args) {

    }
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
