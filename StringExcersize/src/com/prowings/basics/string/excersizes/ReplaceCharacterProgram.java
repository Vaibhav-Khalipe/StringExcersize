package com.prowings.basics.string.excersizes;

public class ReplaceCharacterProgram {
	
	public static String replace(String s)
	{
		return s.replaceAll("s","v");
	}
	
	public static void main(String[] args) {
		
		String s ="sssmmmvvvv";
		String s1=replace(s);
		System.out.println(s1);
	}
		

}
