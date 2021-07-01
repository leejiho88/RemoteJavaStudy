package quiz;

import java.util.Scanner;

public class C01_FunctionQuiz {
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
			word = "짝수입니다.";
		} else {
			word = "홀수입니다.";
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
