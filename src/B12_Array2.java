
public class B12_Array2 {
	public static void main(String[] args) {
		
		// �迭 ���ο��� �迭�� ���� �� �ִ�
		int[] numbers = {1, 2, 3, 4, 5, 6};
		// �ε���([])�� ���� �����ϸ� intŸ���� ���´�
		
		int[][] arr2 = {
				{65, 66, 67, 68, 69},
				numbers,
				{1, 2, 3, 4,},
				{9, 9, 9, 9, 9, 9, 9, 9, 9 , 9}
		}; // �� �迭�� ���̰� �޶� �������
		
		System.out.println(arr2[0]); // {65, 66, 67, 68, 69} �迭�� ���� �ּҰ� ���´�
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0][2]);
		System.out.println(arr2[0][3]); // 68�� ����
		System.out.println(numbers); // arr2[1]�� �ּҰ��� ����
		System.out.println(arr2[1]);
		
		// n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�
		for (int i = 0; i < arr2.length; ++i) {
			int[] arr = arr2[i];
			
			for (int j = 0; j < arr2[i].length; ++j) {
				
				System.out.printf("arr2[%d][%d]: %d\n", i, j, arr2[i][j]);
			}
		}
		int[][] block1 = {
				{0, 1, 1},
				{0, 0, 1},
				{0, 0, 1},
		};
		
		int width = 3;	// block1.length
		int height = 3; // block1[i].length
		
		for (int i = 0; i < width; ++i) {
			for (int j = 0; j < height; ++j) {
				if ( block1[i][j] == 0) {
					System.out.print("�� ");
				} else if ( block1[i][j] == 1) {
					System.out.print("�� ");
				}
			}
			System.out.println();
		}
	}
}
