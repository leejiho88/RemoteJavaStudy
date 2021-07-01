
public class B12_Array2 {
	public static void main(String[] args) {
		
		// 배열 내부에도 배열을 넣을 수 있다
		int[] numbers = {1, 2, 3, 4, 5, 6};
		// 인덱스([])를 통해 접근하면 int타입이 나온다
		
		int[][] arr2 = {
				{65, 66, 67, 68, 69},
				numbers,
				{1, 2, 3, 4,},
				{9, 9, 9, 9, 9, 9, 9, 9, 9 , 9}
		}; // 각 배열의 길이가 달라도 상관없다
		
		System.out.println(arr2[0]); // {65, 66, 67, 68, 69} 배열의 시작 주소가 나온다
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0][2]);
		System.out.println(arr2[0][3]); // 68이 나옴
		System.out.println(numbers); // arr2[1]랑 주소값이 같다
		System.out.println(arr2[1]);
		
		// n차원 배열은 n중 반복문으로 모두 탐색할 수 있다
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
					System.out.print("□ ");
				} else if ( block1[i][j] == 1) {
					System.out.print("■ ");
				}
			}
			System.out.println();
		}
	}
}
