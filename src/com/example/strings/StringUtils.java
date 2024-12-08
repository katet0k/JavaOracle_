package com.example.strings;

public class StringUtils {

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static int countVowels(String str) {
        return (int) str.chars().filter(c -> "AEIOUaeiou".indexOf(c) != -1).count();
    }

    public static int countConsonants(String str) {
        return (int) str.chars().filter(c -> "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(c) != -1).count();
    }

    public static int countWordOccurrences(String str, String word) {
        return (str.split(word, -1).length) - 1;
    }
}

