package ArraysAndStrings;

import java.util.Arrays;

public class KthLargestElem {

    public static void main(String[] args) {

        int[] array = { 4, 2, 6, 3, 5, -3};
        System.out.println(kthLargestElem(3, array));
    }

    // find the kth largest element in an array

    static int kthLargestElem(int k, int[] array) {
        if (k > array.length) {
            throw new IndexOutOfBoundsException();
        }
        Arrays.sort(array);
        return (array[k - 1]);
    }
}
