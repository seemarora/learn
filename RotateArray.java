package com.company.array;

public class RotateArray {

    public static void reverse(int[] arr, int si, int ei) {
        if (si >= ei) return;
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
        reverse(arr, si + 1, ei - 1);
    }

    public static void rotate(int[] arr, int d) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - 1 - d);
        reverse(arr, arr.length - d, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, -6, 6, 5, 12};
        rotate(arr, 2);
    }
}
