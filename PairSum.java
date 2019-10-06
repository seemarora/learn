package com.company.array;

public class PairSum {

    public static void pairSum(int[] arr, int num){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    int a, b;
                    if (arr[i] < arr[j]) {
                        a = arr[i];
                        b = arr[j];
                    } else {
                        a = arr[j];
                        b = arr[i];
                    }
                    System.out.println(a + " " + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        pairSum(new int[]{1, 5, -6, 6, 5, 12}, 6);
    }
}
