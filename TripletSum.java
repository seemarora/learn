package com.company.array;

import java.util.Arrays;

public class TripletSum {

    public static void FindTriplet(int[] arr, int x) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        FindTriplet(new int[]{1, 5, -6, 6, 5, 12}, 12);
    }
}
