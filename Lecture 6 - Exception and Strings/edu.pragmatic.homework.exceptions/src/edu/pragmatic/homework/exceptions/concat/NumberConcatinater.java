package edu.pragmatic.homework.exceptions.concat;

public class NumberConcatinater {
	
	public String slowConcat(long num){
		String str = "";
		for (int i= 0 ; i < num ; i++){
			System.out.println(i);
			str+=i;
		}
			
		return str;
	}
	
	public String quickConcat(long num){
		StringBuilder sb = new StringBuilder();
		for (int i =0; i < num ; i++ ){
			System.out.println(i);
			sb.append(i);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		NumberConcatinater concatinater = new NumberConcatinater();
		long start = System.currentTimeMillis();
		concatinater.slowConcat(1_000_000L);
		long end = System.currentTimeMillis();
		long slowTime = end - start;
		
		start = System.currentTimeMillis();
		concatinater.quickConcat(1_000_000L);
		end = System.currentTimeMillis();
		long quickTime = end - start;
		
		// Quick concat is quicker by a factor of 556
		System.out.println("Quick concat is quicker by a factor of " + slowTime / quickTime);
	}

}
