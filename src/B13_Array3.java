
public class B13_Array3 {
	// 겍체 배열의 초기화 (Array of Objects)
	
	public static void main(String[] args) {

		// 길이가 8인 Car 객체배열 선언
		// 각 배열에는 아직 NULL값만 존재
		B13_Array3[] arrays = new B13_Array3[8];
	
		// 배열안의 Car클래스를 초기화시켜줘야 한다.
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = new B13_Array3();
		}
	
		System.out.println(arrays[1]);
	}
}