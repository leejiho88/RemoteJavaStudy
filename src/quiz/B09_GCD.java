package quiz;

import java.util.Scanner;

public class B09_GCD {
/*
		두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요
		# 최대 공약수
		
		 - 두 숫자의 공약수 중 가장 큰 공약수
		 
		ex)
		20 [1, 2, 4, 5, 10, 20]
		50 [1, 2, 5, 10, 25, 50]
		> 최대 공약수 : 10
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해 주세요 > ");
		int num = sc.nextInt();
		System.out.print("두번째 숫자를 입력해 주세요 > ");
		int num1 = sc.nextInt();
		
	//	int max = num > num1 ? num : num1;
	//	int min = num < num1 ? num : num1;
		
		int max = Math.max(num, num1);
		int min = Math.min(num, num1);
		
		int gcd = 1;
		
		for (int i = 1; i <= min; ++i) {
			
			if (min % i == 0 && max % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d와 %d의 최대 공약수는 %d입니다.", num, num1, gcd);
	}
}
/*
 		int start, end;
		if (
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				gcd = i;
				if (num1 % i == 0) {
				if (i < num1)
					System.out.println();
				}
			}	
		}

*/