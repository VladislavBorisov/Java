package edu.pragmatic.examples.strings;

public class StringMethods {
	
	private static void length(){
		String name = "John";
		int lenght = name.length(); // length = 4
		System.out.println("\"John\".length()=" + lenght);
	}
	
	private static void  charAt(){
		String name = "John";
		char charAtPos1 = name.charAt(1); // c = 'o'
		System.out.printf("\"John\".charAt(1)=" + charAtPos1);
		System.out.println();
	}
	
	private static void substring(){
		String text = "How are strings processed in Java?";
		String substr = text.substring(8,15); //strings
		System.out.println("\"" + text + "\".substring(8,15)= "+substr);
	}
	
	private static void upperCaseLoweCase(){
		String text = "Test";
		String upper = text.toUpperCase(); // TEST
		String lower = text.toLowerCase(); // test
		System.out.println("\"Test\".toUpperCase() = "+ upper);
		System.out.println("\"Test\".toLowerCase() = "+ lower);
	}

	private static void indexOfAndLastIndexOf(){
		String str = "Java is the best language ever!";
		System.out.println("\"" + str+ "\".indexOf(Java)= " +  str.indexOf("Java")); 
		System.out.println("\"" + str+ "\".indexOf(best)= " +  str.indexOf("best")); 
		System.out.println("\"" + str+ "\".indexOf(BEST)= " +  str.indexOf("BEST"));
		// IndexOf is case sensetive. -1 means not found
		System.out.println("\"" + str+ "\".indexOf(gua)= " +  str.indexOf("gua"));
	}
	
	private static void equals(){
		String passwd = "fGhPUw";
		System.out.println(passwd + ".equals(fgHPUw) = " + passwd.equals("fgHPUw"));// Case is important
	}
	
	private static void equalsIgnoreCase(){
		String cat = "movie";
		System.out.println(cat + ".equalsIgnoreCase(Movie)= " + cat.equalsIgnoreCase("Movie"));
	}
	
	private static void compairingReferencesAndObjects(){
		String text1 = new String("some string");
		String text2 = new String("some string");
		System.out.println(" (text1 == text2) = "  +  (text1 == text2) );
		System.out.println(" text1.equals(text2) = "  +  text1.equals(text2) );
	}
	
	private static void splitting() {
		String listOfBeers = "Amstel, Zagorka, Tuborg, Becks.";
		String[] beers = listOfBeers.split("[, .]+");
		System.out.println("Available beers are:");
		for (String beer : beers) {
			System.out.printf(" - %s\n", beer);
		}
	}
	
	public static void main(String[] args) {
		length();
		charAt();
		substring();
		upperCaseLoweCase();
		indexOfAndLastIndexOf();
		equals();
		equalsIgnoreCase();
		compairingReferencesAndObjects();
		splitting();
	}
	
}
