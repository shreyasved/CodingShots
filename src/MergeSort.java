import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};
        int[] result = sort(arr, 0, arr.length - 1);
        for (int j : result) {
            System.out.print(j);
        }
    }

    public static int[] sort(int[] arr, int low, int high) {
        if(low >= high) {
            return arr;
        }
        int mid = (low + high) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        return merge(arr, low, mid, high);
    }

    public static int[] merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return arr;
    }

}
