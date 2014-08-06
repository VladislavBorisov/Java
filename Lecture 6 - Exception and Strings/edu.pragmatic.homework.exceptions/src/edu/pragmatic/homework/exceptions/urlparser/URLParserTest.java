package edu.pragmatic.homework.exceptions.urlparser;

public class URLParserTest {
	
	public static void main(String[] args) {
		URLParser parser = new URLParser();
		String url = "http://www.google.com/path/to/resource?arg=1";
		System.out.println(parser.parse(url));
	}

}
