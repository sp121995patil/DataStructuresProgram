package com.stream.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArray {
    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {5, 1, 9, 3, 7};
        int[] array2 = {8, 2, 7, 4, 1};

        // Merge, remove duplicates, sort and collect
        int[] result = Stream.concat(Arrays.stream(array1).boxed(), Arrays.stream(array2).boxed())
                .distinct()  // Remove duplicates
                .sorted()// Sort the elements
                .mapToInt(Integer::intValue)
                .toArray();  // Collect into an array

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}

