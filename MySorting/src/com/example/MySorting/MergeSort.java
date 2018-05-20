package com.example.MySorting;

import java.util.Arrays;

class MergeSort extends BaseSort<int[]> {

	public MergeSort(int[] arr) {
		super(arr);
	}

	@Override
	int[] doSorting() {
		// Check null of empty...
		if (this.array == null || this.array.length == 0)
			return this.array;

		sort(0, this.array.length - 1);

		display();
		return this.array;
	}

	private void sort(int left, int right) {
		// Check if left == right then return
		if (left >= right)
			return;

		int mid = (left + right) / 2;

		sort(left, mid);
		sort(mid + 1, right);

		merge(left, mid, right);
	}

	private void merge(int left, int mid, int right) {
		int[] temp = new int[this.array.length];		
		int rightIndex = mid+1;
		int tempIndex = left;
		int leftIndex = left;
		
		while (left<=mid && rightIndex <= right) {
			if (array[left] <= array[rightIndex]) {
				temp[tempIndex++] = array[left++];
			}			
			else {
				temp[tempIndex++] = array[rightIndex++];
			}
		}
		
		while(left<=mid) {
			temp[tempIndex++] = array[left++];
		}
		
		while(rightIndex <= right) {
			temp[tempIndex++] = array[rightIndex++];
		}
		
		while(leftIndex <= right) {
			array[leftIndex] = temp[leftIndex];
			leftIndex++;
		}
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
