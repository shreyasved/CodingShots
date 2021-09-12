import java.util.HashSet;
import java.util.Set;

/*
Given an array, find minimum index of a repeating element,
in linear time and doing just once traversal of the array.

Time : O(n)
Space : O(n)
Input : {5,6,3,4,3,6,4}
Output : 1

*/
public class MinIndexOfRepeatingElement {

    public int findMinIndexOfRepeatingElement(int[] arr){
        int minIndex = -1;
        Set<Integer> uniqueElements = new HashSet<>();
        for (int i = arr.length-1; i >= 0; i--){
            if (uniqueElements.contains(arr[i])){
                minIndex = i;
            }else{
                uniqueElements.add(arr[i]);
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,3,4,3,6,4};
        MinIndexOfRepeatingElement m1 = new MinIndexOfRepeatingElement();
        int index = m1.findMinIndexOfRepeatingElement(arr);
        if(index == -1){
            System.out.println("No repeating element found.");
        }else{
            System.out.println("Min index of repeating element is "+index);
        }
    }

}
