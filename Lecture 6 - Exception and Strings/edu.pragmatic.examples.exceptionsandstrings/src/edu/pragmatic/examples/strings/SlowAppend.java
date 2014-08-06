package edu.pragmatic.examples.strings;

public class SlowAppend {
	
	public static void main(String[] args) {
		String a100000 = chainChar('a', 100000);
		System.out.println(a100000.length());
	}

	public static String chainCharAsString(char ch, int count) {
		String result = "";
		for (int i = 0; i < count; i++)
			result += ch;
		return result;
	}

	public static String chainChar(char ch, int count) {
		StringBuilder result = new StringBuilder(count);
		for (int i = 0; i < count; i++)
			result.append(ch);
		return result.toString();
	}

}
