package edu.test;

import java.io.PrintStream;
import java.util.regex.Pattern;

public class Question {

	public static void main(String[] args) {

		out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true
		out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false (more than 6 char)
		out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
		out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));// false ($ is not matched)

		out.println("by character classes and quantifiers ...");
		out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));// true
		out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));// true

		out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));// false (11 characters)
		out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));// false (starts from 6)
		out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));// true

		out.println("by metacharacters ...");
		out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));// true
		out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));// false (starts from 3)
	}

	private static PrintStream out = System.out;
}
