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
		
		eraser.use(); // Item Ŭ������ �ִ� �߻�޼ҵ� use ����
		eraser.info();
	}
	
	public void purchase(Item item) {
		this.money -= item.price;
		System.out.println(item.name + "�� ��� " + this.money + "���� ���ҽ��ϴ�.");
		
	}
}

