package com.example.MySorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 3, 5, 7, 9, 8, 6, 4, 2, 0 };
		
		BaseSort<int[]> mySort = new SelectionSort(arr);
		mySort.doSorting();

		mySort = new MergeSort(arr);
		mySort.doSorting();

		mySort = new QuickSort(arr);
		mySort.doSorting();

		int[] arrZero = new int[] { 1, 0, 5, 7, 0, 0, 6, 4, 2, 0 };
		mySort = new MoveZerosToEnd(arrZero);
		mySort.doSorting();

		int[] arrRainbow = new int[] { 0, 1, -1, 0, 1, -1, 0, 0, -1, 1, 1, 0, -1 };
		mySort = new RainbowSort(arrRainbow);
		mySort.doSorting();

	}

}
