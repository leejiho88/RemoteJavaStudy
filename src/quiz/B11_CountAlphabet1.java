package quiz;

import java.util.Scanner;

public class B11_CountAlphabet1 {

	public static void main(String[] args) {
/*
		System.out.print("�ƹ� �����̳� �Է����ּ��� >> ");
		String text = new Scanner(System.in).nextLine();
		
		final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklnmopqrstuvwxyz"; //�ɺ�
	//	final�� ������ ���� ������ �Ұ����ϴ�
		
		//�ɺ� ���ڿ� ���̸�ŭ int �迭 ����
		int[] symbol_count = new int[SYMBOLS.length()];
		
	//	Common sense is not so common.
	//	�Է¹��� ���ڿ� ���̸�ŭ �ݺ�
	//	for (int i = 0, len = text.length(); i < len; ++i) {
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			System.out.println("�̹��� �˻��� ���ڴ� '" + ch + "'�Դϴ�.");

	//		�ɺ��� ���̸�ŭ �ݺ�			
	//		for (int j = 0, len2 = SYMBOLS.length(); j < len2; ++j) {
			for (int j = 0 ; j < SYMBOLS.length() ; ++j) {
				if (ch == SYMBOLS.charAt(j)) {
					symbol_count[j]++;
					System.out.println("'" + ch + "'�� SYMBOLS�� "
						+ j + "������ �����Ƿ� symbol_count�� " + j
						+ "��° ���� ������ŵ�ϴ�");
					break;
				}
			}
		}
	}
}
*/
/*
		System.out.print("�ƹ� �����̳� �Է����ּ��� >> ");
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

			System.out.printf("�빮�� %c�� %d�� �����߽��ϴ�.", 'A' + i - 26, alphabet_count[i]);
			System.out.printf("�빮�� %c�� %d�� �����߽��ϴ�.", 'a' + i - 26, alphabet_count[i]);
		}
	}
}
*/

		System.out.print("�ƹ� �����̳� �Է����ּ��� >> ");
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
			System.out.printf("�ҹ��� %c�� %d�� �����߽��ϴ�.", 'a' + i, lowercount[i]);
			System.out.printf("�빮�� %c�� %d�� �����߽��ϴ�.", 'A' + i, uppercount[i]);
		}
	}
}
