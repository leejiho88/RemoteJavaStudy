package quiz;

import java.util.Scanner;

public class B04_ForBasicQuiz {

	/*
	  	사용자가 숫자를 입력 했을 때
	  	
	  	1. 10부터 입력한 숫자까지의 총합을 구해보세요
	  	
	  	2. 1000부터 입력한 숫자까지 순서대로 나오게 만들어보세요
	  	
	  	3. 1부터 입력한 숫자 사이의 5의 배수만 출력해보세요
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 > ");
		int user = sc.nextInt();
		
		int sum = 0; // 빈 함수를 만들어 주고, 함수에서 출력되는 i의 값을 누적시켜 합계를 구한다.
		
		int start, end; // 선언과 동시에 초기화를 하지말고 상황에 따라 달라질수 있다.
		
		if (user > 10) {	//	음수까지 고려를 해서 음수를 입력할시에도 계산 되게 할 수 있다
			start = 10;		//	10이 작을때 작동
			end = user;		//
		} else {			//	user가 입력한 값이 작을때 작동
			start = user;	//
			end = 10;		//
		}					//
		
		for (int i = start; i <= end; ++i) {
			sum += i;
		}
		System.out.printf("10부터 %d까지의 총합은 %d입니다.", user, sum);
		
		if (user > 1000) {
			for (int i = 1000; i <= user; ++i) {
				System.out.printf("1000부터 %d까지 출력: %d\n", user, i);
			}
		} else {
			for (int i = 1000; i >= user; --i) {
				System.out.printf("1000부터 %d까지 출력: %d\n", user, i);
			}
		}
		
		if (user > 1) {
			for (int i = 1; i <= user; ++i) {
				if (i % 5 == 0) {
					System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n", user, i);
				}
			}
		} else {
			for ( int i = 1; i >= user; --i) {
				if (i % 5 == 0) {
					System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n", user, i);
				}
			}
		}
	}
}
