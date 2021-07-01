package quiz;

import java.util.Scanner;

public class B09_ConvertSecond1 {

	public static void main(String[] args) {
	//	# 배열을 활용한 방법
		System.out.print("초 >");
		int second = new Scanner(System.in).nextInt();
		
		int[] converted = new int[4];
		int[] seconds = new int[4];
	//	int[] seconds = {			// 위 세컨드랑 같은 의미 이다. 
	//			365 * 24 * 60 * 60;	// 이 식은 생성후 값을 할당하고 위의 식은 배열을 생성하고
	//	}							// 아래에서 각각의 생성된 배열에값을 준다
		String[] units = {"년", "일", "시", "분"};
		
		seconds[0] = 365 * 24 * 60 * 60;
		seconds[1] = 24 * 60 * 60;
		seconds[2] = 60 * 60;
		seconds[3] = 60;
		
		for (int i = 0; i <converted.length; ++i) {
			converted[i] = second / seconds[i];
			second %= seconds[i];
		}
		
		boolean exist = false;
		
		for (int i = 0; i < converted.length; ++i) {
			if (converted[i] != 0) {
				System.out.printf("%d%s ", converted[i], units[i]);
				exist = true;
			}
		}
		System.out.printf("%d초", second);
		System.out.println();
	}
}
