package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	/*
	 	[ 알맞은 조건식을 만들어보세요 ]
	 	
	 	  1. char형 변수 a가 'q' 또는 'Q'일 때true
	 	  2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 	  3. char형 변수 c가 문자('0' ~ '9')일 때 true
	 	  4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 	  
	 	※ 유니코드 표 검색
	 	  5. char형 변수 e가 한글일 때 true
	 	  6. char형 변수 f가 일본어일 때 true
	 	  
	 	  7. 사용자가 입력한 문자열이 exit일 때 true
	 */
	public static void main(String[] args) {
		/*
		char a = 'q';
		System.out.println(a == 'q' || a == 'Q');
		char b = 'a';
		System.out.println(!(b == ' ' && b == '	'));
		char c = '4';
		System.out.println(c >= '0' && c <= '9');
		char d = 'z';
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		
		char e = '료';
		System.out.println(e >= '가' && e <= '힣');
		char f = 'ぁ';
		System.out.println((f >= 'ァ' && f <= 'ㅃ') || (f >= 'ぁ' && f <= 'ゖ'゙);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("exit일 때 true : ");
		String str = sc.nextLine();
		System.out.println(str.equals("exit"));
		*/
		Scanner sc = new Scanner(System.in);
		char a = 'Q';
		char b = '가';
		char c = '7';
		char d = 'z';
		char e = '딝';
		char f = 'ァ';
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(b != ' ' && b != '\t');
		System.out.println(c >= '0' && c <='9');
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		System.out.println(e >= '가' && e <= '힣');
		// http://www.unicode.org/charts/ 유니코드 참고 사이트
		System.out.println((f >= 0x3041 && f <= 0x3096) || (f >= 0x30A1 && f <= 0x30FF));
		
		System.out.print("exit를 입력하면 true가 나옵니다 > ");
		String txt = sc.nextLine();
		System.out.println(txt.equals("exit"));
		}

}
