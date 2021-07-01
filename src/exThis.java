
public class exThis {

	//클래스 필드
	int a;
	
	// 메소드
	void set_exThis(int a) {
	// 클래스 필드 변수 a값에 set_this 매개변수 a 값을 넣음
	this.a = a;
	}
	
	// 생성자 선언
	public exThis(int a) { // 클래스 생성자로 선언하여 사용할 수도 있습니다
		this.a = a;
	}
	
	// 메소드
	public int use_exThis() {
		return a;
	}
	
	
}
