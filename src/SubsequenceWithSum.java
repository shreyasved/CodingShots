import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSum {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int target = 2;
        printSequenceWithSum(arr, new ArrayList<>(), 0, 0, target);
    }

    public static void printSequenceWithSum(int[] arr, List<Integer> result, int index, int sum, int target) {
        if(index >= arr.length) {
            if(sum == target) {
                System.out.println(result);
            }
            return;
        }
        result.add(arr[index]);
        sum += arr[index];
        printSequenceWithSum(arr, result, index + 1, sum, target);
        sum-= arr[index];
        result.remove(result.size() - 1);
        printSequenceWithSum(arr, result, index + 1, sum, target);
    }

}
