package com.vivareal.datesplitter;

public class FormatAsZuluTime implements Function<String, String> {

    private static int EXPECTED_SIZE = 23;
    @Override
    public String apply(String t) {
	String result = t.replaceAll(" ", "T");
	int numberOfZeroesToBeAdded = EXPECTED_SIZE - result.length();
	for(int i = 0; i < numberOfZeroesToBeAdded; i++ ) {
	    result = result + "0";
	}
	return result + "Z";
    }

}
