package com.prowings.basics.string.excersizes;

public class CountVowelsConsonantsProgram {

	public static void countingVowelsAndConsonants(String input) {
		input = input.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isLetter(c)) // to check character is a letter or not
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					vowels++;
				else
					consonants++;
		}
		System.out.println("Total vowels are:" + vowels);
		System.out.println("Total consonants are:" + consonants);
	}
	
	public static void main(String[] args) {
		String word = "I love my country!!!";
		countingVowelsAndConsonants(word);
	}
}
