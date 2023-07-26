package leetcode;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int first = 2147483647;
        int second = 2147483647;
        for(int i = 0; i < nums.length; i++){
            // System.out.print(" first: " + first);
            // System.out.print(" second: " + second);
            if(nums[i] <= first){
                first = nums[i];
            } else if(nums[i] <= second){
                second = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}