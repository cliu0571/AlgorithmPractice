package com.example.MySorting;

import java.util.Arrays;

public class MoveZerosToEnd extends BaseSort<int[]> {

	public MoveZerosToEnd(int[] arr) {
		super(arr);
	}

	@Override
	int[] doSorting() {
		// Check Null
		if (array == null || array.length == 0) {
			return array;
		}

		int leftCursor = 0;
		int rightCursor = array.length - 1;

		while (leftCursor <= rightCursor) {
			if (array[leftCursor] != 0) {
				leftCursor++;
			} else if (array[rightCursor] == 0) {
				rightCursor--;
			} else {
				// swap leftCursor and rightCursor
				// cursors move 1 toward each other
				int temp = array[leftCursor];
				array[leftCursor] = array[rightCursor];
				array[rightCursor] = temp;
				leftCursor++;
				rightCursor--;
			}
		}

		display();
		return array;
	}

	@Override
	void display() {

		// Check null;
		if (array == null) {
			System.out.println("Array is null!");
			return;
		}

		System.out.println(Arrays.toString(array));

	}

}
