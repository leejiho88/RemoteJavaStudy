package quiz;

import java.util.Scanner;

public class B09_ConvertSecond1 {

	public static void main(String[] args) {
	//	# �迭�� Ȱ���� ���
		System.out.print("�� >");
		int second = new Scanner(System.in).nextInt();
		
		int[] converted = new int[4];
		int[] seconds = new int[4];
	//	int[] seconds = {			// �� ������� ���� �ǹ� �̴�. 
	//			365 * 24 * 60 * 60;	// �� ���� ������ ���� �Ҵ��ϰ� ���� ���� �迭�� �����ϰ�
	//	}							// �Ʒ����� ������ ������ �迭������ �ش�
		String[] units = {"��", "��", "��", "��"};
		
		seconds[0] = 365 * 24 * 60 * 60;
		seconds[1] = 24 * 60 * 60;
		seconds[2] = 60 * 60;
		seconds[3] = 60;
		
		for (int i = 0; i <converted.length; ++i) {
			converted[i] = second / seconds[i];
			second %= seconds[i];
		}
		
		boolean exist = false;
		
		for (int i = 0; i < converted.length; ++i) {
			if (converted[i] != 0) {
				System.out.printf("%d%s ", converted[i], units[i]);
				exist = true;
			}
		}
		System.out.printf("%d��", second);
		System.out.println();
	}
}
