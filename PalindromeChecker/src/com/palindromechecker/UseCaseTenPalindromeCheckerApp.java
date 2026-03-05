/*
 * ================================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
*/
package com.palindromechecker;
import java.util.*;


public class UseCaseTenPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		
		String normalized = input.strip().replaceAll("[^a-zA-z0-9]", "").toLowerCase();
		int len = normalized.length();
		boolean isPalindrome = true;
		
		
		for(int i=0; i<len/2; i++)
		{
			if(normalized.charAt(i) != normalized.charAt(len-i-1))
			{
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Is Palindrome? : " + isPalindrome);
		
	}

}
