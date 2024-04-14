import java.util.ArrayList;
import java.util.List;

public class SingleSubsequenceWithSum {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int target = 2;
        printSequenceWithSum(arr, new ArrayList<>(), 0, 0, target);
    }

    public static boolean printSequenceWithSum(int[] arr, List<Integer> result, int index, int sum, int target) {
        if(index >= arr.length) {
            if(sum == target) {
                System.out.println(result);
                return true;
            }
            return false;
        }
        result.add(arr[index]);
        sum += arr[index];
        if(printSequenceWithSum(arr, result, index + 1, sum, target))
            return true;
        sum-= arr[index];
        result.remove(result.size() - 1);
        return printSequenceWithSum(arr, result, index + 1, sum, target);
    }

}
