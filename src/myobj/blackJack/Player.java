package myobj.blackJack;

public class Player {

	final static int MAX_TABLE_SIZE = 11;
	
	Card[] tables; //Card 형식의 tables 배열 선언
	
	int count;
	int ace_count; // 
	
	public Player() {
		tables = new Card[MAX_TABLE_SIZE];
	}
	
	void add(Card card) {
		tables[count++] = card;
		
		if (card.rank == 0) {
			ace_count++;
		}
	}
	
	int calc() {
		int value = 0;
		for (int i = 0; i < count; i++) {
			value += tables[i].getValue();
		}
		int i = 0;
		while (ace_count - i > 0 && value > 21) { // 인스턴스의 값을 영구적으로 변경시키면 문제가 생김
			value -= 10;
			i++;
		}
		return value;
	}
	
	@Override
	public String toString() {
		String str = "";
		
		for (int i = 0; i < MAX_TABLE_SIZE; i++) {
			if (tables[i] == null) {
				break;
			} else {
				str += "[" + tables[i] + "]";
			}
		}
		
		return str;
	}
}
