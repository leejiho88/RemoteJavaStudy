package myobj.blackJack;

import java.util.Arrays;

public class Cards {

	final public static int NUM_OF_SUITS = 4;
	final public static int NUM_OF_RANKS = 13;
	final public static int CARD_SIZE = NUM_OF_SUITS * NUM_OF_RANKS;
		Card[] cards; // cards데이터 형식만 선언

	
	private int cursor; // 0으로 시작할거면 굳이 초기화를 할 필요가 없다
	
	public Cards() {
		cards = new Card[CARD_SIZE]; // 배열 크기 설정 //위에 선언한 cards 배열을 초기화
		
		for (int i = 0; i < NUM_OF_SUITS; i++) {
			for(int j = 0; j < NUM_OF_RANKS; j++) {
				cards[i * NUM_OF_RANKS + j] = new Card(i, j);
			}
		}
		shuffle(1000);
	}

	public void shuffle(int times) {
		for (int i = 0; i < times; i++) {
			int x = (int)(Math.random() * CARD_SIZE);
			int y = (int)(Math.random() * CARD_SIZE);
			
			Card temp = cards[x];
			cards[x] = cards[y];
			cards[y] = temp;
		}
	}
	
	public Card next() {		// 2. 1에서 호출한 card.next()
		// 이 부분에 알맞은 소스?
		if (cursor > CARD_SIZE - 1) {
			shuffle(500);	// 3. cards[] 이배열에 값을 넣어줌
			cursor = 0;
		}
		return cards[cursor++];
	}
	
	@Override
	public String toString() {
		return Arrays.toString(cards);
	}
	public static void main(String[] args) {
		Cards cards = new Cards();
		System.out.println(cards);
		
		for (int i = 0; i < 30; i++) { // 53장을 뽑으면 인덱스가 터진다
			System.out.println(i + "번쨰로 뽑은 카드: " + cards.next());
		}
	/*
		System.out.println(Arrays.toString(new Cards().cards));
		System.out.println(new Card(0, 0).toString());
		
		// pirntln()은 사실 전달한 인스턴스의 toString()을 호출해 콘솔에 출력하는 메서드
		System.out.println(10); // 10이라는 것에 toString()을 호출
		// 10이라는 것도 사실 인스턴스, System.out.println(new Integer(10).toString());
		// JAVA의 모든 클래스는 toString() 메서드를 가지고 있다
		// 모든 클래스의 부모인 Object 클래스가 toString()을 가지고 있다
		Object o1 = 10; // 오브젝트 클래스는 모든 클래스의 부모
		Object o2 = "ABCD";
		Object o3 = new Card(1, 5);
	*/
	}
}

class Card {
	final private static char[] SUITS = {'♠', '♣', '◇', '♡'};
	final private static String[] RANKS = 
		{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};
	private static int[] VALUES = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
	int suit;
	int rank;
	boolean hidden;
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	int getValue() {
		return VALUES[rank];
	}
	// # 클래스의 toString() 메서드를 오버라이드
	//  - 이 클래스가 문자열로 표현되어야 할 때 어떻게 보여야 하는지를 정의 해놓는다
	@Override
	public String toString() {
		if (hidden) {
			return "H";
		} else {
			return SUITS[suit] + RANKS[rank];
		}
	}
}
