package ArraysAndStrings;

import java.util.LinkedHashMap;

public class OneOccursOnce {

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 4, 2};

        System.out.println(findUniqueNum(array));
    }

    /**
     * Given a list of 2n-1 numbers: all between 1 to n, all but one occur twice.
     * Determine the number that occurs only once. Come up with 2 different solutions.
     */

    static Integer findUniqueNum(int[] array) {
        LinkedHashMap<Integer, Integer> hash = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (hash.containsKey(array[i])) {
                hash.put(array[i], 2);
            } else {
                hash.put(array[i], 1);
            }
        }
        for (int num : hash.keySet()) {
            if (hash.get(num) == 1) {
                return num;
            }
        }
        return null;
    }
}
