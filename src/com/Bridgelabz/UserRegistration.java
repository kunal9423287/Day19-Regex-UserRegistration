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
        
        
        
        //UC3 user need to entered valid email adress
        
        String email = "abc.xyz@bl.co.in";
        System.out.println("Email :"+email);
        System.out.println(Pattern.matches("(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email));
        
        //UC4 user need to follow predefined mobile format
        System.out.println("Enter mobile no. : ");
        String phoneNum = scanner.nextLine();
        System.out.println(Pattern.matches("[6-9]{1}[0-9]{1}[\\s][0-9]{10}", phoneNum));
	}

}






