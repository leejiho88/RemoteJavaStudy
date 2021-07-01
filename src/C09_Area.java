
public class C09_Area {
/*
	# 변수의 생명주기
	
	 - 변수는 해당 변수를 선언한 {}를 벗어나면 죽는다
	 - 정확하게 지칭하지 않으면 기본적으로 가장 가까운 위치의 변수를 사용한다
*/
	// 인스턴스 변수 (instance variable)
	// a.k.a 멤버(member), 필드(field), 속성(attribute), 속성(property)
	int a = 15;
	
	void methodA() {
		// 지역 변수 (local variable) : 메서드 내부에서 선언된 변수
		int a = 10;
		
		System.out.println(a);	// 즉 a는 methodA()에서 선언 했으므로 methodA()안에서만 사용가능
								// 그냥 a를 지칭 하면 가장 가까이에 있는 변수를 선택함
	}
	
	void methodB() {
		System.out.println(a);
		
		if (true) {
			int b = 0;
			System.out.println(a);
			
			if (true) {
				b = 123;
				System.out.println(a);
				System.out.println(b);
			}
			System.out.println(b);
		}
	//	System.out.println(b); // 지역변수 b는 중괄호를 나왔으므로 사용불가
	}
	
	class Area2 {
		public Area2() {
			System.out.println(a);	// class내부의 class에서는 사용가능
		}
		
		class Area3{
			public Area3() {
				System.out.println(a);
			}
		}
	}
	
	public static void main(String[] args) {
		new C09_Area().new Area2();
	}
}