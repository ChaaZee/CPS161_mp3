package string_methods;

import java.util.*;

public class StringMethod {
	
	private String str = "";
	
	public void setString(String s) {
		str = s;
	}

	public void readString() {
		System.out.print("Enter String: ");
		Scanner input1 = new Scanner(System.in);
		str = input1.nextLine();
		System.out.println();
	}
	
	public int countOccurences(String s) {
		int occurences = 0;
		for(int i = 0; i < str.length() - s.length(); i++) {
			String newStr = str.substring(i, i + s.length());
			if(newStr.equals(s)) {
				occurences += 1;
			}
		}
		return occurences;
	}
	
	public int countOccurences(char c) {
		int occurences = 0;
		for(int i = 0; i < str.length(); i++) {
			char newC = str.charAt(i);
			if(newC == c) {
				occurences += 1;
			}
		}
		return occurences;
	}
	
	int countUpperCaseLetters() {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if(s == Character.toUpperCase(s) && s != ' ' && s != '.' && s != '\'') {
				count += 1;
			}
		}
		return count;
	}
	
	int countLowerCaseLetters() {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if(s == Character.toLowerCase(s) && s != ' ' && s != '.' && s != '\'') {
				count += 1;
			}
		}
		return count;
	}
	
	public void printCounts(String s, char c) {
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("Analyzing: " + str);
		System.out.println("Number of '" + s + "' is " + countOccurences(s));
		System.out.println("Number of '" + c + "' is " + countOccurences(c));
		System.out.println("Number of upper case letters: " + countUpperCaseLetters());
		System.out.println("Number of lower case letters: " + countLowerCaseLetters());
		System.out.println("------------------------------------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethod myStr = new StringMethod();
		myStr.readString();
		myStr.printCounts("big", 'a');
		
		myStr.setString("Parked in a van down by the river bank .... The vanevan vanished near a lot of other vans");
		myStr.printCounts("van", 'a');
		
		StringMethod myStr2 = new StringMethod();
		myStr2.setString("the elephant in the room wouldn't budge");
		myStr2.printCounts("the", 'i');
	}

}
