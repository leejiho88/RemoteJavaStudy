package quiz;

public class B12_Array2 {

	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1}
		};
		
		// 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ㺸����
		for (int row = 0; row < numArr.length; ++row) {
			for (int colum = 0; colum < numArr[row].length; ++colum) {
										// row�� ������ ���� ��ŭ �ݺ�
				numArr[row][colum] = (int)(Math.random() * 101);
			}
		}
		
		// 2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ���(�Ҽ��� �Ѥ� �ڸ�)�� ���ؼ� ����غ�����
		int sum = 0;
		int count = 0;
		
		for (int row = 0; row < numArr.length; ++row) {
			
			int len = numArr[row].length;
			count += len;
			
			for (int colum = 0; colum < len; ++colum) {
				System.out.print(numArr[row][colum] + "\t");
				sum += numArr[row][colum];
			}
			System.out.println();
		}
		System.out.printf("����: %d, ���: %.2f\n", sum, sum / (double)count);
													// ���� / ���� = ������ ����
		// 3. numArr�� �� ��(row)�� ���� ��� ���ؼ� ����غ�����
		int[] rowSum = new int[numArr.length];
		
		for (int row = 0; row < numArr.length; ++row) {
			for (int colum = 0; colum < numArr[row].length; ++colum) {
				if(row == 0) {
					rowSum[0] += numArr[row][colum];
				} else if (row == 1) {
					rowSum[1] += numArr[1][colum];
				} else if (row == 2) {
					rowSum[2] += numArr[2][colum];
				} else if (row == 3) {
					rowSum[3] += numArr[3][colum];
				}
				rowSum[row] += numArr[row][colum];
//				rowSum[row] += numArr[row][colum]; // ���� if���� ���ٷ� ��Ÿ����
			}
		}
		
		// 4. numArr�� �� ��(colum)�� ���� ��� ���ؼ� ����غ�����
		int max_len = 0;
		
		for (int row = 0; row < numArr.length; ++row) {
			max_len = Math.max(max_len, numArr[row].length);
							//   0 �� 4�� 4�� ũ��, max_len = 4;
							//	 4 �� 7�� 7�� ũ��, max_len = 7;
		}
		
		int[] colSum = new int[max_len];
		
		for (int row = 0; row < numArr.length; ++row) {
			for (int colum = 0; colum < numArr[row].length; ++colum) {
				colSum[colum] += numArr[row][colum];
			}
		}
		
		// �迭�� ���ϰ� ���ڿ��� ��ȯ�ϱ�
		System.out.println("���� ��: " + java.util.Arrays.toString(rowSum));
		System.out.println("���� ��: " + java.util.Arrays.toString(colSum));
//		int sum = 0;
//		double average = 0;
//		int row = 0;
//		int colum = 0;
//		
//		for (int i = 0; i < numArr.length; i++) {
//			
//			for(int j = 0; j <numArr[i].length; j++) {
//				int[][] rNum = numArr;
//				rNum[i][j] = (int)(Math.random() * 101);
//				
//				row += numArr[i][j];
//				sum += numArr[i][j];
//				average = (double)sum / 22;
//				
//				System.out.println(numArr[numArr[i].length][j]);
//			}
////			System.out.printf("%d���� �� ��: %d\n", i, row);
//		}
////		System.out.println("�迭�� ����: " + sum);
////		System.out.printf("�迭�� ���: %.2f\n", average);
//		
//		
	}
}
