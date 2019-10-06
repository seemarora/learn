package com.company.array;

public class FindDuplicate {

    public static int findDuplicate(int[] arr) {
        int length = arr.length;
        int sum = ((length - 2) * (length - 1)) / 2;
        int arraySum = 0;
        for (int i = 0; i < length; i++) {
            arraySum += arr[i];
        }
        return arraySum - sum;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{0, 1, 2, 3, 4, 5, 5}));
    }
}
