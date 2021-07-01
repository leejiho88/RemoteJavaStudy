package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
/*
		�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
		
		�� ��, �ʿ���� ������ ������� �� ��
		
		  ex) 0�� 0�� 13�ð� 0�� 5���� ��� -> 13�ð� 0�� 5�ʸ� ���;� ��
*/
	public static void main(String[] args) {
		
		System.out.print("�� > ");
		int second = new Scanner(System.in).nextInt();
		
		int y = 0, d = 0, h = 0, m = 0, s = 0;
		
		final int SECOND_PER_YEAR = 356 * 24 * 60 * 60;
		final int SECOND_PER_DAY = 24 * 60 * 60;
		final int SECOND_PER_HOUR = 60 * 60;
		final int SECOND_PER_MINUTE = 60;
		
		y = second / SECOND_PER_YEAR;
		second %= SECOND_PER_YEAR;
		
		d = second / SECOND_PER_DAY;
		second %= SECOND_PER_DAY;
		
		h = second / SECOND_PER_HOUR;
		second %= SECOND_PER_HOUR;
		
		m = second / SECOND_PER_MINUTE;
		second %= SECOND_PER_MINUTE;
		
		boolean exist = false;
		
		if (y != 0) {
			System.out.print(y + "�� ");
			exist = true;
		}
		if (d != 0 || exist) {
			System.out.print(d + "�� ");
			exist = true;
		}
		if (h != 0 || exist) {
			System.out.print(h + "�ð� ");
			exist = true;
		}
		if (m != 0 || exist) {
			System.out.print(m + "�� ");
			exist = true;
		}
		System.out.println(second + "��");
	}		
}