package quiz;

import java.util.Scanner;

public class B09_GCD {
/*
		�� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����
		# �ִ� �����
		
		 - �� ������ ����� �� ���� ū �����
		 
		ex)
		20 [1, 2, 4, 5, 10, 20]
		50 [1, 2, 5, 10, 25, 50]
		> �ִ� ����� : 10
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��� �ּ��� > ");
		int num = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��� �ּ��� > ");
		int num1 = sc.nextInt();
		
	//	int max = num > num1 ? num : num1;
	//	int min = num < num1 ? num : num1;
		
		int max = Math.max(num, num1);
		int min = Math.min(num, num1);
		
		int gcd = 1;
		
		for (int i = 1; i <= min; ++i) {
			
			if (min % i == 0 && max % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d�� %d�� �ִ� ������� %d�Դϴ�.", num, num1, gcd);
	}
}
/*
 		int start, end;
		if (
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				gcd = i;
				if (num1 % i == 0) {
				if (i < num1)
					System.out.println();
				}
			}	
		}

*/