package com.xl1.algo.filter;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FilterDuplicates {
	
	public static int[] filterDuplicates(int[] data) {
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();
        
        // Add elements to the LinkedHashSet, which will automatically remove duplicates
        for (int value : data) {
            uniqueElements.add(value);
        }
        
        // Convert the LinkedHashSet back to an int array while preserving the order
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int value : uniqueElements) {
            result[index++] = value;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 1, 3, 2, 5, 7, 1, 6, 7};
        int[] uniqueData = filterDuplicates(data);

        // Print the unique elements while preserving the order
        System.out.println(Arrays.toString(uniqueData));
        System.out.println(uniqueData.length);
    }
	

}
