package com.prowings.basics.string.excersizes;

public class RemoveDuplicatesProgram {
	
	
	public static void main(String[] args) {

		String input = "aabfgjfjxghkhkckkcabcccb";

		System.out.println(removeDuplicates(input));
	}

	public static String removeDuplicates(String s) {

		char[] chars = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (chars[i] == chars[j])
					chars[j] = ' ';
			}
		}

		String result = new String(chars);
		result = result.replace(" ", "");
		return result;
	}

}
