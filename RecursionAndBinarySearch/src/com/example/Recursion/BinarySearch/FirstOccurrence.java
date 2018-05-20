package com.example.Recursion.BinarySearch;

public class FirstOccurrence {
	public int firstOccur(int[] array, int target) {
	    // Write your solution here
	    
	    if (array == null || array.length == 0){
	      return -1;
	    }
	    
	    int left = 0;
	    int right = array.length -1;
	    
	    // Figure out the left bound of target elements
	    // we need to use left < right -1 here to make sure there is no infinite loop.
	    // think about the case when left == right -1
	    // then mid == left, it will be possible picking [mid, right] for the next round
	    // and it will go into an infinite loop in that case
	    while (left < right -1 ){
	    	int mid = left + (right - left)/2;
	      
	    	if (array[mid] < target){
	        left = mid;
	      }
	      else{
	        right = mid;
	      }
	    }
	    
	    // make sure all the possible situations are done
	    // 1. array has only 1 element
	    // 2. array has only 2 element
	    // 3. left == right -1 and left is the result
	    // 4. left == right -1 and right is the result
	    // 5. left == right -1 and none of them is the result
	    if (array[left] == target){
	      return left;
	    }
	    else if (array[right] == target){
	      return right;
	    }
	    else{
	      return -1;
	    }
	    
	  }
}
