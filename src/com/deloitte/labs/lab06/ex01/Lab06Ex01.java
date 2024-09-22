package com.deloitte.labs.lab06.ex01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab06Ex01 {
	public static List<Integer> getSortedValues(HashMap<String, Integer> map) {
        Collection<Integer> values = map.values();
        
        List<Integer> sortedValues = new ArrayList<>(values);
        
        Collections.sort(sortedValues);
        
        return sortedValues;
    }
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<>();
    map.put("Shreyas", 50);
    map.put("Vadiraj", 25);
    map.put("Anirudh", 75);
    map.put("krupal", 40);

    List<Integer> sortedValues = getSortedValues(map);

    System.out.println("Sorted values: " + sortedValues);
}
}
