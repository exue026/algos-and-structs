package ArraysAndStrings;

public class PrintX {

    public static void main(String[] args) {
        printXGivenLen(13);
    }

    //given the side length of a square, print an 'x' with that side length

    static void printXGivenLen(int length) {

        int offset = 0;

        for(int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == offset || j == length - 1 - offset) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i < length / 2) offset++;
            else offset--;
            System.out.println("");
        }
    }
}
