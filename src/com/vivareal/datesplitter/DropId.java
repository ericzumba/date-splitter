package com.vivareal.datesplitter;

public class DropId implements Function<String, String> {

    private Function<String, String> function;

    public DropId(Function<String, String> function) {
	this.function = function;
    }

    @Override
    public String apply(String t) {
	 String afterComma = t.split(",")[1];
	 return function.apply(afterComma.replaceFirst(" ", ""));
    }
}
