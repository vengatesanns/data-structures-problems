package com.hackprotech.interviewquestions.string.palindrome;

public class PalindromeSolution2 {

    public static boolean checkPalindromeOrNot(String str) {
        char[] charArray = str.toCharArray();
        for (int left = 0, right = charArray.length - 1; left < right; left++, right--) {
            if (Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right])) {
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
