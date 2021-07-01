package myobj.Black;

public class Card {

	public String[] Pattern = {"하트", "스페이드", "클로버", "다이아"};
	public String[] Number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};
	
	public String RandomCard() {
		return Pattern[(int)(Math.random() * Pattern.length)] +
					Number[(int)(Math.random() * Number.length)];
	}
}
