package edu.test;

import java.io.PrintStream;

public class RemplaceAll {

	static PrintStream out = System.out;

	public static void main(String[] args) {

		out.println(" Chromecast-2015.jpg/invertido".replaceAll("[!-. /]", "%20"));
		
		String string = "This is a String to use as an example to present raplaceAll";
		// replace all occurrences of 'This' with 'That'
		String newStr = string.replaceAll("This", "That");
		out.println(newStr);
		// replace all occurrences of 'String' with 'big String'
		newStr = string.replaceAll("String", "big String");
		out.println(newStr);
		// remove all occurrences of 'is'
		newStr = string.replaceAll("is", "");
		out.println(newStr);
		// remove all occurrences of 'replaceAll'
		newStr = string.replaceAll("raplaceAll", "");
		out.println(newStr);

		String str = "This 1231 is 124 a String 1243 to 34563 use 5455";

		// remove all numbers
		String newString = str.replaceAll("[0-9]+", "");
		out.println(newString);
		// remove all words with 'Java'
		newString = str.replaceAll("[a-zA-Z]+", "Java");
		out.println(newString);
	}
}
