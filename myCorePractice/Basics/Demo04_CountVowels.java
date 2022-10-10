package com.prominentpixel.myCorePractice.Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo04_CountVowels {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub  
		String str;
		int vowels = 0, conso=0, digits = 0, blanks = 0;
		char ch;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter a String : ");
				str = br.readLine();
				for(int i = 0; i < str.length(); i ++)
				  {
					ch = str.charAt(i);
					if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch ==
						'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
							vowels ++; 
					else if((ch >= 'a' && ch<='z')||(ch >= 'A' && ch<='Z'))           
						conso ++;    
					else if(Character.isDigit(ch))
							digits ++;
					else if(Character.isWhitespace(ch))
							blanks ++;
				  }
					System.out.println("Vowels : " + vowels); 
					System.out.println("Consonents: " + conso);
					System.out.println("Digits : " + digits);
					System.out.println("Blanks : " + blanks);
				

	}

}
