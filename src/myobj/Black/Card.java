package myobj.Black;

public class Card {

	public String[] Pattern = {"��Ʈ", "�����̵�", "Ŭ�ι�", "���̾�"};
	public String[] Number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};
	
	public String RandomCard() {
		return Pattern[(int)(Math.random() * Pattern.length)] +
					Number[(int)(Math.random() * Number.length)];
	}
}
