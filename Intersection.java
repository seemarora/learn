package com.company.array;

import java.util.Arrays;

public class Intersection {

    public static void intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        intersection(new int[]{8, 4, 6, 3, 0, 3, 5, 7, 9, 2, 2}, new int[]{1, 6, 7, 4, 2, 9, 3, 8});
    }


}
