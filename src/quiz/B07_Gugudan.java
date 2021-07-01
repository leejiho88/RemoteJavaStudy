package quiz;

public class B07_Gugudan {
	/*
		1. 구구단을 다음과 같이 가로로 출력해보세요
		
		2단: 2X1=2 2X2=4 2X3=6 ...
		3단: 3X1=3 3X2=6 3X3=9 ...
		4단: ...
		
		2. 구구단을 다음과 같이 세로로 출력해보세요
		
		2단		3단		4단		...
		2X1=2	3X1=3	4X1=4	...
		2X2=4	3X2=6	4X2=8	...
		...
	*/
	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; ++dan) {
			
			System.out.printf("%d단: ", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dX%d=%-2d", dan, gop, dan * gop);
			}
			System.out.println();
		}
		for (int line = 0; line < 10; ++line) {
			
			for (int dan = 2; dan <= 9; ++dan) {
				
				if(line == 0) {
					System.out.printf("%d단\t", dan);
				} else {
					System.out.printf("%dX%d=%d\t", dan,line, dan * line);
				}
			}
			
			System.out.println();
		}
	}
}
		
		
//		for (int dan = 2; dan < 10; ++dan) {
//			
//			System.out.print("\n" + dan + "단: ");
//			
//			for (int gop = 1; gop < 10; ++gop){
//				
//				System.out.printf("%dX%d=%d\t", dan, gop, dan * gop);
//			}
//		}
//		System.out.println();
//		
//		for (int dan = 2; dan < 10; ++dan){
//			System.out.printf("%d단\t", dan);
//			for (int gop = 1; gop < 10; ++gop) {
//				System.out.print(dan + "X" + gop + "=" + dan * gop);