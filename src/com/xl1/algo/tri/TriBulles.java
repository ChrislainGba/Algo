package com.xl1.algo.tri;

import java.util.Arrays;

public class TriBulles {
	
	/**
	 *  Convient principalement à des fins pédagogiques car 
	 *  il n'est pas efficace pour de grandes tailles de données. 
	 *  Il compare et échange les éléments adjacents jusqu'à ce que
	 *  toute la liste soit triée. Ce tri n'est pas stable.
	 * **/
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort: " + Arrays.toString(arr));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};
	    bubbleSort(arrayToSort);
	    System.out.println(Arrays.toString(arrayToSort));

	}

}
