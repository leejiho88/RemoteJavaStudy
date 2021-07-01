package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {
/*
	사용자로부터 문장을 하나 입력받고
	해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
	(대소문자도 구분할 것)
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 > ");
		String str = sc.nextLine();

		//알파벳이 26자, 대소문자 합쳐서 52
		//a 코드 : 97, A 코드 : 65
		int[] aCnt = new int[52];
		
		//입력받아서 배열 증가시키는 부분
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if ((ch >= 'a' && ch <= 'z')) {
				aCnt[ch-97]++;
			} else if(ch >= 'A' && ch <= 'Z') {
				aCnt[ch-65+26]++;
			}
		}
		
		//출력
		for( int i=0 ; i<aCnt.length ; i++ ) {
			if( aCnt[i] != 0) {
				if (i<26) {
					System.out.printf("%c의 갯수 : ",i+97);
					System.out.println(aCnt[i]);
				}
				else {
					System.out.printf("%c의 갯수 : ",i+65-26);
					System.out.println(aCnt[i]);
				}
			}
		}
		
		sc.close();
	}
}
