package com.vivareal.datesplitter;

import static java.lang.Integer.valueOf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
	Integer numberOfIntervals = valueOf(args[0]);
	
	Scanner sc = new Scanner(System.in);
	ArrayList<String> lines = new ArrayList<>(3000000);
	while(sc.hasNextLine()) {
	    lines.add(sc.nextLine());
	}
	
	List<String> dates = doYourThing(numberOfIntervals, lines);
	
	
    }

    public static List<String> doYourThing(Integer numberOfIntervals, List<String> lines) {
	LinkedList<String> dates = new LinkedList<>();
	
	int stepSize = lines.size() / numberOfIntervals;
	
	for(int i = 0; i < numberOfIntervals; i++ ) {
	    dates.add(lines.get(i * stepSize));
	}
	
	return dates;
    }
}
