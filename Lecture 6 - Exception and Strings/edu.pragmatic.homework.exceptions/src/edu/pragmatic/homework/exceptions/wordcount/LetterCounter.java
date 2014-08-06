package edu.pragmatic.homework.exceptions.wordcount;

public class LetterCounter {

	public long count(String text){
		if (text == null || text.isEmpty()){
			throw new IllegalArgumentException("Text can't be null or empty");
		}
		
		char[] letters = text.toCharArray();
		long count = 0;
		for (char c : letters) {
			if (c != ' ' && c!= '\t' && 
				c!= '\r' && c!= '\n'  )
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		LetterCounter counter = new LetterCounter();
//		try {
//			long wordCount = counter.count(null);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
		
		long wordCount = counter.count("String w	ith 17 chars   	");
		System.out.println(wordCount);
	}
	
	
}
