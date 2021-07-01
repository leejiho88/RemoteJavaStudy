package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz_t {
	/*
	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	
	 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 
	 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 
	 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 " 홀수입니다"를 반환하는 합수
	 
	 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	 
	 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 
	 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	 	factorial: (n)*(n-1)*(n-2) ... 3*2*1
*/
	
	public static void main(String[] args) {
		System.out.println(isAlphabet('d'));
		System.out.println(isMul3(33));
		System.out.println(evenOdd(22));
		System.out.println(Arrays.toString(allYaksu(16)));
		System.out.println(isPrime(33));
		System.out.println(factorial(5));
	}
//	# 1.
	public static boolean isAlphabet(char ch) {
		return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
	//	# 한줄로 가능
	//	if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	//		return true;
	//	} else {
	//		return false;
	//	}
	}
//}
//	public static void main(String[] args) {
//		String str = "한글 Hangeul";
//		
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			
//			if(isAlphabet(ch)) {
//				System.out.println(i + "번째 문자는 여어입니다.");
//			} else {
//				System.out.println(i + "번쨰 문자는 영어가 아닙니다.");
//			}
//		}
//	}
//}
//	# 2/
	public static boolean isMul3(int num) {
		return num % 3 == 0;
	}
//	# 3.
	public static String evenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		// 삼항연산자로 한줄에 끝낼 수 있다
	}
//	# 4.
	public static int[] allYaksu(int num) {
		// 50인 경우 boolean타입 변수 50개를 생성
		boolean[] divided = new boolean[num];
		
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divided[i - 1] = true; // 배열에 나누어 떨어진 숫자들을 표시 해놓음
				count++;
			}
		}
		
		int[] yaksu = new int[count];
		int index = 0;
		
		for (int i = 1; i <= num; i++) {
			if (divided[i - 1]) {
				yaksu[index++] = i;
			}
		}
		return yaksu;
	}
//	# 5.
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else if (num == 2) {
			return true;
		} else if (num % 2 == 0) {
			return false;
		}
		
		for ( int i = 3; i < Math.sqrt(num); i += 2) {
			if ( num % i == 0) {
				return false;
			}
		}
		return true;
	}
//	# 6.
	public static int factorial(int num) {
		// 곱하기를 누적시킬때는 초기값을 1로 준다
		int factorial = 1;
		
		for (int i = num; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}
//	# 6_1.
	// 어떤 함수가 자기 자신을 불러서 사용하는 것을 재귀함수라고 부른다 (성능이 안좋음, 겉멋)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1; // 1까지 도착하면 그만두고 나가라!
		}
		return num * recursive_factorial(num - 1);
	}
}
