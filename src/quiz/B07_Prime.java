package quiz;

import java.util.Scanner;

public class B07_Prime {

	/*
		사용자로부터 숫자(양수)를 입력받으면 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
		1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
		(음수를 입력하면 다시 제대로 입력하게 하기)
		
		※ 소수: 나누어 떨어지는 수가 1과 자기 자신밖에 없는 숫자
		
			2, 3, 5, 7, 11, 13, ...
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 > ");
		int num = sc.nextInt();

		for (; num < 0;) {
			System.out.println("잘못된 숫자입니다. 다시입력해주세요");
			System.out.print("> ");
			
			num = sc.nextInt();
		}
//		System.out.println(2);
//		for (int chkNum = 3; chkNum <= num; ++chkNum) {
		for (int chkNum = 2; chkNum <= num; ++chkNum) {
			
			boolean prime = true;
	
//			for (int divNum = 3; divNum <= Math.sqrt(chkNum); divNum += 2) {
			for (int divNum = 2; divNum <= Math.sqrt(chkNum); divNum += 2) {
	
				if(chkNum % divNum == 0) {
					prime = false;
				}
			}
		
			if (prime) {
				System.out.println(chkNum);
			}
		}
	}		
}	

