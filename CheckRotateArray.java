package com.company.array;

public class CheckRotateArray {

    public static int arrayRotateCheck(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                result = i + 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(arrayRotateCheck(new int[]{3, 4, 5, 6, 1, 2}));
    }
}
