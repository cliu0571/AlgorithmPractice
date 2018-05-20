package com.example.MySorting;

import java.util.Arrays;

class SelectionSort extends BaseSort<int[]> {

	public SelectionSort(int[] arr) {
		super(arr);
	}

	@Override
	int[] doSorting() {

		// Check input value if null or empty...
		if (this.array == null || this.array.length == 0)
			return array;

		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}

		display();

		return this.array;
	}

	@Override
	void display() {
		// Check null;
		if (this.array == null) {
			System.out.println("Array is null!");
			return;
		}

		System.out.println(Arrays.toString(this.array));
	}

}
