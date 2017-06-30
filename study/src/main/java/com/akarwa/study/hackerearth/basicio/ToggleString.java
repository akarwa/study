package com.akarwa.study.hackerearth.basicio;
import java.util.*;

/**
 You have been given a String S
You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S.
The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.
 */
public class ToggleString {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		
		if(string.length() == 1 || string.length() > 100){
			System.out.println("NO");
		}
		
		for(int i=0,j=string.length()-1; j>=i; i++,j--){
			if(string.charAt(i) == string.charAt(j)){
				continue;
			}else{
				System.out.println("NO");
				System.exit(0);
			}
		}
	}
}
