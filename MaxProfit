package com.company.array;

import static com.company.sort.QuickSort.quickSort;

public class MaxProfit {

    public static int maximumProfit(int budget[]) {
        quickSort(budget);
        int maxProfit = budget[0] * budget.length;
        for (int i = 1; i < budget.length; i++) {
            int p = budget[i] * (budget.length - i);
            if (p > maxProfit) {
                maxProfit = p;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maximumProfit(new int[]{24, 78, 90, 15, 67, 1000}));
    }
}
