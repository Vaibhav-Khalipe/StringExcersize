package com.prowings.basics.string.excersizes;

public class ReverseStringExample {
	
	public static String reverseString(String input)
	{
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		return new String(sb);
		
	}
	
	
	public static void main(String[] args) {
		
		String input ="abcdef";
		String output =reverseString(input);
		
		System.out.println(output);
		
		
	}
	}


