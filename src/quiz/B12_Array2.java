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
		
		// 1. numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꿔보세요
		for (int row = 0; row < numArr.length; ++row) {
			for (int colum = 0; colum < numArr[row].length; ++colum) {
										// row번 쨰줄의 길이 만큼 반복
				numArr[row][colum] = (int)(Math.random() * 101);
			}
		}
		
		// 2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균(소수점 둘쨰 자리)을 구해서 출력해보세요
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
		System.out.printf("총합: %d, 평균: %.2f\n", sum, sum / (double)count);
													// 정수 / 정수 = 정수만 나옴
		// 3. numArr의 각 행(row)의 합을 모두 구해서 출력해보세요
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
//				rowSum[row] += numArr[row][colum]; // 위의 if식을 한줄로 나타내면
			}
		}
		
		// 4. numArr의 각 열(colum)의 합을 모두 구해서 출력해보세요
		int max_len = 0;
		
		for (int row = 0; row < numArr.length; ++row) {
			max_len = Math.max(max_len, numArr[row].length);
							//   0 과 4중 4가 크다, max_len = 4;
							//	 4 와 7중 7이 크다, max_len = 7;
		}
		
		int[] colSum = new int[max_len];
		
		for (int row = 0; row < numArr.length; ++row) {
			for (int colum = 0; colum < numArr[row].length; ++colum) {
				colSum[colum] += numArr[row][colum];
			}
		}
		
		// 배열을 편리하게 문자열로 변환하기
		System.out.println("행의 합: " + java.util.Arrays.toString(rowSum));
		System.out.println("열의 합: " + java.util.Arrays.toString(colSum));
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
////			System.out.printf("%d행의 총 합: %d\n", i, row);
//		}
////		System.out.println("배열의 총합: " + sum);
////		System.out.printf("배열의 평균: %.2f\n", average);
//		
//		
	}
}
