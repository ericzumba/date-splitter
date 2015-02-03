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

    public static LinkedList<String> doYourThing(Integer numberOfIntervals, List<String> lines) {
	LinkedList<String> dates = new LinkedList<>();
	
	int stepSize = lines.size() / numberOfIntervals;

	for(int step = 0; step < numberOfIntervals; step++ ) {
	    int currentIndex = step * stepSize;
	    String currentLine = lines.get(currentIndex);
	    System.out.println("current index " + currentIndex  + " current line " + currentLine);
	    dates.add(currentLine);
	}
	// adds last element
	dates.add(lines.get(lines.size() - 1));
	
	return dates;
    }
}
