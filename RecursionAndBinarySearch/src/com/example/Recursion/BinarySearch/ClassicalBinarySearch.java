package com.example.Recursion.BinarySearch;

public class ClassicalBinarySearch {

	public int binarySearch(int[] array, int a) {
		// Write your solution here
		if (array == null || array.length == 0) {
			return -1;
		}

		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] < a) {
				left = mid + 1;
			} else if (array[mid] > a) {
				right = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}
}
