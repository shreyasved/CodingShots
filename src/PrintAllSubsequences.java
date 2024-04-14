import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printSubsequence(0, arr, new ArrayList<>());
    }

    public static void printSubsequence(int index, int[] inputArr, List<Integer> result) {
        if(index >= inputArr.length) {
            printList(result);
            return;
        }

        result.add(inputArr[index]);
        printSubsequence(index + 1, inputArr, result);
        result.remove(result.size() - 1);
        printSubsequence(index + 1, inputArr, result);
    }

    public static void printList(List<Integer> list) {
        System.out.println(list);
    }

}
