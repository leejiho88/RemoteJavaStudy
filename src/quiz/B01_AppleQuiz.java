package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {

	/*
	 	  ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	 	  
	 	  ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
	 	  ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.
	 */
	public static void main(String[] args) {
		
		int apple;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ������ �Է��ϼ��� > ");
		apple = sc.nextInt();
		
		// Math.ceil(a) : a�� �Ҽ� ù�� �ڸ����� �ø���.
		// Math.floor(a) : a�� �Ҽ� ù° �ڸ����� ������.
	/* 1.
	  	double basket_size = 10;
	    double basket;
		basket = apple / 10.0;
		
		System.out.println("�ʿ��� �ٱ����� ������ " + (int)Math.ceil(basket)) + "�� �Դϴ�.");
	*/
	/* 2.
	    double basket_size = 10;
	    double basket;
		basket = apple / basket_size;
		
		System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�.",
				(int)Math.ceil(basket));
	*/
//		3.
		int basket_size = 10;
		int basket;
		
		if (apple % basket_size == 0) {
			basket = apple / basket_size;
		} else {
			basket = apple / basket_size + 1;
		}
		
		if (apple < 0) {
			System.out.println("�ùٸ� ��� ������ �ƴմϴ�.");
		} else {
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�.\n", basket);
		}
		
		System.out.println("���α׷� ����!");
   /*// ���� Ǭ��		
		if (apple % 10 == 0) {
			System.out.println("�ٱ����� ������ " + (apple / 10) + "�� �Դϴ�!");
		} else if (apple % 10 != 0) {
			System.out.println("�ٱ����� ������ " + (apple / 10 + 1)  + "�� �Դϴ�!");
		}
   */
	}
}
