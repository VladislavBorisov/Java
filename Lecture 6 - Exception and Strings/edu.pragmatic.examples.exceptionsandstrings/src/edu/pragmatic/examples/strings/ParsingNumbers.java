package edu.pragmatic.examples.strings;
import java.util.Scanner;

public class ParsingNumbers {

	public static void main(String[] args) {
		System.out.print("Enter an integer number: ");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		try {
		  int value = Integer.parseInt(line);
		  System.out.println("Valid number: " + value);
		} catch (NumberFormatException ex) {
		  System.out.println("Invalid number: " + line);
		}
		scanner.close();
	}

}
