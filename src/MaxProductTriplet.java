import java.util.Arrays;

/*
Given an array, find a triplet having maximum product in the array.
Time : O(nlog(n))
Space : O(1)
Input : {-4,1,-8,9,6}
Output : {-4,-8,9}
*/

public class MaxProductTriplet {

    public void findTripletWithMaxProduct(int[] arr){
        int num1 = 0, num2 = 0, num3 = 0;
        Arrays.sort(arr);
        double result = arr[0]*arr[1]*arr[arr.length-1];
        double result1 = arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
        if(result > result1){
            System.out.println(arr[0] + " " + arr[1] + " " + arr[arr.length-1]);
        }else{
            System.out.println(arr[arr.length-1] + " " + arr[arr.length-2] + " " + arr[arr.length-3]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-4,1,-8,9,6};
        //int[] arr = {-8,-7,-6,-5,-4};
        MaxProductTriplet mpt = new MaxProductTriplet();
        mpt.findTripletWithMaxProduct(arr);
    }

}
