package org.felipe.training.search.impl;

import java.util.List;

import org.felipe.training.search.Searcher;

public class BinarySearcher implements Searcher{
	public Boolean search(List<Integer> list, Integer value){
		if(list == null) return false;
		
		Integer leftPosition = 0, rightPosition = list.size() - 1;
		while(rightPosition != leftPosition){
			Integer middlePosition = (leftPosition + rightPosition)/2;
			if((leftPosition + rightPosition) % 2 == 0) middlePosition++; 
			Integer middle = list.get(middlePosition);
			if(middle == value){
				return true;
			}else if(middle > value){
				rightPosition = middlePosition - 1;
			}else{
				leftPosition = middlePosition + 1;
			}
		}
		return list.get(leftPosition) == value;
	}	
}
