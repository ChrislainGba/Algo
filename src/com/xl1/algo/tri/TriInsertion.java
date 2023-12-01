package com.xl1.algo.tri;

import java.util.Arrays;

public class TriInsertion {
	/**Explication : Le tri par insertion construit une liste triée en insérant un élément non trié à sa place appropriée dans la partie triée du tableau.
	Résultat de sortie : [11, 12, 22, 25, 34, 64, 90]
	Ce tri est efficace pour de petites tailles de données
	ou pour des données partiellement triées. 
	Il parcourt la liste et insère chaque élément à la bonne position 
	dans la partie triée précédente de la liste. 
	C'est un tri stable.
	**/

	public static void insertionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 1; i < n; i++) {
	        int key = arr[i];
	        int j = i - 1;
	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j--;
	        }
	        arr[j + 1] = key;
	    }
	}

	public static void main(String[] args) {
	    int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};
	    insertionSort(arrayToSort);
	    System.out.println(Arrays.toString(arrayToSort));
	}


}
