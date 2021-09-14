/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

import java.util.ArrayList;

public class DuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int walker = 0;
        for (int i = walker+1; i < nums.length && walker < nums.length; i++) {
            if(nums[walker] != nums[i]){
                result.add(nums[walker]);
                walker += i;
            }
        }
        result.add(nums[walker]);
        for (int i = 0; i < walker; i++) {
            nums[i] = result.get(i);
        }
        System.out.println(walker);
        return walker;
    }

    public int removeDuplicatesConstantSpace(int[] nums){
        if(nums.length > 0){
            int j = 0;
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i] != nums[i+1])
                    nums[j++] = nums[i];
            }
            nums[j++] = nums[nums.length-1];
            System.out.println(j);
            return j;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        DuplicatesSortedArray dsa = new DuplicatesSortedArray();
        int[] nums = {1,1,2};
        dsa.removeDuplicates(nums);
        dsa.removeDuplicatesConstantSpace(nums);
    }

}
