/*
 * ================================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
*/
package com.palindromechecker;
import java.util.*;

public class UseCaseSevenPalindromeCheckerApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		Deque<Character> deque = new ArrayDeque<>();
		for(char c : input.toCharArray())
		{
			deque.add(c);
		}
		boolean isPalindrome = true;
		while(deque.size() > 1)
		{
			if(deque.removeFirst() != deque.removeLast())
			{
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Is Palindrome? : " + isPalindrome);
		
	}

}
