package quiz;

import java.util.Scanner;

public class B09_31Game {
/*
	# 31 게임을 만들어 보세요
	
	1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택해야 한다.
		(1, 2, 3 밖에 선택할 수 없음)
		
	2. 컴퓨터는 랜덤으로 숫자를 선택한다.
	
	3. 선공은 랜덤으로 결정한다.
	
	4. 마지막에 31이상의 숫자를 부르는 플레이어가 패배한다.
	
	# 사람이 선택
	sc.nextInt();
	# 컴퓨터가 랜덤으로 선택
	Math.random();
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 0은 컴퓨터, 1은 사람
		int turn = (int)(Math.random() * 2);
		int num = 0;
		
		if (turn == 0) {
			System.out.println("컴퓨터 선공!");
		} else {
			System.out.println("당신의 선공!");
		}
		
		while (num < 31) {
				
			if (turn == 0) {
				int com = (int)(Math.random() * 3 + 1);
				num += com;
				System.out.printf("컴퓨터 %d를 골랐습니다. [현재 숫자:%d]\n", com, num);
			} else {
			//	1.
				int user = 0;
				while(user < 1 || user > 3) {
					System.out.print("1, 2, 3?");
					user = sc.nextInt();
				}
				num += user;
				
				System.out.printf("[현재 숫자:%d]\n", num);
			//	2.
				System.out.print("1, 2, 3?");
				num += sc.nextInt();
				System.out.printf("[현재 숫자:%d]\n", num);
			}
			
			// 턴은 0과 1만 반복되게함
			turn = (turn + 1) % 2;
		}
		String winner = turn == 0 ? "컴퓨터" : "플레이어";
		System.out.printf("게임 종료! %s의 승리!\n", winner);
//		System.out.printf("게임 종료! %s의 승리!\n",turn != 0 ? "컴퓨터" : "플레이어");
//		삼항 연산자
		
		if (turn == 0) {
			System.out.println("게임 종료! 컴퓨터의 승리!");
		} else {
			System.out.println("게임 종료! 플레이어의 승리!");
		}
	}
}
