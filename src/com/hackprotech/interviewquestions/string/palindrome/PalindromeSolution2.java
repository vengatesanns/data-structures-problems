package com.hackprotech.interviewquestions.string.palindrome;

public class PalindromeSolution2 {

    public static boolean checkPalindromeOrNot(String str) {
        for (int left = 0, right = str.length() - 1; left < right; left++, right--) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(PalindromeSolution2.checkPalindromeOrNot("vengat"));
        System.out.println(PalindromeSolution2.checkPalindromeOrNot("madam"));
        System.out.println(PalindromeSolution2.checkPalindromeOrNot("madaaam"));
        System.out.println(PalindromeSolution2.checkPalindromeOrNot("maaadam"));
        System.out.println(PalindromeSolution2.checkPalindromeOrNot("iTopiNonAvevanoNipoti"));
    }
}
