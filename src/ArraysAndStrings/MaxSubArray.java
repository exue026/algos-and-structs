package ArraysAndStrings;

public class MaxSubArray {

    public static void main(String[] args) {

        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(largestSumInSubArray(array));

    }

    // Find the largest sum in a sub array of an array

    static int largestSumInSubArray(int[] array) {
        int cum = Integer.MIN_VALUE, curr = 0;
        for (int i = 0; i < array.length; i++) {
            curr += array[i];
            if (cum < curr) {
                cum = curr;
            }
            if (curr < 0) {
                curr = 0;
            }
        }
        return cum;
    }
}
