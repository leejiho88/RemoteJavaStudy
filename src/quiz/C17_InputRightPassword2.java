package quiz;

import java.util.Scanner;

public class C17_InputRightPassword2 {
/*
	# �ùٸ� �н����带 ����� ���� ��Ģ
	
	1. ��� �����̸� �ȵ�
	
	2. �빮�ڿ� �ҹ��� ���� Ư�����ڰ� �����־�� ��
	
	3. Ư�� ���ڴ� !, @, #, $, %, ^, &, *�� ��� �����մϴ�.
	
	4. ��й�ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��
	
	���� ��Ģ�� ��� ��� ���ܸ� �߻����Ѽ� �˸��� �ȳ������� ����غ�����
*/
	public static void main(String[] args) {
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		System.out.print("> ");
		
		try {
			str();
			num();
			special();
		} catch(PasswordExcetion e) {
			e.printStackTrace();
			System.out.println("�ùٸ� ��Ģ�� ��Ű����");
		}
	}
		
	public static void str() throws WordMismatchExcetion {
		Scanner sc = new Scanner(System.in);
		String pw = sc.nextLine();
		for (int i = 0; i < pw.length() - 1; i++) {
			char ch = pw.charAt(i);
			if (!((ch >= 'a' && ch <= 'z') ||
					(ch >= 'A' && ch <= 'Z'))) {
			} else {
				throw new WordMismatchExcetion();
			}
		}
	}
		
	public static void num() throws NumMismatchExcetion{
		Scanner sc = new Scanner(System.in);
		String pw = sc.nextLine();
		
		int count = 0;
		for (int i = 0; i < pw.length() - 1; i++) {
			char ch = pw.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;
				if (count == pw.length()) {
					throw new NumMismatchExcetion();
				}
			} 
		}
	}
	
	public static void special() throws SpecialMismatchException{
		Scanner sc = new Scanner(System.in);
		String pw = sc.nextLine();
		boolean sp = false;
			for(int i = 0; i < pw.length() - 1; i++) {
				char ch = pw.charAt(i);
				if (ch != '!' || ch != '@' || ch != '#' || ch != '$' ||
					ch != '%' || ch != '^' || ch != '&' || ch != '*') {
					throw new SpecialMismatchException();
			}
		}
	}
}

class PasswordExcetion extends Exception{
	String string;
	public PasswordExcetion(String string) {
		this.string = string;
		System.out.println(this.string);
	}
}
class WordMismatchExcetion extends PasswordExcetion {
	public WordMismatchExcetion() {
		super("��ҹ��ڸ� ���� ���ּ���");
	}
}

class NumMismatchExcetion extends PasswordExcetion {
	public NumMismatchExcetion() {
		super("���ڸ� ���� ���ּ���");
	}
}

class SpecialMismatchException extends PasswordExcetion {
	public SpecialMismatchException() {
		super("Ư�����ڸ� ���� ���ּ���");
	}
}




