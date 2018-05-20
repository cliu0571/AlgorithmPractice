package com.example.MySorting;

abstract class BaseSort<T> {

	public BaseSort(T arr) {
		this.array = arr;
	}
	
	T array;
	
	abstract T doSorting();
	abstract void display();
	
	public T getSortedArr() {
		return this.array;
	}
}
