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
		
		String s2 = "3";
		String regex4 = "[0123]";
		System.out.println(s2+" matches "+regex4+": "+s2.matches(regex4));
	}
}
