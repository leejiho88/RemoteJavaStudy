
public class C13_LocalInnerClass {
/*
	# 지역 내부 클래스
	
	 - 클래스는 사실 메서드 내부에서도 정의할 수 있다
	 - 메서드가 끝나면 해당 클래스도 수명이 다한다
*/
	public static void main(String[] args) {
		
		// 메서드 내부에도 클래스를 사용할 수 있음
		class Apple{
			int price;
			int color;
			
			public Apple(int price, int color) {
				this.price = price;
				this.color = color;
			}
			@Override
			public String toString() {
				return "price: " + price + "원\ncolor값: " + color;
			}
		}
		
		Apple a = new Apple(1000, 1);
		System.out.println(a);
		
		// 다음과 같은 상황에 o.check()를 실행할 수 없는 이유를 설명하고,
		// check()를 실행하려면 어떻게 해야하는지 200자 이내로 서술하시오.
		// 오브젝트 타입이 되면서 바나나가 가지고 있던 값을 잃어버린다
//		Object o = banana();
//		o.check();
		
		// Fruitt타입에 상속시켜 바나나값을 받고 출력하면 된다
		Fruitt fruit = banana();
		System.out.println("바나나는 개당 " + fruit.check() + "원입니다.");
	}
	
	// 다른곳으로 결과를 반환하고 싶다
	// return타입은? Banan > banana를 리턴하려면 Banana타입이 되어야 한다
	// 하지만 외부에서는 Banana를 모른다
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
		
//		System.out.println(new Banana(11, 3000).check() + "원");
		// 출력이 아니라 결과를 반환하고 싶다
		return new Banana(11, 3000);
	}
}

abstract class Fruitt {
	abstract double check();
}
