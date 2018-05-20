package com.example.Recursion.BinarySearch;

import java.util.Arrays;


/*
*  interface Dictionary {
*    public Integer get(int index);
*  }
*/

// You do not need to implement the Dictionary interface.
// You can use it directly, the implementation is provided when testing your solution.
public class SearchInUnknownSizedSortedArray {
	public int search(Dictionary dict, int target) {
		// Write your solution here
		if (dict == null) {
			return -1;
		}

		int left = 0;
		int right = 1;

		// find right bound
		while (dict.get(right) != null && dict.get(right) < target) {
			left = right;
			right *= 2;
		}

		return binarySearch(dict, left, right, target);
	}

	private int binarySearch(Dictionary dict, int left, int right, int target) {
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (dict.get(mid) == null ||  dict.get(mid) > target) {
				right = mid - 1;
			} else if (dict.get(mid) < target) {
				left = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public void testSearchInUnknownSizedSortedArray() {
		/*
		 * interface Dictionary { public Integer get(int index); }
		 */

		// You do not need to implement the Dictionary interface.
		// You can use it directly, the implementation is provided when testing your
		// solution.
		SearchInUnknownSizedSortedArray unknown = new SearchInUnknownSizedSortedArray();

		Dictionary dict = new DictImpl(new int[0]);
		int target = 0;
		System.out.println("Expect -1, Actual " + unknown.search(dict, target));

		dict = new DictImpl(new int[] { 1 });
		target = 0;
		System.out.println("Expect -1, Actual " + unknown.search(dict, target));

		dict = new DictImpl(new int[] { 1 });
		target = 1;
		System.out.println("Expect 0, Actual " + unknown.search(dict, target));

		dict = new DictImpl(new int[] { 1, 3, 4, 4, 6, 10, 11, 12, 15, 15 });
		target = 0;
		System.out.println("Expect -1, Actual " + unknown.search(dict, target));

		dict = new DictImpl(new int[] { 1, 3, 4, 4, 6, 10, 11, 12, 15, 15 });
		target = 4;
		System.out.println("Expect 2, Actual " + unknown.search(dict, target));

	}

	interface Dictionary {
		public Integer get(int index);
	}

	private class DictImpl implements Dictionary {
		private int[] array;

		public DictImpl(int[] array) {
			this.array = array;
		}

		@Override
		public Integer get(int index) {
			if (array == null || index >= array.length) {
				return null;
			}
			return array[index];
		}

		@Override
		public String toString() {
			if (array == null) {
				return String.valueOf(null);
			}
			if (array.length <= 10) {
				return Arrays.toString(array);
			}
			StringBuilder sb = new StringBuilder("[");
			for (int i = 0; i < 5; i++) {
				sb.append(array[i]).append("'");
			}
			sb.append("..........");
			for (int i = array.length - 4; i < array.length; i++) {
				sb.append(array[i]);
				if (i != array.length - 1) {
					sb.append("'");
				}
			}
			sb.append("]");
			return sb.toString();
		}
	}
}
