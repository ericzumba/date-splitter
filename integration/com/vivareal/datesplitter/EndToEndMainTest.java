package com.vivareal.datesplitter;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EndToEndMainTest {

    private ArrayList<String> lines;
    
    @Before
    public void setup() {
	lines = new ArrayList<>();
	lines.add("29529720, 2012-04-17 11:40:10.6");
	lines.add("29529721, 2012-04-17 11:40:10.601");
	lines.add("29529722, 2012-04-17 11:40:10.602");
	lines.add("29529723, 2012-04-17 11:40:10.603");
	lines.add("29529724, 2012-04-17 11:40:10.604");
	lines.add("29529725, 2012-04-17 11:40:10.605");
	lines.add("29529726, 2012-04-17 11:40:10.606");
	lines.add("29529727, 2012-04-17 11:40:10.607");
	lines.add("29529728, 2012-04-17 11:40:10.608");
	lines.add("29529729, 2012-04-17 11:40:10.609");
    }    
    @Test
    public void test() {
	LinkedList<String> result = Main.doYourThing(5, lines, new DropId(new FormatAsZuluTime()));
	Assert.assertEquals("2012-04-17T11:40:10.600Z", result.get(0));
	Assert.assertEquals("2012-04-17T11:40:10.602Z", result.get(1));
	Assert.assertEquals("2012-04-17T11:40:10.604Z", result.get(2));
	Assert.assertEquals("2012-04-17T11:40:10.606Z", result.get(3));
	Assert.assertEquals("2012-04-17T11:40:10.608Z", result.get(4));
	Assert.assertEquals("2012-04-17T11:40:10.609Z", result.get(5));
    }

}
