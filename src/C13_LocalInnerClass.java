
public class C13_LocalInnerClass {
/*
	# ���� ���� Ŭ����
	
	 - Ŭ������ ��� �޼��� ���ο����� ������ �� �ִ�
	 - �޼��尡 ������ �ش� Ŭ������ ������ ���Ѵ�
*/
	public static void main(String[] args) {
		
		// �޼��� ���ο��� Ŭ������ ����� �� ����
		class Apple{
			int price;
			int color;
			
			public Apple(int price, int color) {
				this.price = price;
				this.color = color;
			}
			@Override
			public String toString() {
				return "price: " + price + "��\ncolor��: " + color;
			}
		}
		
		Apple a = new Apple(1000, 1);
		System.out.println(a);
		
		// ������ ���� ��Ȳ�� o.check()�� ������ �� ���� ������ �����ϰ�,
		// check()�� �����Ϸ��� ��� �ؾ��ϴ��� 200�� �̳��� �����Ͻÿ�.
		// ������Ʈ Ÿ���� �Ǹ鼭 �ٳ����� ������ �ִ� ���� �Ҿ������
//		Object o = banana();
//		o.check();
		
		// FruittŸ�Կ� ��ӽ��� �ٳ������� �ް� ����ϸ� �ȴ�
		Fruitt fruit = banana();
		System.out.println("�ٳ����� ���� " + fruit.check() + "���Դϴ�.");
	}
	
	// �ٸ������� ����� ��ȯ�ϰ� �ʹ�
	// returnŸ����? Banan > banana�� �����Ϸ��� BananaŸ���� �Ǿ�� �Ѵ�
	// ������ �ܺο����� Banana�� �𸥴�
//	public static Object banana() {
	public static Fruitt banana() {
		class Banana extends Fruitt {
			int bana_count;
			int price;
			
			public Banana(int bana_count, int price) {
				this.bana_count = bana_count;
				this.price = price;
			}
			
			double check() {
				return price / (double)bana_count;
			}
		}
		
//		System.out.println(new Banana(11, 3000).check() + "��");
		// ����� �ƴ϶� ����� ��ȯ�ϰ� �ʹ�
		return new Banana(11, 3000);
	}
}

abstract class Fruitt {
	abstract double check();
}
