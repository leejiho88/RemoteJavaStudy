package quiz;

import java.util.Scanner;

import myobj.fivedice.Dice;

public class C14_FiveDice {
/*
	�������� 5���� �ֻ����� ���� ������ �ֻ����� ����� ���� ������ �����ϴ� Ŭ������ ��������
	
	1. Ǯ�Ͽ콺 (���� ���� 2�� + 3��) (11666/2332/55252)
	2. ���� ��Ʈ����Ʈ (1234/2345/3456)
	3. ���� ��Ʈ����Ʈ (12345/23456)
	4. 4 ���̽� (���� ���� 4��)
	4. 5 ���̽� (Yacht) (�������� 5��)
*/
	public static void main(String[] args) {
		Dice d1 = new Dice();
		String answer;
		int answerNum;
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �����Ͻðھ��? (y/n): ");
		answer = sc.next();
		if (answer.equals("y")) {
			d1.roll();
			d1.countDices();
			d1.checkAll();
		}
		while(true) {
			System.out.print("�ٽ� �����ðھ��? (y/n): ");
			answer = sc.next();
			if (answer.equals("y")) {
				System.out.print("�� ���� �ٽ� �����ðھ��? (1~5): ");
				answerNum = sc.nextInt();
				if (answerNum == 5) {
					d1.roll();
				} else if (answerNum >= 1 && answerNum < 5) {
					for (int i = 0; i < answerNum; i++) {
						int index = 0;
						System.out.print("�� ��° �ֻ����� �ٽ��ұ��? (1~5): ");
						index = sc.nextInt();
						d1.rollOne(index);
					}
				}
			} else if(answer.equals("n")){
				System.out.println("bye��");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
			d1.countDices();
			d1.checkAll();
			System.out.println();
		}
	}
}
