package com.vivareal.datesplitter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
    
    private List<String> lines;

    @Before
    public void setup() {
	lines = new ArrayList<>();
	lines.add("2012-04-17 11:40:10.600");
	lines.add("2012-04-17 11:40:10.601");
	lines.add("2012-04-17 11:40:10.602");
	lines.add("2012-04-17 11:40:10.603");
	lines.add("2012-04-17 11:40:10.604");
	lines.add("2012-04-17 11:40:10.605");
	lines.add("2012-04-17 11:40:10.606");
	lines.add("2012-04-17 11:40:10.607");
	lines.add("2012-04-17 11:40:10.608");
	lines.add("2012-04-17 11:40:10.609");

    }

    @Test
    public void test() {
	Main.doYourThing(1, lines);
    }

}
