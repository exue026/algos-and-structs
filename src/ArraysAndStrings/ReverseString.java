package ArraysAndStrings;

public class ReverseString {

    public static void main(String[] args) {

        String string = "Hello World!";
        string = reverseSubstringInPlace(string);
        System.out.println(string);

    }

    // Reverses a substring in place

    static String reverseSubstringInPlace(String string) {
        char[] array = string.toCharArray();

        for (int i = 0; i < array.length / 2; i++) {
            swap(i, array.length - 1 - i, array);
        }
        return String.valueOf(array);
    }

    static void swap(int index1, int index2, char[] array) {
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
