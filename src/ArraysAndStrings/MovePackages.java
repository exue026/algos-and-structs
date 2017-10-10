package ArraysAndStrings;

import java.util.HashMap;

public class MovePackages {

    public static void main(String[] args) {

        int[] array = {4, 1, 2, 5, 3, -1};
        start(array);
        for (int num : array) {
            System.out.println(num);
        }

    }

    /**
     * Suppose you have...
     * N + 1 bins (1, 2, 3,... N + 1)
     * N packages (1, 2, 3,... N)
     * A Robot that can move, pickup a box, and drop a box
     *
     * You can only have one package in a bin, so there will always be an empty bin at any point in time
     * The packages are distributed randomly in the bins initially
     *
     * Implement an algorithm to control the Robot to move the packages to sort the packages such that
     * package 1 is in bin 1, package 2 is in bin 2, etc. (bin N + 1 will be empty at the end)
     */

    public interface Robot {
        void moveTo(int dest);
        int pickUp();
        void dropOff();
    }

    static void start(/*Robot robot, */int[] bins) {
        HashMap<Integer, Integer> binHash = new HashMap<Integer, Integer>();
        int emptyBin = bins.length - 1; // initially, the empty bin is the last one
        for (int i = 0; i < bins.length - 1; i++) {
            binHash.put(bins[i], i);
        }
        for (int i = 0; i < bins.length - 1; i++) {
            /*
            robot.moveTo(i);
            robot.pickUp();
            robot.moveTo(emptyBin);
            robot.dropOff();
            robot.moveTo(binHash.get(i + 1));
            robot.pickUp();
            robot.moveTo(i);
            robot.dropOff();
            */
            if (bins[i] != binHash.get(i + 1)) {
                swap(i, emptyBin, bins);
                swap(i, binHash.get(i + 1), bins);
                emptyBin = binHash.get(i + 1);
                binHash.put(bins[i], i);
                binHash.put(bins[emptyBin], emptyBin);
            }
        }

    }

    static void swap(int index1, int index2, int[] bins) {
        int temp = bins[index1];
        bins[index1] = bins[index2];
        bins[index2] = temp;
    }

}