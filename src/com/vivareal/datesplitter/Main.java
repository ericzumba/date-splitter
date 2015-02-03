package com.vivareal.datesplitter;

import static java.lang.Integer.valueOf;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
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
	
	List<String> dates = doYourThing(numberOfIntervals, lines, new DropId(new FormatAsZuluTime()));
	
	PrintStream out = new PrintStream(System.out);
	for (int i = 0; i < dates.size() - 1; i++) {
	    out.print(dates.get(i) + ",");
	}
	out.println(dates.get(dates.size() - 1));
	
    }
    public static LinkedList<String> doYourThing(Integer numberOfIntervals, List<String> lines, Function<String, String> function) {
	LinkedList<String> dates = new LinkedList<>();
	
	int stepSize = lines.size() / numberOfIntervals;

	for(int step = 0; step < numberOfIntervals; step++ ) {
	    int currentIndex = step * stepSize;
	    String currentLine = lines.get(currentIndex);
	    dates.add(function.apply(currentLine));
	}
	// adds last element
	dates.add(function.apply(lines.get(lines.size() - 1)));
	
	return dates;
    }
}
