package com.vivareal.datesplitter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DropIdTest {
    
    private String register;
    private DropId dropId;

    @Before
    public void setup() {
	register = "35928159, 2012-07-30 15:14:03.552";
	dropId = new DropId();
    }

    @Test
    public void anythingBeforeComma() {
	assertEquals("2012-07-30 15:14:03.552", dropId.apply(register));
    }

}
