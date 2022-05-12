package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to Regex UserRegistration program ");
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Name : ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
        
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-z][a-z]{2}", lastName));
	}

}
