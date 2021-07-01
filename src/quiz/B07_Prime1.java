package quiz;

import java.util.Scanner;

public class B07_Prime1 {
/*
	����ڷκ��� ����(���)�� �Է¹����� 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	(������ �Է��ϸ� �ٽ� ����� �Է��ϰ� �ϱ�)
	
	�� �Ҽ�: ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ����
	
		2, 3, 5, 7, 11, 13, ...
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� > ");
		int num = sc.nextInt();
		
		for (; num < 0;) {
			System.out.print("�߸��� �����Դϴ�.");
			System.out.print("�ٽ� �Է����ּ��� > ");
			
			num = sc.nextInt();
		}
		
		for (int i = 2; i <= num; ++i) {
			boolean prime = true;
			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime) {
				System.out.println(i);
			}
		}
	}
}