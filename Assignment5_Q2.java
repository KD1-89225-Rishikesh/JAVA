package com.assignment;

import java.util.Scanner;

public class Assignment5_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s = "abcba";
		
//		approach 1 = reverse string and compare to original one
		
//		StringBuilder sb = new StringBuilder(s);
//		StringBuilder sb1 = new StringBuilder(s);
//		sb.reverse();
//		System.out.println(sb1);
//		
//		System.out.println(sb.equals(sb1));

//approach 2 = optimiz method
char[] chArr = s.toCharArray();
int i=0;
int j = chArr.length-1;
 boolean isPalindrome = true;

 while (i<=j) {
	if (chArr[i] != chArr[j] ) {
		isPalindrome = false;
	}
	i++;
	j--;
}


if (isPalindrome) {
    System.out.println("The string is a palindrome.");
} 
else {
	System.out.println("The string is not  a palindrome.");
}


	}

}
