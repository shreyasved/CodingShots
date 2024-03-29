import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlattenArray {

    public static void main(String[] args) {
        Object arr[] = { 1, 2, new Object[] { 4, new int[] { 5, 6 }, 7 }, 10 };
        List<Integer> result = new ArrayList<>();
        System.out.println(getElements(arr, result));
    }

    public static List<Integer> getElements(Object[] arr, List<Integer> result) {
        for (Object o : arr) {
            if(o instanceof Integer) {
                result.add((Integer) o);
            } else if(o instanceof int[]) {
                for (int i : (int[]) o) {
                    result.add(i);
                }
            } else if(o instanceof Object[]) {
                getElements((Object[]) o, result);
            }
        }
        return result;
    }

}
