/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The relative order of the elements may be changed.
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

import java.util.ArrayList;

public class RemoveElementFromArray {
    public int removeElement(int[] nums, int target){
        ArrayList<Integer> result = new ArrayList<>();
        if(nums.length > 0){
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i] != target){
                    result.add(nums[i]);
                }
            }
            return result.size();
        }else{
            return 0;
        }
    }

    public int removeElementConstantSpace(int[] nums, int val){
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        RemoveElementFromArray rea = new RemoveElementFromArray();
        int[] nums = {0,1,2,2,3,0,4,2};
        int target = 2;
        rea.removeElement(nums,target);
        rea.removeElementConstantSpace(nums,target);
    }
}
