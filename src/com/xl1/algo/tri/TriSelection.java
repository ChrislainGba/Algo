package com.xl1.algo.tri;

import java.util.Arrays;

public class TriSelection {
	/**Explication : Le tri par sélection parcourt le tableau, trouve l'élément minimum et l'échange avec l'élément à la position actuelle.
	Résultat de sortie : [11, 12, 22, 25, 34, 64, 90]
	Il convient aux petites tailles de données. Il sélectionne l'élément minimum
	 et l'échange avec l'élément à la première position non triée. 
	 Ce processus se répète pour chaque élément restant. Ce tri n'est pas stable.
	**/

	public static void selectionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] < arr[minIndex]) {
	                minIndex = j;
	            }
	        }
	        int temp = arr[minIndex];
	        arr[minIndex] = arr[i];
	        arr[i] = temp;
	        System.out.println(arr[i]);
	    }
	}

	public static void main(String[] args) {
	    int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};
	    selectionSort(arrayToSort);
	    System.out.println(Arrays.toString(arrayToSort));
	}

}
