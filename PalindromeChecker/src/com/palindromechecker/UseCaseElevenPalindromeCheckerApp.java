/*
 * ================================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 11: Object‑Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object‑oriented design.
 *
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 *
 * @author Developer
 * @version 11.0
*/

package com.palindromechecker;

import java.util.Scanner;
import java.util.Stack;

public class UseCaseElevenPalindromeCheckerApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		
		PalindromeService pal = new PalindromeService();
		boolean isPalindrome = pal.checkPalindrome(input);
		
		System.out.println("Is Palindrome? : " + isPalindrome);
	}

}

class PalindromeService
{
	public boolean checkPalindrome(String input)
	{
		if (input == null) 
			return false;

		Stack<Character> stack = new Stack<>();

		for (char c : input.toCharArray()) {
			stack.push(c);
		}

		StringBuilder reversed = new StringBuilder();
		while (stack.isEmpty() == false) {
			reversed.append(stack.pop());
		}

		return input.equals(reversed.toString());
	}
}




