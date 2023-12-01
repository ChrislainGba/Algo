package com.xl1.algo.tri;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TriRapide {
	
	/**
	 *  Il s'agit d'un tri efficace pour de grandes tailles de données. 
	 *  Il choisit un pivot, partitionne la liste autour de ce pivot 
	 *  et récursivement trie les sous-listes. 
	 *  La meilleure utilisation est lorsque la répartition des éléments
	 *  autour du pivot est équilibrée. Ce tri n'est pas stable.
	 * **/
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};
	    quickSort(arrayToSort,0,6);
	    System.out.println(Arrays.toString(arrayToSort));
	    
	    //exemple of Map
	    Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Alice", 30);
        ageMap.put("Ange", 30);
        
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
			String name = entry.getKey();
			Integer age = entry.getValue();
			System.out.println(name + ": " + age + " "+ ageMap.size());
			
			//Queue<String> ordersQueue = new LinkedList<>();
			
		}
	}

}
