
public class A10_TypeCasting {
	
	/*
	 	# 타입 캐스팅
	 	
	 	 1. 타입이 자연스럽게 변하는 경우(변하는지도 모르게..) (암묵적인 타입 캐스팅)
	 	 	- 작은 타입에서 큰 타입으로 변할 때는 아무 문제가 생기지 않는다
	 	 	- 때문에 자연스럽게 타입이 변한다
	 	 	
	 	 2. 타입을 강제로 변환시키는 경우 ( 명시적인 타입 캐스팅)
	 	 	- 타입을 변환 시킬 때 문제가 생길 가능성이 있는 경우에는
	 	 	  프로그래머가 직접 명시적으로 타입을 변환시켜야 한다
	 	 	  
	 	# 타입 크기 순서
	 		
	 		byte < short <= char < int < long < float < double
	 		
	 		- long 타입은 8바이트, float은 4바이트지만 숫자의 표현 범위는 float이 더 넓다.
	 		- 실수 타입은 정수 타입보다 표현 범위가 넓다
	 */
	
	public static void main(String[] args) {
//		1.
//		char ch = 75;
//		int num = ch; // int 타입이 더 크기때문에 문제가 없다
//				
//		System.out.println((char)75);
//		2.
//		int i = 3000;
//		byte b = (byte)i;
//		
//		System.out.println(b); // 3000이 byte의 범위를 초과해 3000만큼 byte용량에서 돌고 남은 값이 표시
//		3.
//		int num = 10;
//		byte b = num; // 일단 막는다
//		byte b1 = (byte)num; // 강제로 쓰면 내가 인지하고 쓴다는 것을 알려주기 때문에 빨간줄이 표시가 안된다.
//		4.
		// 음수까지 포함하고있는 타입은 char타입으로 변환 될때 문제가 생길 위험이 있다
		byte b = 70;
//		char ch = b; // char가 더 크긴 하지만 char에는 음수값이 없으므로 일단 막는다
		char ch = (char)b;
		
		System.out.println((int)ch);
		
		// 일반적으로는 크기가 큰 타입에서 자근 타입으로 변할 때도 명시적인 타입 캐스팅이 필요하다
		float f = 123.23f;
		long l = (long)f; // 소수점 아래가 짤린다
		
		System.out.println(l);
		
		// 문제가 생기지는 않지만같은 값이 다르게 해석될 필요가 있는 경우에도 타입 캐스팅이 필요하다
		// 명시적 타입 캐스팅이 필요하다
		System.out.println('A');
		System.out.println((int)'A');
		
		System.out.println(80);
		System.out.println((char)80);
		
	}

}
