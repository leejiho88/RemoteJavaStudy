package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {
/*
	����ڷκ��� ������ �ϳ� �Է¹ް�
	�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
	(��ҹ��ڵ� ������ ��)
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� > ");
		String str = sc.nextLine();

		//���ĺ��� 26��, ��ҹ��� ���ļ� 52
		//a �ڵ� : 97, A �ڵ� : 65
		int[] aCnt = new int[52];
		
		//�Է¹޾Ƽ� �迭 ������Ű�� �κ�
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if ((ch >= 'a' && ch <= 'z')) {
				aCnt[ch-97]++;
			} else if(ch >= 'A' && ch <= 'Z') {
				aCnt[ch-65+26]++;
			}
		}
		
		//���
		for( int i=0 ; i<aCnt.length ; i++ ) {
			if( aCnt[i] != 0) {
				if (i<26) {
					System.out.printf("%c�� ���� : ",i+97);
					System.out.println(aCnt[i]);
				}
				else {
					System.out.printf("%c�� ���� : ",i+65-26);
					System.out.println(aCnt[i]);
				}
			}
		}
		
		sc.close();
	}
}
