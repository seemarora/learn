package com.company.array;

public class FindUnique {

    public static int findUnique(int[] arr) {
        int unique = arr[0];
        for (int i = 1; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(findUnique(new int[]{1, 3, 5, 4, 3, 4, 1}));
    }
}
