package quiz;

public class Polymorphism {
/*
	# 객체의 다형성
	
	 - 객체는 다양한 형태를 지닐 수 있다
	 - 사과는 사과이기도 하고 과일이기도 하다
	 - 과일은 과일이지만 사과가 아닐 수도 있다
*/
	public static void main(String[] args) {
		Fruit fruit01 = null;
		Pineapple pine01 = null;
		
		Fruit fruit = new Fruit();
		Pineapple pineapple = new Pineapple();
		
		fruit01 = fruit;
		fruit01 = pineapple; // 부모가 Fruit이기 때문에 가능, 자식 타입은 부모 타입이 될 수 있다.(업 캐스팅)
		
		pine01 = pineapple;
		// pine01 = fruit; // 부모 타입은 없는 기능이 많아서 자식 타입이 될 수 없다 (다운 캐스팅)
		
		// # 다운 캐스팅이 가능한 경우
		//	- 원래 자식 타입이었던 인스턴스가 업 캐스팅되어 있는 경우, 다시 다운 캐스팅 될 수 있다.
		System.out.println(fruit01);
		System.out.println((Pineapple) fruit01);
		pine01 = (Pineapple) fruit01; // 다운 캐스팅 (강제 캐스팅르오 해야된다)

		
		
		long a = 10; // 업 캐스팅
		long b = 10L; // 업 캐스팅이 아닐라면 뒤에 L을 붙여서 롱타입으로 한다
		
		// # 업 캐스팅 한 인스턴스 사용해보기
		DragonFruit dragon = new DragonFruit();
		Fruit f3 = dragon;
		// Fruit f3 = new DragonFruit(); // 한 줄로 나타낼 수 있다
		
		Fruit f = new Pineapple();
		Fruit f2 = new DragonFruit();
		
		// 업 캐스팅 된 상태에서 오버라이드 된 메서드를 사용하면 자식의 기능을 사용한다
		f.eat(); // fruit타입의 eat을 썼는데 pineapple 타입의 eat 출력
		
		// 업 캐스팅 된 상태에서는 본래 클래스가 갖고있던 기능을 잠시 잊어버린다
		// (업 캐스팅 된 상태에서 Pineapple에만 존재하는 기능은 사용할 수 없다)
		// f.smash();
		
		// 원래 기능을 사용하기 위해서는 다운캐스팅이 필요하다
		// ※ 컴파일러는 다운캐스팅시 발생하는 문제점을 찾아주지 못한다 (검사를 하지 못해서 오류를 찾지 못한다)
		((Pineapple) f).smash();
		// ((Pineapple) f2).smash();
		
		// instanceof 연산자를 통해 해당 인스턴스가 특정 클래스의 인스턴스인지를 검사할 수 있다.
		if (f2 instanceof Pineapple) {
			((Pineapple) f).smash();
		}
		
		System.out.println("f가 Fruit이 될 수 있는 인스턴스인가요? "
				+ (f instanceof Fruit));
		System.out.println("f가 Pineapple이 될 수 있는 인스턴스인가요? "
				+ (f instanceof Pineapple));
		System.out.println("f가 DragonFruit이 될 수 있는 인스턴스인가요? "
				+ (f instanceof DragonFruit));
		
		System.out.println("f2가 Fruit이 될 수 있는 인스턴스인가요? "
				+ (f2 instanceof Fruit));
		System.out.println("f2가 Pineapple이 될 수 있는 인스턴스인가요? "
				+ (f2 instanceof Pineapple));
		System.out.println("f2가 DragonFruit이 될 수 있는 인스턴스인가요? "
				+ (f2 instanceof DragonFruit));
	}
}

class Fruit {
	void eat() {
		System.out.println("과일을 먹었습니다.");
	}
}

class Pineapple extends Fruit {
	void eat() {
		System.out.println("[오버라이드] 파인애플을 먹었습니다.");
	}
	void smash() {
		System.out.println("파인애플을 세게 내리쳤습니다.");
	}
}

class DragonFruit extends Fruit {
	
}