package quiz;

import java.util.Scanner;

import myobj.PirateGame.PirateGame;
import myobj.PirateGame.Settings;

public class C07_PirateGame_1 {
/*
	1. 플레이어는 원하는 곳에 돌아가면서 칼을 찌른다
	
	2. 해적 아저씨가 날아가는 구멍이 랜덤으로 설정된다
	
	3. 플레이어는 여러명이 될 수 있다 (최소 2인, 최대는 구멍 숫자만큼)
	
	4. 새 게임 생성시 구멍 개수를 설정할 수 있다.
	
	5. 해적 아저씨를 날린 플레이어가 패배한다
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 세팅하기\n2. 안하기");
		System.out.println("> ");
		int select = sc.nextInt();
		
		Settings mySetting = new Settings();
		if (select == 1) {
			System.out.println("몇 명?");
			int a = sc.nextInt();
			System.out.println("통 몇 개?");
			int b = sc.nextInt();
			System.out.println("발사 버튼은 몇개?");
			int c = sc.nextInt();
			
			mySetting = new Settings(a, b, c);
		} else {
			mySetting = new Settings();
		}
		
		
		PirateGame game = new PirateGame(mySetting);
		
		game.start();
	}
}
