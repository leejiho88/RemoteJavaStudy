package quiz;

public class C01_FunctionQuiz2 {
/*
	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	
	 1. 최대값을 매개변수로 전달받으면
	 	0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
	 	range 함수를 만들어보세요
	 	
	 	ex) range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	
	 2. 최소값과 최대값을 매개변수로 전달받으면
	 	최소값 부터 최대값 미만의 모든 정수값을 포하하는 int 배열을 생성하여 반환하는
	 	range 함수를 만들어보세요
	 	
	 	ex) range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
	 	
	 3. 최소값과 최대값과 증가값을 매개변수로 전달받으면
	 	최소값부터 최대값 미만까지 증가값만큼 증가하는 int 배열을 생성하여 반환하는
	 	range 함수를 만들어보세요
	 	
	 	ex) range(40, 50, 3)의 결과 -> [40, 43, 46, 49]
	 		range(40, 45, 5)의 결과 -> [40]
*/
	public static void main(String[] args) {
		System.out.println(maxArr(10));
		System.out.println(minArr(3, 7));
		System.out.println(inCrease(10, 51, 5));
	}
//	# 1.
	public static int[] maxArr(int num) {
		int[] range = new int[num];
		
		for (int i = 0; i < num; i++) {
		range[i] = i;
		System.out.println(range[i]);
		}
		return range;
	}
//	# 2.
	public static int[] minArr(int min, int max) {
		int sum = max - min;
		int[] range = new int[sum];
		
		for (int i = 0; i < sum; i++) {
			range[i] = min + i;
			System.out.println(range[i]);
			}
		
		return range;
	}
//	# 3.
	public static int[] inCrease(int min, int max, int inc) {
		int sum = max - min;
		int[] range = new int[sum];
		
		for (int i = 0; i < sum; i++) {
			range[i] = min + (inc * i);
			if (range[i] < max)
			System.out.println(range[i]);
		}
		return range;
	}
}
