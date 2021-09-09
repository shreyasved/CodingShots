import java.util.HashSet;
import java.util.Set;

/*
Given an array having elements between 0 to 31,
find elements which occurs odd number of times
--without using extra space.

Time : O(n)
Space : O(1)
Input : {5,8,2,5,8,2,8,5,1,8,2}
Output : 5,2,1
*/

public class OddCountElement {
    public void printOddCountElement(int[] arr) {
        Set<Integer> oddElementSet = new HashSet<>();
        for (int i: arr) {
            if(oddElementSet.contains(i)){
                oddElementSet.remove(i);
            }else{
                oddElementSet.add(i);
            }
        }
        System.out.println(oddElementSet);
    }

    public void printOddCountElementConstantSpace(int[] arr) {
        int xor = 0;
        for (int i : arr){
            xor ^= (1 << i);
        }

        for (int i: arr) {
            if((xor & (1 << i)) != 0 ){
                System.out.print(i + " ");
                xor ^= (1 << i);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,8,2,5,8,2,8,5,1,8,2};
        OddCountElement oce = new OddCountElement();
        oce.printOddCountElement(arr);
        oce.printOddCountElementConstantSpace(arr);
    }

}
