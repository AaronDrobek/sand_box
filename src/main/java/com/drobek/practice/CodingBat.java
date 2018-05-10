package com.drobek.practice;

public class CodingBat {

    //    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
//    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place 
//    in both strings.
//  1.)----------------------------------------------------
//    public static void stringClass(String a, String b) {
//        int len = Math.min(a.length(), b.length());
//        int count = 0;
//
//        for (int index = 0; index < len - 1; index++) {
//            String aSub = a.substring(index, index + 2);
//            String bSub = b.substring(index, index + 2);
//            System.out.println("this is substring before the if: " + aSub + " " + bSub);
//            if (aSub.equals(bSub)) {
//                count++;
//                System.out.println("this is aSub & bSub " + aSub + " " + bSub);
//            }
//        }
//        System.out.println("this is how many groups of '2' these strings have in common: " + count);
//    }
//----------------------------------------------------------------------
}
