package quiz;

import java.util.Scanner;

public class A06_GuessAge {

	public static void main(String[] args) {
	 
		/*
			����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹�����
			�� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
		*/ 
	 /*
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("����� �¾ �ش� �����ΰ���?");
	 int year = sc.nextInt();
	 System.out.print("���ش� ��⵵ �ΰ���?");
	 int year1 = sc.nextInt();
	 
	 System.out.println("����� �ѱ� ���̴� : "+ (year1 - year + 1));
	 */
	 
	 
	  Scanner sc = new Scanner(System.in);
	  int birthYear, thisYear;
	  int age;
	  
	  System.out.print("�¾ �ظ� �Է� > ");
	  birthYear = sc.nextInt();
	   
	  System.out.print("���ظ� �Է� > ");
	  thisYear = sc.nextInt();
	  
	  age = thisYear - birthYear + 1;
	  
//	  System.out.println("����� ���̴� "
//	  			+ (thisYear - birthYear + 1) + "�� �Դϴ�.");
 
	  System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
	  
	 
	 
	 
 }
	
}
