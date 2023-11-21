package com.prowings.basics.string.excersizes;

public class StringPalindrome {
	
	public static boolean isPalindrome(String input)
	{
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		String reversedString = new String(sb);
		return input.equalsIgnoreCase(reversedString);
	}
	
	public static void main(String[] args) {
		
		
		String input ="RADAR";
		String output="";
		
		if(isPalindrome(input))
		{
			output="Palindrome";
		}
		else
		{
			output ="Not A Palindrome";
		}
		System.out.println(output);
		
		
	}
	
	
}

