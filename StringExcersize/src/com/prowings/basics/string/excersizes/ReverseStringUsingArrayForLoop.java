package com.prowings.basics.string.excersizes;


public class ReverseStringUsingArrayForLoop {
	
	public static String reverseString(String input)
	{
		char[]data=input.toCharArray();
		char[]res=new char[data.length];
		
		int counter =0;
		for(int i=data.length-1;i>=0;i--)
		{
			res[counter]=data[i];
			counter++;
			
		}
		System.out.println(res);
		return new String(res);
	}
	
	public static void main(String[] args) {
		
		String input ="abcdefg";
		String output=reverseString(input);
		
	}


}
