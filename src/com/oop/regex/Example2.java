package com.oop.regex;

public class Example2 {
	public static void main(String[] args) {
		// formatting phone number
		// mobile phone number, separate each 4 digits
		String regex = "\\b(\\d{4})(\\d{4})(\\d{4})\\b";
	    String replacementText = "$1-$2-$3";
	    System.out.println("085645123123".replaceAll(regex, replacementText));
	    
	    // office phone number, separate between code area and phone number
	    regex = "\\b(\\d{1})(\\d{3})(\\d{6})\\b";
	    replacementText = "(+62$2)-$3";
	    System.out.println("0271646999".replaceAll(regex, replacementText));
	}
}
