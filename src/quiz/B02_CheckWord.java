package quiz;

import java.util.Scanner;

public class B02_CheckWord {

	/*
	  	사용자로부터 단어를 하나 입력받고
	  	첫 번째 글자가 영어이면서 마지막 번째 글자가 일치하면 "OK"를 출력하고
	  	일치하지 않으면 "NOT OK"를 출력해보세요
	 */
	public static void main(String[] args) {
   /*// 1.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요 > ");
		String str = sc.nextLine();
		
		char a = str.charAt(0);
		char b = str.charAt(str.length() - 1);
		
		if ((a == b) && ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
   */
	 // 2.
		String word = "ABCA";
		
		boolean match = false; // boolean타입을 쓸 수 있다
		boolean alphabet = false;
		
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length() - 1);
		
		if (first_letter == last_letter) {
			match = true;
		}
		
		if ((first_letter >= 'A' && first_letter <= 'Z') || 
				(first_letter >= 'a' && first_letter <= 'z')) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
		
   /*// 1.
		boolean match = first_letter == last_letter;
		boolean alphabet = (first_letter >= 'A' && first_letter <= 'Z') || 
				(first_letter >= 'a' && first_letter <= 'z');
		
		if (match && alphabet) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}		
   */
	}
}