package quiz;

import java.util.Scanner;

public class B02_CheckWord {

	/*
	  	����ڷκ��� �ܾ �ϳ� �Է¹ް�
	  	ù ��° ���ڰ� �����̸鼭 ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ����ϰ�
	  	��ġ���� ������ "NOT OK"�� ����غ�����
	 */
	public static void main(String[] args) {
   /*// 1.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ �Է��ϼ��� > ");
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
		
		boolean match = false; // booleanŸ���� �� �� �ִ�
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