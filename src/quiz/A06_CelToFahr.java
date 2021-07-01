package quiz;

import java.util.Scanner;

public class A06_CelToFahr {

	/*
	 	사용자로부터 섭씨 온도를 입력받으면 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
	 	(변환 공식은 검색 허용, 출력은 소수 첫째 자리까지)
	*/
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("현재 온도는 몇 ℃ 인가요?");
//		
//		double t = sc.nextInt();
//		
//		System.out.println("현재 온도는 : " + ((9 / 5 * t) + 32) + " ℉ 입니다");
	
	double cel, fahr;
	
	System.out.print("섭씨(℃) 온도를 입력 > ");
	cel = new Scanner(System.in).nextDouble();
	
//	Scanner sc = new Scanner(System.in)
//	t = sc.nextInt();
//	이렇게 써야 할 것을 sc자리에 바로 new Scanner(System.in) 이것을 넣음
//	sc를 반복적으로 써야 할 경우에는 좋지 않다
	
	// (0℃ x 9/5) + 32 = 32℉
	fahr = cel * 9 / 5 + 32;
	
	System.out.printf("%.1f℃는 %.1f℉입니다.", cel, fahr);
	
	
	
	
	
	}
}
