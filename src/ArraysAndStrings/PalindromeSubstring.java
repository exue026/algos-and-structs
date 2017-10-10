package ArraysAndStrings;

import java.util.HashMap;

public class PalindromeSubstring {

    public static void main(String[] args) {

        String string = "helloworldracecar!";
        System.out.println(lenOfLongestPalindromeSubstring(string));

    }

    // Find the length of the longest palindrome substring in a string

    static int lenOfLongestPalindromeSubstring(String string) {
        int longest = 1;
        for (int i = 0; i < string.length(); i++) {
            for (int j = string.length() - 1; j >= i; j--) {
                if (isPalindrome(string.substring(i, j + 1)) && longest < (j + 1 - i)) {
                    longest = j + 1 - i;
                }
            }
        }
        return longest;
    }

    static boolean isPalindrome(String string) {
        HashMap<Character, Integer> charHash = new HashMap<Character, Integer>();
        for (char c : string.toCharArray()) {
            if (charHash.containsKey(c)) {
                charHash.put(c, charHash.get(c) + 1);
            } else {
                charHash.put(c, 1);
            }
        }

        int numOdds = 0;
        for (int numtimes : charHash.values()) {
            if (numtimes % 2 != 0) {
                numOdds++;
                if (numOdds > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
