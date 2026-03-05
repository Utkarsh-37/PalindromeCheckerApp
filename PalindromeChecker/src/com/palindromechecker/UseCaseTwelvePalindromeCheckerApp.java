/*
 * ================================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * + This class demonstrates how different palindrome
 *   validation algorithms can be selected dynamically
 *   at runtime using the Strategy Design Pattern.
 *
 * + At this stage, the application:
 *   - Defines a common PalindromeStrategy interface
 *   - Implements a concrete Stack based strategy
 *   - Injects the strategy at runtime
 *   - Executes the selected algorithm
 *
 * + No performance comparison is done in this use case.
 *   The focus is purely on algorithm interchangeability.
 *
 * + The goal is to teach extensible algorithm design.
 *
 * @author Developer
 * @version 12.0
 */
package com.palindromechecker;
import java.util.*;

interface PalindromeStrategy
{
	boolean checkPalindrome(String input);
}

public class UseCaseTwelvePalindromeCheckerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();

		StackStrategy pal = new StackStrategy();
		boolean isPalindrome = pal.checkPalindrome(input);

		System.out.println("Is Palindrome? : " + isPalindrome);
	}
}

class StackStrategy implements PalindromeStrategy
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
