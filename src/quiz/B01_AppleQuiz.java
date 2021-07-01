package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {

	/*
	 	  사과를 10개씩 담을 수 있는 바구니가 있다.
	 	  
	 	  사용자가 구매하고 싶은 사과의 개수를 입력하면
	 	  사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요.
	 */
	public static void main(String[] args) {
		
		int apple;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 갯수를 입력하세요 > ");
		apple = sc.nextInt();
		
		// Math.ceil(a) : a를 소수 첫쨰 자리에서 올린다.
		// Math.floor(a) : a를 소수 첫째 자리에서 내린다.
	/* 1.
	  	double basket_size = 10;
	    double basket;
		basket = apple / 10.0;
		
		System.out.println("필요한 바구니의 개수는 " + (int)Math.ceil(basket)) + "개 입니다.");
	*/
	/* 2.
	    double basket_size = 10;
	    double basket;
		basket = apple / basket_size;
		
		System.out.printf("필요한 바구니의 개수는 %d개 입니다.",
				(int)Math.ceil(basket));
	*/
//		3.
		int basket_size = 10;
		int basket;
		
		if (apple % basket_size == 0) {
			basket = apple / basket_size;
		} else {
			basket = apple / basket_size + 1;
		}
		
		if (apple < 0) {
			System.out.println("올바른 사과 개수가 아닙니다.");
		} else {
			System.out.printf("필요한 바구니의 개수는 %d개 입니다.\n", basket);
		}
		
		System.out.println("프로그램 종료!");
   /*// 내가 푼거		
		if (apple % 10 == 0) {
			System.out.println("바구니의 개수는 " + (apple / 10) + "개 입니다!");
		} else if (apple % 10 != 0) {
			System.out.println("바구니의 개수는 " + (apple / 10 + 1)  + "개 입니다!");
		}
   */
	}
}
