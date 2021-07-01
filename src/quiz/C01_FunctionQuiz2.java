package quiz;

public class C01_FunctionQuiz2 {
/*
	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	
	 1. �ִ밪�� �Ű������� ���޹�����
	 	0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	range �Լ��� ��������
	 	
	 	ex) range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	
	 2. �ּҰ��� �ִ밪�� �Ű������� ���޹�����
	 	�ּҰ� ���� �ִ밪 �̸��� ��� �������� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	range �Լ��� ��������
	 	
	 	ex) range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	 	
	 3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹�����
	 	�ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	range �Լ��� ��������
	 	
	 	ex) range(40, 50, 3)�� ��� -> [40, 43, 46, 49]
	 		range(40, 45, 5)�� ��� -> [40]
*/
	public static void main(String[] args) {
		System.out.println(maxArr(10));
		System.out.println(minArr(3, 7));
		System.out.println(inCrease(10, 51, 5));
	}
//	# 1.
	public static int[] maxArr(int num) {
		int[] range = new int[num];
		
		for (int i = 0; i < num; i++) {
		range[i] = i;
		System.out.println(range[i]);
		}
		return range;
	}
//	# 2.
	public static int[] minArr(int min, int max) {
		int sum = max - min;
		int[] range = new int[sum];
		
		for (int i = 0; i < sum; i++) {
			range[i] = min + i;
			System.out.println(range[i]);
			}
		
		return range;
	}
//	# 3.
	public static int[] inCrease(int min, int max, int inc) {
		int sum = max - min;
		int[] range = new int[sum];
		
		for (int i = 0; i < sum; i++) {
			range[i] = min + (inc * i);
			if (range[i] < max)
			System.out.println(range[i]);
		}
		return range;
	}
}
