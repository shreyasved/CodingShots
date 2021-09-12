import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers
such that they add up to a specific target.

You may assume that each input would have exactly 1 solution,
and you may not use the same element twice.

Ex. input = [2,7,11,15] target = 9
output = [0,1] as input[0] + input[1] = 2 + 7 = 9

*/
public class TwoSum {

    public void findTarget(int[] arr, int target){
        Map<Integer,Integer> diffMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if(diffMap.containsKey(target - arr[i])){
                System.out.println(i + " " + diffMap.get(target - arr[i]));
                return;
            }else{
                diffMap.put(arr[i],i);
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        TwoSum ts = new TwoSum();
        ts.findTarget(arr,target);
    }

}
