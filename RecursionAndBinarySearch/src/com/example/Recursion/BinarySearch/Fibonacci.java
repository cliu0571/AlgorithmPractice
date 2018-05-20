package com.example.Recursion.BinarySearch;

public class Fibonacci {

	public int fibonacci(int k) {
		if (k <= 0) {
			return 0;
		}
		if (k == 1) {
			return 1;
		}
		return fibonacci(k - 1) + fibonacci(k - 2);
	}

	// solution with O(n) space.
	public int fibonacci_II(int k) {
		if (k <= 0) {
			return 0;
		}
		int[] array = new int[k + 1];
		// array[0] = 0; no needed->k=0 is returned above
		array[1] = 1;
		for (int i = 2; i <= k; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}

		return array[k];
	}

	// solution with O(1) space
	public int fibonacci_III(int k) {
		if (k <= 0) {
			return 0;
		}
		int a = 0;
		int b = 1;
		while (k > 1) {
			int temp = a+b;
			a=b;
			b=temp;
			k--;
		}
		return b;
	}

}
