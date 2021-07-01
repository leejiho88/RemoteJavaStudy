package quiz;

import java.util.Scanner;

public class B05_Palindrome {
	/*
	  	사용자로부터 단어를 하나 입력받고
	  	해당 단어가 회문이라면 "PALINDROME"을 출력
	  	회문이 아니라면 "NOT PALINDROME"을 출력
	  	
	  	※ 회문이란 - MOM, BOB, ABBA, MADAM, EVE, TXT ...
	*/
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요 >");
		String word = sc.nextLine();
		
		String drow = "";
		
		for (int i = word.length() - 1; i >=0; i--) {
			drow += word.charAt(i);
		}
		if (word.equals(drow)) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
		*/
		
		/*
		int a = 10;
		
		a += 5;	
		
		String txt = "apple";
		
		txt += "banana";
		*/
		String original = "LEAAAVEL";
		
		int half = original.length() / 2;
		int correct = 0;
		
		for (int i = 0; i < original.length() / 2; ++i) {
			char front = original.charAt(i);
			char back = original.charAt(original.length() - 1 - i);
			
			System.out.printf("'%c'와 '%c'를 비교합니다.\n", front, back);			
			if(front != back) {
				correct++;
			}
		}
		
		if (correct == half) {
			System.out.println("PALINDROME");
		} else { 
			System.out.println("NOT PALINDROME");
		}
		
//		# 거꾸로 뒤집는 방법
//		
//		String reverse = "";
//		
//		for (int i = str.length() - 1; i > -1; --i) {
//			reverse += str.charAt(i);
//		}
//		
//		if (str.equals(reverse)) {
//			System.out.println("PALINDROME");
//		} else {
//			System.out.println("NOT PLAINSROME");
//		}
	}
}