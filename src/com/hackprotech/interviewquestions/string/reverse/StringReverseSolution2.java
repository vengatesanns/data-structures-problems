package com.hackprotech.interviewquestions.string.reverse;

public class StringReverseSolution2 {


    // vengat - tagnev
    public static String reverse(String originalVal) {
        String reversed = "";
        for (int i=originalVal.length() - 1; i > -1; i--) {
            char c = originalVal.charAt(i);
            reversed += c;
        }
        return reversed;
    }


    public static void main(String[] args) {
       System.out.println(StringReverseSolution2.reverse("vengat"));
    }
}
