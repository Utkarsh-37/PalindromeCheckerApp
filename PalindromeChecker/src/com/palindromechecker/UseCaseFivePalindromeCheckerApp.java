/*
 * ================================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

package com.palindromechecker;

import java.util.*;

public class UseCaseFivePalindromeCheckerApp {

	public static boolean isPalindromeUsingStack(String input) {
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

	public static void main(String[] args)
	{    
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		boolean isPalindrome = isPalindromeUsingStack(input);
		System.out.println("Is Palindrome? : " + isPalindrome);
	}
}