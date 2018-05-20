package com.example.Recursion.BinarySearch;

/*
 * A = {1, 2, 3}, T = 2, return 1
 * A = {1, 4, 6}, T = 3, return 1
 * A = {1, 4, 6}, T = 5, return 1 or 2
 * A = {1, 3, 3, 4}, T = 2, return 0 or 1 or 2
 */
public class ClosestInSortedArray {
	public int closest(int[] array, int target) {
		// Write your solution here

		if (array == null || array.length == 0) {
			return -1;
		}

		int left = 0;
		int right = array.length - 1;

		while (left < right - 1) {
			int mid = left + (right - left) / 2;

			if (array[mid] < target) {
				left = mid;
			} else if (array[mid] > target) {
				right = mid;
			} else {
				return mid;
			}
		}
		
		if (Math.abs(array[left]-target) <= Math.abs(array[right]-target)) {
			return left;
		}
		else {
			return right;
		}

	}
}
