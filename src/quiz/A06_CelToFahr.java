package quiz;

import java.util.Scanner;

public class A06_CelToFahr {

	/*
	 	����ڷκ��� ���� �µ��� �Է¹����� ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
	 	(��ȯ ������ �˻� ���, ����� �Ҽ� ù° �ڸ�����)
	*/
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� �µ��� �� �� �ΰ���?");
//		
//		double t = sc.nextInt();
//		
//		System.out.println("���� �µ��� : " + ((9 / 5 * t) + 32) + " �� �Դϴ�");
	
	double cel, fahr;
	
	System.out.print("����(��) �µ��� �Է� > ");
	cel = new Scanner(System.in).nextDouble();
	
//	Scanner sc = new Scanner(System.in)
//	t = sc.nextInt();
//	�̷��� ��� �� ���� sc�ڸ��� �ٷ� new Scanner(System.in) �̰��� ����
//	sc�� �ݺ������� ��� �� ��쿡�� ���� �ʴ�
	
	// (0�� x 9/5) + 32 = 32��
	fahr = cel * 9 / 5 + 32;
	
	System.out.printf("%.1f�ɴ� %.1f���Դϴ�.", cel, fahr);
	
	
	
	
	
	}
}
