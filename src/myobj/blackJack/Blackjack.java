package myobj.blackJack;

import java.util.Scanner;

public class Blackjack {

	Scanner sc;
	String jihoo = "";
	int number11 = 11;
//	Cards 타입의 변수 cards
	Cards cards = new Cards();
	Player player;
	Dealer dealer;
	
	public Blackjack() {
		cards = new Cards();
		player = new Player();
		dealer = new Dealer();
		sc = new Scanner(System.in);
	}
	
	public void new_game() {
		dealer.add(cards.next()); // 1.dealer클래스에 add호출
		dealer.add(cards.next());
		
//		player.add(new Card(0, 0)) // (0, 0) 안에 있는 값이 파라미터 매개변수
		player.add(cards.next());
		player.add(cards.next());
		
		int pv = -1;
		while (choice()) {
			player.add(cards.next());
			
			pv = player.calc();
			if (pv >= 21) {
				break;
			}
		}
		
		if (pv <= 21) {
			// 딜러가 마저 카드를 여는 로직
			open();
		} else {
			System.out.println("플레이어 버스트!!!");
		}
		
		last_info();
		whowin();
	}
	
	private void whowin() {
		int dv = dealer.calc();
		int pv = player.calc();
		
		if (dv == pv) {
			System.out.println("무승부!");
		} else if (dv > 21 && pv <= 21) {
			System.out.println("플레이어 승리!");
		} else if (pv > 21 && dv <=21) {
			System.out.println("딜러의 승리!");
		} else if (pv > dv) {
			System.out.println("플레이어의 승리!");
		} else {
			System.out.println("딜러의 승리!");
		}
	}
	
	private void open() {
		
		while (dealer.calc() < 17) {
			dealer.add(cards.next());
		}
		dealer.tables[0].hidden = false;
	}
	
	private void info() {
		System.out.println("딜러의 카드: " + dealer);
		System.out.println("플레이어: " + player + ", value: " + player.calc());
	}
	
	private void last_info() {
		System.out.println("딜러의 카드: " + dealer + ", value: " + dealer.calc());
		System.out.println("플레이어: " + player + ", value: " + player.calc());
	}
	
	private int input(String notice) {
		System.out.print(notice);
		return sc.nextInt();
	}
	
	private boolean choice() {
		while (true) {
			info();
			int choice = input("1. hit\t2. stand > ");
			
			if (choice == 1) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		new Blackjack().new_game();
		
//		Blackjack blackjack = new Blackjack();
//		
//		while (true) {
//			blackjack.new_game(); // 끝나자마자 게임을 계속 이어서 할수 있음
//		} // 그러면 배열이 넘어가는 순간 터지므로, 끝나는 시점에 새 플레이어, 딜러를 넣는다
	}
}
