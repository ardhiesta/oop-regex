package com.oop.regex;

public class Example3 {
	public static void main(String[] args) {
		String EXAMPLE_TEST = "This is my small example "
	            + "string which I'm going to " + "use for pattern matching.";
		
		// matches word character [a-zA-Z_0-9]
		System.out.println(EXAMPLE_TEST.matches("\\w.*"));
		
        // split based on whitespace character [ \t\n\x0b\r\f]
		String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);// should be 14
        for (String string : splitString) {
            System.out.println(string);
        }
        
        // replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
	}
}
