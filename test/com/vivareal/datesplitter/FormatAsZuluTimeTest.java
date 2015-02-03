package com.vivareal.datesplitter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FormatAsZuluTimeTest {
    
    private FormatAsZuluTime formatter;
    private String formattedDate;

    @Before
    public void setup() {
	formattedDate = "2012-07-30T15:14:03.500Z";
	formatter = new FormatAsZuluTime();
	
    }

    @Test
    public void formatsRight() {
	assertEquals(formattedDate, formatter.apply("2012-07-30 15:14:03.500"));
    }
    
    @Test
    public void formatsRightWithOneZeroPadded() {
	assertEquals(formattedDate, formatter.apply("2012-07-30 15:14:03.50"));
    }
    
    @Test
    public void formatsRightWithTwoZeroesPadded() {
	assertEquals(formattedDate, formatter.apply("2012-07-30 15:14:03.5"));
    }
}
