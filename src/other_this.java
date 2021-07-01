
public class other_this {

	public static void main(String[] args) {
		
		//This 클래스의 객체화
//		exThis t = new exThis();
//		t.set_exThis(4); // 4를 넣어 set_this 메소드를 사용
		
		exThis t1 = new exThis(4);
		t1.use_exThis(); // use_test 메소드를 사용 => 4를 리턴
		
	}
}
