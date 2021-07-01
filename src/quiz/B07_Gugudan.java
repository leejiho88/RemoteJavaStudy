package quiz;

public class B07_Gugudan {
	/*
		1. �������� ������ ���� ���η� ����غ�����
		
		2��: 2X1=2 2X2=4 2X3=6 ...
		3��: 3X1=3 3X2=6 3X3=9 ...
		4��: ...
		
		2. �������� ������ ���� ���η� ����غ�����
		
		2��		3��		4��		...
		2X1=2	3X1=3	4X1=4	...
		2X2=4	3X2=6	4X2=8	...
		...
	*/
	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; ++dan) {
			
			System.out.printf("%d��: ", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dX%d=%-2d", dan, gop, dan * gop);
			}
			System.out.println();
		}
		for (int line = 0; line < 10; ++line) {
			
			for (int dan = 2; dan <= 9; ++dan) {
				
				if(line == 0) {
					System.out.printf("%d��\t", dan);
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
//			System.out.print("\n" + dan + "��: ");
//			
//			for (int gop = 1; gop < 10; ++gop){
//				
//				System.out.printf("%dX%d=%d\t", dan, gop, dan * gop);
//			}
//		}
//		System.out.println();
//		
//		for (int dan = 2; dan < 10; ++dan){
//			System.out.printf("%d��\t", dan);
//			for (int gop = 1; gop < 10; ++gop) {
//				System.out.print(dan + "X" + gop + "=" + dan * gop);