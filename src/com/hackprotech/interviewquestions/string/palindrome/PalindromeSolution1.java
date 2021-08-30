package com.hackprotech.interviewquestions.string.palindrome;

public class PalindromeSolution1 {

    public static boolean checkPalindromeOrNot(String str) {
        String reversed = "";
        for (int index = str.length() - 1; index >= 0; index--) {
           reversed = reversed.concat(String.valueOf(str.charAt(index)));
        }
        return str.equals(reversed);
    }


    public static void main(String[] args) {
        System.out.println(PalindromeSolution1.checkPalindromeOrNot("vengat"));
        System.out.println(PalindromeSolution1.checkPalindromeOrNot("madam"));
    }
}
