package quiz;

import java.util.Scanner;

public class B09_Count369 {
/*
		����ڷκ��� ������ �ϳ� �Է¹��� ��
		�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ��ϴ��� �������
		������ ���� ���Ѵ�.
		(33, 36, 39, ... ���� ���ڴ� ������ Ĩ�ϴ�.)
*/
	public static void main(String[] args) {
/*
		�����ذ�� - ������ Ǫ�� ���� ã�� ��
		������ - �����س� ���� �ڵ�� �����ϴ� ��
		���α׷��� ��� ���ط� - ����ϴ� �� ���� ���� ���ص�
		���� - �ѱ��� ������ �� �־�� ��
*/
/*
	//	# ���� Ǭ��
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� > ");
		int num = sc.nextInt();
		
		int count = 0;
		
	    for (int i = 1; i <= num; i++) {
	    	int clap = i;
	    	
	    	while (clap != 0) {
	    		int clap_count = clap % 10;
	    	
	    		if (clap_count == 3 || clap_count == 6 || clap_count == 9) {
	    			count++;
	    		}
	    		if (clap == 0) {
	    			break;
	    		}
	    		clap /= 10;
	    	}
	    }
	    System.out.println(count + "��"); // sysout + crtl + space
	}
}
*/

	// �������� Ǭ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڼ� üũ�غ� ���� > ");
		int num = sc.nextInt();
		// 353 % 10
		// 353 / 10 % 10
		// 353 / 100 % 10
		// 353 / 1000 % 10
		//353
		int count = 0;
		
		for (int i = 1; i <= num; ++i) {
			int checkNum = i;
			
			System.out.printf("[%d]\t: ", checkNum);
			
			while (checkNum != 0) {
				int digit = checkNum % 10;
				
				if (digit != 0 && digit % 3 == 0) {
					System.out.print("¦");
					count++;
				}
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("�ڼ��� �� %dȸ �ƽ��ϴ�.\n", count);
	}
}
