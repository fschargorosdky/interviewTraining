package org.felipe.training.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.felipe.training.search.Searcher;
import org.felipe.training.search.impl.BinarySearcher;
import org.felipe.training.search.impl.LinearSearcher;

public class Main {

	public static void main(String[] args) {
		testBinarySearch();
	}
	public static void testLinearSearch(){
		List<Integer> list = new ArrayList<Integer>();
		Searcher linearSearcher = new LinearSearcher();
		assert !linearSearcher.search(list, 0);
		System.out.println("empty list");
		list.add(1);
		assert linearSearcher.search(list, 1);
		list.add(3);
		list.add(6);
		assert linearSearcher.search(list, 1);
		list.add(9);
		list.add(2);
		assert linearSearcher.search(list, 2);
		assert linearSearcher.search(list, 6);
		assert linearSearcher.search(list, 0);
		System.out.println("done");
	}
	public static void testBinarySearch(){
		List<Integer> list = new ArrayList<Integer>();
		Searcher binarySearcher = new BinarySearcher();
		assert !binarySearcher.search(list, 0);
		list.add(1);
		assert binarySearcher.search(list, 1);
		assert !binarySearcher.search(list, 2);
		assert !binarySearcher.search(list, 3);
		list.add(4);
		assert !binarySearcher.search(list, 0);
		assert binarySearcher.search(list, 1);
		assert !binarySearcher.search(list, 2);
		assert binarySearcher.search(list, 4);
		assert !binarySearcher.search(list, 3);
		assert !binarySearcher.search(list, 5);
		list.add(3);
		list.add(6);
		list.add(9);
		Collections.sort(list);
		assert binarySearcher.search(list, 4);
		assert binarySearcher.search(list, 6);
		assert !binarySearcher.search(list, 0);
		assert binarySearcher.search(list, 9);
		assert !binarySearcher.search(list, 10);
		System.out.println("done");		
	}
}
