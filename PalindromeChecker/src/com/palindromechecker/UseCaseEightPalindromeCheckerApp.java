/*
 * ================================================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
*/
package com.palindromechecker;
import java.util.*;

public class UseCaseEightPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		
		LinkedList<Character> list = new LinkedList<>();
		for(char c : input.toCharArray())
		{
			list.add(c);
		}
		boolean isPalindrome = true;
		while(list.size() > 1)
		{
			if(list.removeFirst() != list.removeLast())
			{
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Is Palindrome? : " + isPalindrome);
		
	}

}
