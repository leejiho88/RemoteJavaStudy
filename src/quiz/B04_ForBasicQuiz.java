package quiz;

import java.util.Scanner;

public class B04_ForBasicQuiz {

	/*
	  	����ڰ� ���ڸ� �Է� ���� ��
	  	
	  	1. 10���� �Է��� ���ڱ����� ������ ���غ�����
	  	
	  	2. 1000���� �Է��� ���ڱ��� ������� ������ ��������
	  	
	  	3. 1���� �Է��� ���� ������ 5�� ����� ����غ�����
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� > ");
		int user = sc.nextInt();
		
		int sum = 0; // �� �Լ��� ����� �ְ�, �Լ����� ��µǴ� i�� ���� �������� �հ踦 ���Ѵ�.
		
		int start, end; // ����� ���ÿ� �ʱ�ȭ�� �������� ��Ȳ�� ���� �޶����� �ִ�.
		
		if (user > 10) {	//	�������� ����� �ؼ� ������ �Է��ҽÿ��� ��� �ǰ� �� �� �ִ�
			start = 10;		//	10�� ������ �۵�
			end = user;		//
		} else {			//	user�� �Է��� ���� ������ �۵�
			start = user;	//
			end = 10;		//
		}					//
		
		for (int i = start; i <= end; ++i) {
			sum += i;
		}
		System.out.printf("10���� %d������ ������ %d�Դϴ�.", user, sum);
		
		if (user > 1000) {
			for (int i = 1000; i <= user; ++i) {
				System.out.printf("1000���� %d���� ���: %d\n", user, i);
			}
		} else {
			for (int i = 1000; i >= user; --i) {
				System.out.printf("1000���� %d���� ���: %d\n", user, i);
			}
		}
		
		if (user > 1) {
			for (int i = 1; i <= user; ++i) {
				if (i % 5 == 0) {
					System.out.printf("1���� %d���� 5�� ����� ���: %d\n", user, i);
				}
			}
		} else {
			for ( int i = 1; i >= user; --i) {
				if (i % 5 == 0) {
					System.out.printf("1���� %d���� 5�� ����� ���: %d\n", user, i);
				}
			}
		}
	}
}
