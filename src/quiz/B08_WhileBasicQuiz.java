package quiz;

public class B08_WhileBasicQuiz {
/*
		while���� �̿��Ͽ� ������ ���Ͻÿ�.
		
		  1. 1���� 100���̿� �ִ� 3�� ����� ����
		  
		  2. 355���� 237���� ���
		  
		  3. continue�� �ݵ�� ����Ͽ� 3000���� 5000������ 7�� ����� ����ϱ�
		  
		  4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
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

