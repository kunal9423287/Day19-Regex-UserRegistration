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
        
        //UC4 user need to follow predefined mobile format,check entered mobile number valid or not
        System.out.println("Enter mobile no. : ");
        String phoneNum = scanner.nextLine();
        System.out.println(Pattern.matches("[6-9]{1}[0-9]{1}[\\s][0-9]{10}", phoneNum));
        
        
         /* UC5 User need to follow pre-defined Password Rules.
         Rule-1 : Minimum 8 Characters.
         */
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("[a-zA-Z0-9].{7}$", password));
        
        
        
        //User need to follow pre-defined Password Rules.
        // Rule-2 : Should have atLeast 1 Upper Case.
        
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z]).{8,}$", password));
        
        
        //atleat one numeric number in passward
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$", password));
        
        
        //atleast one special master
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^@#!$%^&+=]*[@#!$%^&+=][^@#!$%^&+=]*$)(?=.*[0-9]).{8,}$", password));
        
        
        
        ////user need to clear all email samples provided separetely
        String[] validEmailSample = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        String[] invalidEmailSample = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

        System.out.println("Valid email :");
        emailValidate(validEmailSample);
        System.out.println("\nInvalid emails :");
        emailValidate(invalidEmailSample);
    }

    public static void emailValidate(String[] emails) {
        for(int i = 0; i< emails.length; i++ ){
            System.out.print(Pattern.matches("^[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", emails[i]) + " ");
        }
        
        
	}

}






