package com.example.Recursion.BinarySearch;

public class AtoPowerB {

	public long power(int a, int b) {

		// while a = 0 or 1, the result is always 0 or 1
		if (a == 0) {
			return 0;
		} else if (a == 1) {
			return 1;
		}

		if (b == 0) {
			return 1;
		}
		if (b == 1) {
			return a;
		}
		return a * power(a, b - 1);

	}
}
