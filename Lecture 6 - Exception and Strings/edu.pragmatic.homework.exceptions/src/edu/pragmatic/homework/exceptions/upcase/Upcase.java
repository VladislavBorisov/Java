package edu.pragmatic.homework.exceptions.upcase;

public class Upcase {

	private static final String UPCASE_END_TAG = "</upcase>";
	private static final String UPCASE_TAG = "<upcase>";

	public static void main(String[] args) {
		 String text = "The code between <upcase>  the two tags </upcase>  is always uppercase";
		 System.out.println("Original : " + text);
		 int startTag = text.indexOf(UPCASE_TAG);
		 int endTag = text.indexOf(UPCASE_END_TAG);
		 String stringToChange = text.substring(startTag + UPCASE_TAG.length(), endTag );
		 StringBuilder sb = new StringBuilder(text);
		 sb.replace(startTag, endTag +UPCASE_END_TAG.length(), stringToChange.toUpperCase());
		 System.out.println("Changed  : " +sb.toString());
	}
	
}
