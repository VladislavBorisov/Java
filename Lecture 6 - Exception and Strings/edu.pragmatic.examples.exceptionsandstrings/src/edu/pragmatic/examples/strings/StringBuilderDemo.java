package edu.pragmatic.examples.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// String reversing example
		String nameReversed = reverseString("John");
		System.out.println(nameReversed);
		
		// Extracting capital letters example
		String capitals = extractCapitals("John Smith");
		System.out.println(capitals);
	}
	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		int len = s.length();
		for (int i = 0; i<len/2; i++) {
			char leftChar = s.charAt(i);
			char rightChar = s.charAt(len-i-1);
			sb.setCharAt(i, rightChar);
			sb.setCharAt(len-i-1, leftChar);
		}
		return sb.toString();
	}
	
	public static String extractCapitals(String s) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				result.append(ch);
			}
		}
		return result.toString();
	}

}
