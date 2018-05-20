package com.example.MySorting;

import java.util.Arrays;

public class RainbowSort extends BaseSort<int[]> {

	public RainbowSort(int[] arr) {
		super(arr);
	}

	@Override
	int[] doSorting() {

		//Check null or empty
		if (array == null || array.length == 0) {
			return array;
		}
		
		int negativeCursor = 0;
		int positiveCursor = array.length-1;
		int activeCursor = 0;
		
		while (activeCursor <= positiveCursor) {
			if (array[activeCursor] == -1) {
				//negCursor moves 1 right
				swap(activeCursor++, negativeCursor++);
			}
			else if (array[activeCursor] == 1) {
				// move to end, and positiveCursor moves 1 left
				swap(activeCursor, positiveCursor--);
			}
			else {
				// it is 0, activeCursor moves 1 right
				activeCursor ++;
			}
		}

		
		display();
		return array;
	}
	
	void swap(int left, int right){
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
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
