package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {

	/*
	   	������ �Է¹����� ������ �ش��ϴ� �˸��� ����� ������ִ� ���α׷��� ��������
	   	
	   		90�� �̻� : A
	   		80�� �̻� : B
	   		70�� �̻� : C
	   		60�� �̻� : D
	   		�� ��	 : F
	   		
	   	�� ��ȿ�� ������ 0 ~ 100�� �Դϴ�.
	  	
	 */
		
	public static void main(String[] args) {
		/*
	 // �� �Է��� �޾��� ���� �߸��� ���� ���� �Ÿ��� ���� ����
		Scanner sc = new Scanner(System.in);
		
		char grade = 'Z';
	 // String msg;
		int score;
		
		System.out.print("������ �Է����ּ��� > ");
		score = sc.nextInt();
		
		if (score < 0 || score >100) {
			System.out.println("�߸��� �����Դϴ�.");
			grade = 'F';
		//	msg = "�߸��� ���� �Է��ϼ̽��ϴ�.";
		} else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("����� ����� %c�Դϴ�.\n", grade);
		//	msg = String.format("����� ����� %c�Դϴ�.", grade);
		//	System.out.println(msg);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. > ");
		int score = sc.nextInt();
		
		if(score < 0 || score >100) {
			System.out.println("�ùٸ� ������ �Է��ϼ���.");
		} else if (score >= 90 && score <= 100) {
			System.out.println("A �Դϴ�.");
		} else if (score >= 80 && score < 90) { // score < 90, ���� if������ �ɷ����� �� ���̱� ������ �ش� ������ �� �ʿ䰡 ����
			System.out.println("B �Դϴ�.");
		} else if (score >= 70) {
			System.out.println("C �Դϴ�.");
		} else if (score >= 60) {
			System.out.println("D �Դϴ�.");
		} else {
			System.out.println("F �Դϴ�.");
		}
		
		
	}
	
}
