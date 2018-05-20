package com.example.Recursion.BinarySearch;

/*
 * A = {1, 2, 3}, T = 2, K = 3, return {2, 1, 3} or {2, 3, 1}
 * A = {1, 4, 6, 8}, T = 3, K = 3, return {4, 1, 6}
 */
public class KClosestInSortedArray {
	public int[] kClosest(int[] array, int target, int k) {
		// Write your solution here

		if (array == null || array.length == 0) {
			return array;
		}

		if (k == 0) {
			return new int[0];
		}

		int left = findClosestElement(array, target);
		int right = left + 1;

		int[] result = new int[k];

		for (int i = 0; i < k; i++) {
			if (right >= array.length
					|| left >= 0 && Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
				result[i] = array[left--];
			} else {
				result[i] = array[right++];
			}
		}
		return result;
	}

	// find the largest smaller or equal element's index
	private int findClosestElement(int[] array, int target) {

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

		if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
			return left;
		} else {
			return right;
		}
	}
}
