package quiz;

import java.util.Scanner;

public class B07_Prime {

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
			System.out.println("�߸��� �����Դϴ�. �ٽ��Է����ּ���");
			System.out.print("> ");
			
			num = sc.nextInt();
		}
//		System.out.println(2);
//		for (int chkNum = 3; chkNum <= num; ++chkNum) {
		for (int chkNum = 2; chkNum <= num; ++chkNum) {
			
			boolean prime = true;
	
//			for (int divNum = 3; divNum <= Math.sqrt(chkNum); divNum += 2) {
			for (int divNum = 2; divNum <= Math.sqrt(chkNum); divNum += 2) {
	
				if(chkNum % divNum == 0) {
					prime = false;
				}
			}
		
			if (prime) {
				System.out.println(chkNum);
			}
		}
	}		
}	

