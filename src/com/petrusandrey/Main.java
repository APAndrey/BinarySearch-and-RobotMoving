package com.petrusandrey;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int intArr [] = {10, 22, 5, 13, 29, 35, 55, 84};
        Arrays.sort(intArr);
        int intKey = 22;
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
    }
}
