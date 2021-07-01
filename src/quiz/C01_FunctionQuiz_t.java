package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz_t {
	/*
	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	
	 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 
	 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 
	 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� " Ȧ���Դϴ�"�� ��ȯ�ϴ� �ռ�
	 
	 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	 
	 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 
	 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
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
	//	# ���ٷ� ����
	//	if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	//		return true;
	//	} else {
	//		return false;
	//	}
	}
//}
//	public static void main(String[] args) {
//		String str = "�ѱ� Hangeul";
//		
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			
//			if(isAlphabet(ch)) {
//				System.out.println(i + "��° ���ڴ� �����Դϴ�.");
//			} else {
//				System.out.println(i + "���� ���ڴ� ��� �ƴմϴ�.");
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
		return num % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		// ���׿����ڷ� ���ٿ� ���� �� �ִ�
	}
//	# 4.
	public static int[] allYaksu(int num) {
		// 50�� ��� booleanŸ�� ���� 50���� ����
		boolean[] divided = new boolean[num];
		
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divided[i - 1] = true; // �迭�� ������ ������ ���ڵ��� ǥ�� �س���
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
		// ���ϱ⸦ ������ų���� �ʱⰪ�� 1�� �ش�
		int factorial = 1;
		
		for (int i = num; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}
//	# 6_1.
	// � �Լ��� �ڱ� �ڽ��� �ҷ��� ����ϴ� ���� ����Լ���� �θ��� (������ ������, �Ѹ�)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1; // 1���� �����ϸ� �׸��ΰ� ������!
		}
		return num * recursive_factorial(num - 1);
	}
}
