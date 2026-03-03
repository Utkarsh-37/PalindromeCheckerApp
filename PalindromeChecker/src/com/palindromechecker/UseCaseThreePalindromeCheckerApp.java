/*
 * =====================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =====================================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

package com.palindromechecker;
import java.util.*;

public class UseCaseThreePalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();  
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		boolean check = str.equals(reversed);
		System.out.println("Original: " + str);
		System.out.println("Reversed: " + reversed);
		System.out.println("Is Palindrome? : " + check);
		
	}

}
