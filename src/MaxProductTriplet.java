import java.util.Arrays;

public class MaxProductTriplet {

    public void findTripletWithMaxProduct(int[] arr){
        int num1 = 0, num2 = 0, num3 = 0;
        Arrays.sort(arr);
        double result = Math.max(arr[0]*arr[1]*arr[arr.length-1], arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]);
        System.out.println(result);
    }

    public static void main(String[] args) {
        //int[] arr = {-4,1,-8,9,6};
        int[] arr = {-8,-7,-6,-5,-4};
        MaxProductTriplet mpt = new MaxProductTriplet();
        mpt.findTripletWithMaxProduct(arr);
    }

}
