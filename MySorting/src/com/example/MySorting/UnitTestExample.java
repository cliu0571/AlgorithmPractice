package com.example.MySorting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTestExample {
	
	BaseSort<int[]> mySort;
	
	@Before
	public void setUp() throws Exception {
		int[] array = new int[] {0,5,6,1,4,7,3,9,8,2};
		mySort = new SelectionSort(array);
	}

	@Test
	public void test() {
		mySort.doSorting();
		Assert.assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, mySort.getSortedArr());
		//fail("Not yet implemented");
	}

}
