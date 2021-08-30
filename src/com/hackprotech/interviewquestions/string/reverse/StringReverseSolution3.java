package com.hackprotech.interviewquestions.string.reverse;

public class StringReverseSolution3 {


    // vengat - tagnev
    public static String reverse(String originalVal) {
        char[] charArray = originalVal.toCharArray();
        for (int left = 0, right = charArray.length - 1; left < right; left++, right--) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }
        return String.valueOf(charArray);
    }


    public static void main(String[] args) {
        System.out.println(StringReverseSolution3.reverse("vengat"));
        System.out.println(StringReverseSolution3.reverse("Hello"));
        System.out.println(StringReverseSolution3.reverse("Madam"));
    }
}
