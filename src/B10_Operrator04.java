
public class B10_Operrator04 {
/*
		# ���� ������
		
		 - ���� ? �� : �ƴϿ�;
*/
	public static void main(String[] args) {
	//	1.
		int apple = 15;
		int basket = apple % 10 != 0 ? apple / 10 + 1 : apple / 10;
	//	2.
		char ch = 'A';
		String msg = ch >= 'A' && ch <= 'Z' ? "�빮���Դϴ�." : "�빮�ڰ� �ƴմϴ�.";
		
		System.out.println(basket);
		System.out.println(msg);
	}
}
