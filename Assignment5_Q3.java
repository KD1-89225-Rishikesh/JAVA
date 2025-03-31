package com.assignment;

import java.util.Scanner;

public class Assignment5_Q3 {

	 public static int countWords(String str) {
	        // Trim leading and trailing spaces
	        str = str.trim();

	        // Check for empty string after trimming
	        if (str.isEmpty()) {
	            return 0;
	        }

	        // Split the string based on one or more spaces
	        String[] words = str.split("\\s+");

	        // Return the number of words
	        return words.length;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }


}
