package com.arrays.example;

import java.util.List;
import java.util.stream.Stream;

public class DivisibleSumPairsArray {

    public static void main(String[] args) {
        List<Integer> list = Stream.of(1,3,2,6,1,2).toList();
        int n = list.size();
        int k = 3;

        int res = divisibleSumPairs(n, k, list);

        System.out.println("Result :: "+res);
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        int[] arr = ar.stream().mapToInt(Integer::intValue).toArray();
        for(int i = 0 ; i < n-1; i++){
            for(int j = i+1 ; j < n; j++) {
                if ((arr[i] + arr[j]) % k == 0)
                    count++;
            }
        }
        return count;
    }
}
