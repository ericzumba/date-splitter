package com.vivareal.datesplitter;

public class DropId implements Function<String, String> {

    @Override
    public String apply(String t) {
	 String afterComma = t.split(",")[1];
	 return afterComma.replaceFirst(" ", "");
    }
}
