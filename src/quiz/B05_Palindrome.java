package quiz;

import java.util.Scanner;

public class B05_Palindrome {
	/*
	  	����ڷκ��� �ܾ �ϳ� �Է¹ް�
	  	�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
	  	ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
	  	
	  	�� ȸ���̶� - MOM, BOB, ABBA, MADAM, EVE, TXT ...
	*/
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ �Է��ϼ��� >");
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
			
			System.out.printf("'%c'�� '%c'�� ���մϴ�.\n", front, back);			
			if(front != back) {
				correct++;
			}
		}
		
		if (correct == half) {
			System.out.println("PALINDROME");
		} else { 
			System.out.println("NOT PALINDROME");
		}
		
//		# �Ųٷ� ������ ���
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