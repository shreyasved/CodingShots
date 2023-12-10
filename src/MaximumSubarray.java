/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Input: nums = [5,4,-1,7,8]
Output: 23

*/
public class MaximumSubarray {

    public int getMaxSum(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(sum + nums[i] > sum){
                sum += nums[i];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray ms = new MaximumSubarray();
        ms.getMaxSum(nums);
    }

}
