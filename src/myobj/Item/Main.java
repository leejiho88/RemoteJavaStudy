package myobj.Item;


public class Main {
	
	int money;
	
	public Main() {
		money = 10000;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Eraser eraser = new Eraser();
		m.purchase(new Glue());
		m.purchase(new Sharp());
		m.purchase(new Eraser());
		
		eraser.use(); // Item 클래스에 있는 추상메소드 use 사용법
		eraser.info();
	}
	
	public void purchase(Item item) {
		this.money -= item.price;
		System.out.println(item.name + "을 사고 " + this.money + "원이 남았습니다.");
		
	}
}

