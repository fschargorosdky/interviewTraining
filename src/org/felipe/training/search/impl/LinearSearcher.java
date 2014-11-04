package org.felipe.training.search.impl;

import java.util.List;

import org.felipe.training.search.Searcher;

public class LinearSearcher implements Searcher {
	public Boolean search(List<Integer> list, Integer value){
		if(list == null) return false;
		for(Integer element:list){
			if(element == value) return true;
		}
		return false;
	}
}
