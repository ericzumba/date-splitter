package com.vivareal.datesplitter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    
    private List<String> lines;
    
    private Function<String, String> noTransformation = new Function<String, String>() {
        @Override
        public String apply(String t) {
    		return t;
        }
    };

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
    public void oneInterval() {
	LinkedList<String> dates = Main.doYourThing(1, lines, noTransformation);
	Assert.assertEquals("2012-04-17 11:40:10.600", dates.get(0));
	Assert.assertEquals("2012-04-17 11:40:10.609", dates.get(1));
    }

    @Test
    public void twoIntervals() {
	LinkedList<String> dates = Main.doYourThing(2, lines, noTransformation);
	Assert.assertEquals("2012-04-17 11:40:10.600", dates.get(0));
	Assert.assertEquals("2012-04-17 11:40:10.605", dates.get(1));
	Assert.assertEquals("2012-04-17 11:40:10.609", dates.get(2));
    }
    
    @Test
    public void threeIntervals() {
	LinkedList<String> dates = Main.doYourThing(3, lines, noTransformation);
	Assert.assertEquals("2012-04-17 11:40:10.600", dates.get(0));
	Assert.assertEquals("2012-04-17 11:40:10.603", dates.get(1));
	Assert.assertEquals("2012-04-17 11:40:10.606", dates.get(2));
	Assert.assertEquals("2012-04-17 11:40:10.609", dates.get(3));
    }
    
    @Test
    public void fourIntervals() {
	LinkedList<String> dates = Main.doYourThing(4, lines, noTransformation);
	Assert.assertEquals("2012-04-17 11:40:10.600", dates.get(0));
	Assert.assertEquals("2012-04-17 11:40:10.602", dates.get(1));
	Assert.assertEquals("2012-04-17 11:40:10.604", dates.get(2));
	Assert.assertEquals("2012-04-17 11:40:10.606", dates.get(3));
	Assert.assertEquals("2012-04-17 11:40:10.609", dates.get(4));
    }
}
