package quiz;

import java.util.Scanner;

public class B11_CountAlphabet1 {

	public static void main(String[] args) {
/*
		System.out.print("아무 문장이나 입력해주세요 >> ");
		String text = new Scanner(System.in).nextLine();
		
		final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklnmopqrstuvwxyz"; //심볼
	//	final이 붙으면 내용 수정이 불가능하다
		
		//심볼 문자열 길이만큼 int 배열 생성
		int[] symbol_count = new int[SYMBOLS.length()];
		
	//	Common sense is not so common.
	//	입력받은 문자열 길이만큼 반복
	//	for (int i = 0, len = text.length(); i < len; ++i) {
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			System.out.println("이번에 검사할 문자는 '" + ch + "'입니다.");

	//		심볼의 길이만큼 반복			
	//		for (int j = 0, len2 = SYMBOLS.length(); j < len2; ++j) {
			for (int j = 0 ; j < SYMBOLS.length() ; ++j) {
				if (ch == SYMBOLS.charAt(j)) {
					symbol_count[j]++;
					System.out.println("'" + ch + "'는 SYMBOLS의 "
						+ j + "번쨰에 있으므로 symbol_count의 " + j
						+ "번째 값을 증가시킵니다");
					break;
				}
			}
		}
	}
}
*/
/*
		System.out.print("아무 문장이나 입력해주세요 >> ");
		String text = new Scanner(System.in).nextLine();

		int[] alphabet_count = new int[52];
		
		for (int i = 0, len = text.length(); i < len; ++i) {
			
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				alphabet_count[ch - 'a']++;
			} else if (ch >= 'A' && ch <= 'Z') {
				alphabet_count[ch - 'A' + 26]++;
			}
		}
		
		for (int i=0 ; i<alphabet_count.length ; i++) {

			System.out.printf("대문자 %c는 %d번 등장했습니다.", 'A' + i - 26, alphabet_count[i]);
			System.out.printf("대문자 %c는 %d번 등장했습니다.", 'a' + i - 26, alphabet_count[i]);
		}
	}
}
*/

		System.out.print("아무 문장이나 입력해주세요 >> ");
		String text = new Scanner(System.in).nextLine();
		
		int[] lowercount = new int[26];
		int[] uppercount = new int[26];
		
		for (int i = 0, len = text.length(); i < len; ++i) {
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				lowercount[ch - 'a']++;
			} else if (ch >= 'A' && ch <= 'Z') {
				uppercount[ch - 'A']++;
			}
		}
		
		for (int i = 0; i < 26; ++i) {
			System.out.printf("소문자 %c는 %d번 등장했습니다.", 'a' + i, lowercount[i]);
			System.out.printf("대문자 %c는 %d번 등장했습니다.", 'A' + i, uppercount[i]);
		}
	}
}
