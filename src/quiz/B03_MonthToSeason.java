package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {

	/*
	  	����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ����غ�����
	  	(switch-case���� ����� ��)	  
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String season;
		
		System.out.print("���� �Է��ϼ��� > ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12: case 1: case 2:
			season = "�ܿ�";
			break;
		case 3: case 4: case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "����";
			break;
		default:
			season = "����";
			break; // default�� �Ƚ��ָ� �Ʒ� season�� �������� ���.(�� ���� �ְ� �ȵ� �� ���ִ� Ȯ���� ���� �ϱ� ����)
		}
		if (month < 1 || month >12) {
			System.out.println("�߸��� �����Դϴ�.");
		} else {
			System.out.printf("%d���� %s�Դϴ�.\n", month, season);
		}
		/*
		switch (month) {
		case 1:
			System.out.println("������ �ܿ� �Դϴ�.");
			break;
		case 2:
			System.out.println("������ �ܿ� �Դϴ�.");
			break;	
		case 3:
			System.out.println("������ �� �Դϴ�.");
			break;
		case 4:
			System.out.println("������ �� �Դϴ�.");
			break;
		case 5:
			System.out.println("������ �� �Դϴ�.");
			break;
		case 6:
			System.out.println("������ ���� �Դϴ�.");
			break;
		case 7:
			System.out.println("������ ���� �Դϴ�.");
			break;
		case 8:
			System.out.println("������ ���� �Դϴ�.");
			break;
		case 9:
			System.out.println("������ ���� �Դϴ�.");
			break;
		case 10:
			System.out.println("������ ���� �Դϴ�.");
			break;
		case 11:
			System.out.println("������ ���� �Դϴ�.");
			break;
		case 12:
			System.out.println("������ �ܿ� �Դϴ�.");
			break;
		default:
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
		}
		*/
		/*
		boolean winter = (month == 1 && month == 2 && month == 12);
		boolean spring = (month == 3 && month == 4 && month == 5);
		boolean summer = (month == 6 && month == 7 && month == 8);
		boolean autumn = (month == 9 && month == 10 && month == 11);
		*/
		
	}
}
