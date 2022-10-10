package com.prominentpixel.regulerExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE01RegistrationForm { 
	final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		boolean validate(String email){
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
		        return matcher.find();
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		System.out.println(Pattern.matches("[a-zA-Z]+","nitin")); //Fname/Lname
		System.out.println(Pattern.matches("[0-9]{10}","8905674813"));  //mobile
		 
		Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b", Pattern.CASE_INSENSITIVE);//E-mail
		System.out.println(p.matcher("misalNitin.beit@gmail.com").find());  
		
		System.out.println(Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%_&]).{4,20}$","nitinMisal@35"));//password

	
	}

}
