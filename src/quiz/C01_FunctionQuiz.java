package quiz;

import java.util.Scanner;

public class C01_FunctionQuiz {
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

		System.out.println(isAlphabet("asdfasasdff"));
		System.out.println(three(333));
		System.out.println(twoTh(12));
		System.out.println(gCd(44));
	}
	public static boolean isAlphabet(String text) {
		
		boolean alphabet = true;
		
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
				alphabet = false;
			}
		}
		return alphabet;
	}
	
	public static boolean three(int num) {
		
		boolean count = false;
		
		if (num % 3 == 0) {
			count = true;
		}
		return count;
	}
	public static String twoTh(int num1) {
		String word = "";
		if (num1 % 2 ==0) {
			word = "¦���Դϴ�.";
		} else {
			word = "Ȧ���Դϴ�.";
		}
		return word;
	}
	public static int[] gCd(int num2) {
		int[] arr = new int[num2];
		for (int i = 1; i <= num2; i++) {
			if(num2 / i == 0) {
				arr[i] += i;
			}
		}
		return arr;
	}
}
