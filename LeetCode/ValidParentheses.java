package LeetCode;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		ValidParentheses solution = new ValidParentheses();

		// Test cases
		String[] testCases = {
				"()", "{}", "[]", "(){}[]", "{[()]}", "{{([][])}}",
				"(]", "{[}", "(()", "([)]", "", "(", ")", "({)}", "[{]", "[(()]",
				"((((((()))))))", "{{{{{{{{{}}}}}}}}}", "((((((())))))", "{{[[(())]]}}",
				"{{[[(())]]}})"
		};

		// Expected results
		boolean[] expectedResults = {
				true, true, true, true, true, true,
				false, false, false, false, true, false, false, false, false, false,
				true, true, false, true, false
		};

		// Run the test cases
		for (int i = 0; i < testCases.length; i++) {
			String testCase = testCases[i];
			boolean expected = expectedResults[i];
			boolean result = solution.isValid(testCase);
			System.out.println("Input: \"" + testCase + "\", \t\t Expected: " + expected + ", \t Output: " + result);
		}
	}
}
