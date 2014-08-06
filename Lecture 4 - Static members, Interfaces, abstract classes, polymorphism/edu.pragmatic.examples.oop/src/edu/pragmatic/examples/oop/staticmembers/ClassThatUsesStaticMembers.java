package edu.pragmatic.examples.oop.staticmembers;

import static edu.pragmatic.examples.oop.staticmembers.StaticMembersExample.STRING_CONST;

public class ClassThatUsesStaticMembers {
	
	public static void main(String[] args) {
		
		// static members are accessed using the class name, there is no need for an instance
		int someNumber = StaticMembersExample.someStaticNumber;
		
		System.out.println("We've got the number " + someNumber);
		
		String aStringToShowInTheConsole = STRING_CONST;
		
		System.out.println("The string const was staticly imported " + aStringToShowInTheConsole) ;
	}

}
