package com.algorithms;

public class QuickSort {
    public static void main(String[] args) {
    }

    public void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int p = partition(array, start, end);
            quickSort(array, start, p - 1);
            quickSort(array, p + 1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int flag = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] <= flag) {
                swap(array, ++i, j);
            }
        }
        swap(array, i + 1, end);
        return i + 1;
    }

    private void swap(int[] array, int m, int n) {
        int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }
}