public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,5,6};
        System.out.println(linear(arr,7,0));
    }
    static int linear(int[] arr, int target, int index){
        if(arr[index] == target){
            return index;
        }
        if (index==arr.length-1){
            return -1;
        }
        return linear(arr,target,index+1);
    }
}
