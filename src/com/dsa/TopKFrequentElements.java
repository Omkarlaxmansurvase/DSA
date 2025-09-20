package com.dsa;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {

    }
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        // Count frequencies using HashMap
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        //Create buckets array (index = frequency, value = list of numbers)
        ArrayList<Integer>[] buckets = new ArrayList[n + 1]; // n+1 because max frequency can be n

        for (int i = 0; i <= n; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        // Place numbers in buckets based on their frequency
        for (int num : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(num);
            buckets[frequency].add(num);
        }

        // Collect top k frequent elements from highest frequency buckets
        int[] result = new int[k];
        int index = 0;

        // Start from highest frequency (n) and go down
        for (int freq = n; freq >= 0 && index < k; freq--) {
            for (int num : buckets[freq]) {
                if (index < k) {
                    result[index++] = num;
                }
            }
        }

        return result;
    }
}
