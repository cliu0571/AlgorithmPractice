package com.example.MySorting;

import java.util.Arrays;

class QuickSort extends BaseSort<int[]> {

	public QuickSort(int[] arr) {
		super(arr);
	}

	@Override
	int[] doSorting() {
		// Check null;
		if (this.array == null) {
			System.out.println("Array is null!");
			return array;
		}

		quickSort(0, array.length - 1);

		display();
		return this.array;
	}

	private void quickSort(int left, int right) {
		// Check availability
		if (left >= right) {
			return;
		}

		// Find a pivot
		int pivotIndex = findPivoit(left, right);
		quickSort(left, pivotIndex - 1);
		quickSort(pivotIndex + 1, right);

	}

	private int findPivoit(int left, int right) {

		// pick a random one as pivot
		int pivot = left + (int) (Math.random() * (right - left + 1));		
		
		// swap pivot with the end one of array
		swap(pivot, right);
		
		// Start sorting from left to right-1
		int leftCursor = left;
		int rightCursor = right-1;
		
		while (leftCursor <= rightCursor) {
			if (array[leftCursor] < array[right]) {
				leftCursor++;
			}
			else if (array[rightCursor] >= array[right]) {
				rightCursor --;
			}
			else {
				swap(leftCursor++, rightCursor--);
			}
		}
		
		// move the end one back to pivot index
		swap(leftCursor, right);
		
		return leftCursor;
	}
	
	private void swap(int pivot, int right) {
		int temp = array[pivot];
		array[pivot] = array[right];
		array[right] = temp;
	}

	@Override
	void display() {

		System.out.println(Arrays.toString(this.array));

	}

}
