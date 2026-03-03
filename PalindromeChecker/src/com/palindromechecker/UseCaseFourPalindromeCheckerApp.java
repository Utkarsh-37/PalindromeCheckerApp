/*
 * =====================================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =====================================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
*/
package com.palindromechecker;
import java.util.*;

public class UseCaseFourPalindromeCheckerApp {

private static boolean isPalindromeUsingCharArray(String str) {
        if (str == null) return false;

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String str = sc.nextLine();
		boolean isPalindrome = isPalindromeUsingCharArray(str);
		System.out.println("Is Palindrome? : " + isPalindrome);
		
	}


}
