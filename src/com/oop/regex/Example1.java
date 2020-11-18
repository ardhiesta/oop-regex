package com.oop.regex;

// ebook hlm 510
public class Example1 {
	public static void main(String[] args) {
		String s1 = "Java";
		// pattern matching : mencari ada tidaknya suatu string di dalam string lain 
		System.out.println(s1+" equals Java : "+s1.equals("Java"));
		System.out.println(s1+" matches Java : "+s1.matches("Java"));
		
		// equals : parameter string
		// matches : parameter regex (regular expression)
		
		String regex1 = "J[a-z][a-z][a-z]";
		String regex2 = "J[a-z]*";
		String regex3 = "j[a-z]*";
		System.out.println(s1+" matches "+regex1+": "+s1.matches(regex1));
		System.out.println(s1+" matches "+regex2+": "+s1.matches(regex2));
		System.out.println(s1+" matches "+regex3+": "+s1.matches(regex3));
		
		/*
		
		[a-z] : A single lowercase letter that is a, b, c, d, ... or z
		J[a-z][a-z][a-z] : A string that consists of four characters. 
		The first character is J.The second character is a, b, c, d, ... or z
		J[a-z]* : Same as above, * means matches 0 or more occurrences of the preceding expression
		
		*/
		
		String s2 = "3";
		String regex4 = "[0123]";
		System.out.println(s2+" matches "+regex4+": "+s2.matches(regex4));
		// [0123] : A single digit 0, 1, 2, or 3
	}
}
