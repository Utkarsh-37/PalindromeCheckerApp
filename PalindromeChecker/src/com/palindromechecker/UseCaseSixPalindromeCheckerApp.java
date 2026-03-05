/*
 * ================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 *
 * @author Developer
 * @version 6.0
*/
package com.palindromechecker;
import java.util.*;

public class UseCaseSixPalindromeCheckerApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		Queue<Character> queue = new LinkedList<>();
		Stack<Character> stack = new Stack<>();
		
		for(char c : input.toCharArray())
		{
			stack.push(c);
			queue.add(c);
		}
		
		boolean isPalindrome = true;
		while(queue.isEmpty() == false)
		{
			if(queue.poll() != stack.pop())
			{
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Is Palindrome? : " + isPalindrome);
		
	}

}
