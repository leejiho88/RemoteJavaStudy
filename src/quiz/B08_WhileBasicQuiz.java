package quiz;

public class B08_WhileBasicQuiz {
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
	//	# 1.
		while (i < 100) {
			++i;
		
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	//	# 2.		
		i = 356;
		 
		while (i > 237) {
			i--;
			 
			System.out.printf("%-4d", i);
		}
		 
		System.out.println();
	//	3.
		i = 2999;
		 
		while (i < 5001) {
			i++;
			 
			if (i % 7 == 0) {
				System.out.printf("%-5d", i);
			}
		}
		System.out.println();
		
		i = 0;
		sum = 0;
		
		while (i < 201) {
			sum += i;
			i++;
			 		 
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
//			sum += i;
		}
		System.out.println(sum);
	}
}

