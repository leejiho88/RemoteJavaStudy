package quiz;

import java.util.Scanner;

public class B05_PrintReverse {

	// ����ڰ� � ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� > ");
		
		String str = sc.nextLine();
		
		String rts = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rts += str.charAt(i);
		}
		System.out.println(rts);
		*/
		
		String text = "I am a black cow";
		
		for (int i = text.length() - 1; i > -1; --i) {
			System.out.print(text.charAt(i));
		}
		}
	
}
