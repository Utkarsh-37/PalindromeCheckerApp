/*
 * =====================================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =====================================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */

package com.palindromechecker;

public class UseCaseTwoPalindromeCheckerApp {

	public static void main(String[] args) {
		String str = "hannah";
		System.out.println("Input text: hannah");

		boolean isPalindrome = true;

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Is it palindrome? : " + isPalindrome);
	}
}
