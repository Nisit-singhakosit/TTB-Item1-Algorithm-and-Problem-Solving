package com.interview;

public class ClosestValue {
    public static void main(String[] args) {
        int[] arr = new int[1000001];
        for (int i = 0; i <= 1000000; i++) {
            arr[i] = i;
        }

        int target = 90000;
        int closestValue = findClosest(arr, target);
        System.out.println("ค่าที่ใกล้เคียง " + target + " คือ " + closestValue);
    }

    public static int findClosest(int[] arr, int target) {
        int n = arr.length;

        // Binary Search
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (Math.abs(arr[low] - target) < Math.abs(arr[high] - target)) {
            return arr[low];
        } else {
            return arr[high];
        }
    }
}
