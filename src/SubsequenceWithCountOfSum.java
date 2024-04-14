import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithCountOfSum {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int target = 2;
        System.out.println(printSequenceWithSum(arr, new ArrayList<>(), 0, 0, target));
    }

    public static int printSequenceWithSum(int[] arr, List<Integer> result, int index, int sum, int target) {
        if(index >= arr.length) {
            if(sum == target) {
                System.out.println(result);
                return 1;
            }
            return 0;
        }
        result.add(arr[index]);
        sum += arr[index];
        int left = printSequenceWithSum(arr, result, index + 1, sum, target);
        sum-= arr[index];
        result.remove(result.size() - 1);
        int right = printSequenceWithSum(arr, result, index + 1, sum, target);
        return left + right;
    }

}
