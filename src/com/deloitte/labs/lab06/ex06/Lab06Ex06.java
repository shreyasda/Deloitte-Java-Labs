package com.deloitte.labs.lab06.ex06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab06Ex06 {
	public static List<String> getEligibleVoters(Map<String, Integer> people) {
        List<String> eligibleVoters = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String id = entry.getKey();
            int age = entry.getValue();

            if (age > 18) {
                eligibleVoters.add(id);
            }
        }

        return eligibleVoters;
    }
public static void main(String[] args) {
	Map<String, Integer> people = new HashMap<>();
    people.put("01", 20);
    people.put("02", 16);
    people.put("03", 25);
    people.put("04", 17);
    people.put("05", 30);
    
    for(Map.Entry<String, Integer> entry : people.entrySet()) {
    	System.out.println(entry.getKey()+" "+entry.getValue());
    }

    List<String> eligibleVoters = getEligibleVoters(people);

    System.out.println("Eligible Voters' IDs: " + eligibleVoters);
}
}
