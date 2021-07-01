package quiz;

public class B08_WhileBasicQuiz1 {
/*
	while문을 이용하여 다음을 구하시오.
	
	  1. 1부터 100사이에 있는 3의 배수의 총합
	  
	  2. 355부터 237까지 출력
	  
	  3. continue를 반드시 사용하여 3000부터 5000사이의 7의 배수만 출력하기
	  
	  4. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
*/
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while (i < 101) {
			if (++i % 3 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println("총합 : " + sum);
		
		i = 355;
		
		while (i >= 237) {
//			System.out.print(i-- + ",");
			System.out.print(i--);
			
			if (i != 236) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
		
		i = 3000;
		
		while (i <= 5000) {
			if (i % 7 != 0) {
				++i;
				continue;
			}
			System.out.printf("%-5d", i);
			++i;
		}
		System.out.println();
		
		i = 1;
		sum = 0;
		
		while (i <= 200) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
			++i;
		}
		
		System.out.println("4번 답: " + sum);
	}
}

