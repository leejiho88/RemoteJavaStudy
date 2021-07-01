package quiz;

import java.util.Scanner;

public class C17_InputRightPassword2 {
/*
	# 올바른 패스워드를 만들기 위한 규칙
	
	1. 모두 숫자이면 안됨
	
	2. 대문자와 소문자 숫자 특수문자가 섞여있어야 함
	
	3. 특수 문자는 !, @, #, $, %, ^, &, *만 사용 가능합니다.
	
	4. 비밀번호의 길이가 8자리 이상 24자리 이하여야 함
	
	위의 규칙을 어긴 경우 예외를 발생시켜서 알맞은 안내문구를 출력해보세요
*/
	public static void main(String[] args) {
		System.out.println("비밀번호를 입력하세요.");
		System.out.print("> ");
		
		try {
			str();
			num();
			special();
		} catch(PasswordExcetion e) {
			e.printStackTrace();
			System.out.println("올바른 규칙을 지키세요");
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
		super("대소문자를 섞어 써주세요");
	}
}

class NumMismatchExcetion extends PasswordExcetion {
	public NumMismatchExcetion() {
		super("문자를 섞어 써주세요");
	}
}

class SpecialMismatchException extends PasswordExcetion {
	public SpecialMismatchException() {
		super("특수문자를 섞어 써주세요");
	}
}




