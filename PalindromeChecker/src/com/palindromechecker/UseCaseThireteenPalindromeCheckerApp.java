/*
 * ================================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
*/
package com.palindromechecker;
import java.util.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

public class UseCaseThireteenPalindromeCheckerApp {
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		
		long startStack = System.nanoTime();
		StackStrategy stack = new StackStrategy();
		boolean stackResult = stack.check(input);
		long endStack = System.nanoTime();
		long stackTime = endStack-startStack;
		System.out.println("Result using Stack:\n"+stackResult+" \nTime Taken \n"+stackTime+"ns");
		
		long startArray = System.nanoTime();
		CharArrayStrategy array = new CharArrayStrategy();
		boolean arrayResult = array.check(input);
		long endArray = System.nanoTime();
		long arrayTime = endArray-startArray;
		System.out.println("\nResult using Char Array:\n"+arrayResult+" \nTime Taken \n"+arrayTime+"ns");
		
		long startLinkL = System.nanoTime();
		StackStrategy linkL = new StackStrategy();
		boolean linkLResult = linkL.check(input);
		long endLinkL = System.nanoTime();
		long linkLTime = endLinkL-startLinkL;
		System.out.println("\nResult using LinkedList:\n"+linkLResult+" \nTime Taken \n"+linkLTime+"ns");
		
		long startStackQueue = System.nanoTime();
		StackStrategy stackQueue = new StackStrategy();
		boolean stackQueueResult = stackQueue.check(input);
		long endStackQueue = System.nanoTime();
		long stackQueueTime = endStackQueue-startStackQueue;
		System.out.println("\nResult using Stack and Queue:\n"+stackQueueResult+" \nTime Taken \n"+stackQueueTime+"ns");
		
		long startDequeue = System.nanoTime();
		StackStrategy dequeue = new StackStrategy();
		boolean dequeueResult = dequeue.check(input);
		long endDequeue = System.nanoTime();
		long dequeueTime = endDequeue-startDequeue;
		System.out.println("\nResult using Dequeue:\n"+dequeueResult+" \nTime Taken \n"+dequeueTime+"ns");
    }
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (stack.peek() != c) {
                isPalindrome = false;
            }
            stack.pop();
        }
        return isPalindrome;
    }
}

class LinkedListStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}

class CharArrayStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        char[] arr = input.toCharArray();
        int low = 0, high = arr.length - 1;
        boolean isPalindrome = true;

        while (low < high) {
            if (arr[low] != arr[high]) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        return isPalindrome;
    }
}

class StackQueueStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
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
		return isPalindrome;
    }
}

class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
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
		return isPalindrome;
    }
}
