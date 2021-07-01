package quiz;

import java.util.Scanner;

import myobj.PirateGame.PirateGame;
import myobj.PirateGame.Settings;

public class C07_PirateGame_1 {
/*
	1. �÷��̾�� ���ϴ� ���� ���ư��鼭 Į�� ���
	
	2. ���� �������� ���ư��� ������ �������� �����ȴ�
	
	3. �÷��̾�� �������� �� �� �ִ� (�ּ� 2��, �ִ�� ���� ���ڸ�ŭ)
	
	4. �� ���� ������ ���� ������ ������ �� �ִ�.
	
	5. ���� �������� ���� �÷��̾ �й��Ѵ�
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �����ϱ�\n2. ���ϱ�");
		System.out.println("> ");
		int select = sc.nextInt();
		
		Settings mySetting = new Settings();
		if (select == 1) {
			System.out.println("�� ��?");
			int a = sc.nextInt();
			System.out.println("�� �� ��?");
			int b = sc.nextInt();
			System.out.println("�߻� ��ư�� �?");
			int c = sc.nextInt();
			
			mySetting = new Settings(a, b, c);
		} else {
			mySetting = new Settings();
		}
		
		
		PirateGame game = new PirateGame(mySetting);
		
		game.start();
	}
}
