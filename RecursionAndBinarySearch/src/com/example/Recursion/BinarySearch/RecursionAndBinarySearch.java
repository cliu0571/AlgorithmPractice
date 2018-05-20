package com.example.Recursion.BinarySearch;

import java.util.Arrays;

import com.example.Recursion.BinarySearch.SearchInUnknownSizedSortedArray.*;

public class RecursionAndBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Fibonacci fibo = new Fibonacci();
//		System.out.println(fibo.fibonacci(5));
//		
//		AtoPowerB powerB = new AtoPowerB();
//		System.out.println(powerB.power(2, 3));
//		
//		ClassicalBinarySearch cbs = new ClassicalBinarySearch();
//		System.out.println(cbs.binarySearch(new int[]{0,2,3,6,7,8},8));
//		
//		FirstOccurrence first = new FirstOccurrence();
//		System.out.println(first.firstOccur(new int[]{0,2,2,2,2,3,6,7,8},2));
		
//		LastOccurrence last = new LastOccurrence();
//		System.out.println(last.lastOccur(new int[]{0,2,2,2,2,3,6,7,8},2));
//		
//		ClosestInSortedArray closest = new ClosestInSortedArray();
//		System.out.println(last.lastOccur(new int[]{0,2,2,2,2,3,6,7,8},5));
		
		KClosestInSortedArray kClosest = new KClosestInSortedArray();
		System.out.println(Arrays.toString(kClosest.kClosest(new int[]{1,4,4,6,9,9,12,15},2,3)));
		
		SearchInUnknownSizedSortedArray sol = new SearchInUnknownSizedSortedArray();
		sol.testSearchInUnknownSizedSortedArray();
		
		SearchInSortedMatrixI matrix = new SearchInSortedMatrixI();
		System.out.println(Arrays.toString(kClosest.kClosest(new int[]{1,4,4,6,9,9,12,15},2,3)));
	}
	
	
	
	

}
