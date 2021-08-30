package com.hackprotech.interviewquestions.string.reverse;

public class StringReverseSolution1 {


    // vengat - tagnev
    public static String reverse(String originalVal) {
        return new StringBuilder(originalVal).reverse().toString();
    }


    public static void main(String[] args) {
       System.out.println(StringReverseSolution1.reverse("vengat"));
    }
}
