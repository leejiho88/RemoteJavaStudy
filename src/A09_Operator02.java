
public class A09_Operator02 {

	public static void main(String[] args) {
/*
	# �� ������
	  - �� ���� ���ϴ� ����
	  - �� ������ ����� boolean Ÿ���̴� (�� �Ǵ� ����)
	  - ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�
*/
		int a = 10, b = 7;
	
		System.out.println(a > b);
		System.out.println(a < b);
	
	//	�� �ݵ�� �ε�ȣ�� ���� ���;� �� (��ȣ�� ���� ������ �ȵ�)
		System.out.println(a >= b);
		System.out.println(a <= b);
	
		System.out.println(a == b); // �� ���� ���� ������ true
		System.out.println(a != b); // �� ���� ���� �ٸ��� true
	
/*
	# �� ������
	  - boolean Ÿ�� ������ �ϴ� ����
	  - && : �� ���� ���� ��� true�� ���� true (AND)	(�� �ۼ���)
	  - || : �� ���� �� �� �ϳ��� true���� true (OR)	(��Ƽ�� ��)
	  -  ! : true�� false, false�� true (NOT)
*/
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));
	
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
	
		System.out.println(!true);
		System.out.println(!false);
		
		int c =53;
		
	//	�񱳺��ٴ� ��������� ����
		System.out.print("c�� ¦���ΰ���? ");
		System.out.println((c % 2 == 0));
		
		System.out.print("c�� Ȧ���ΰ���? ");
		System.out.println(c % 2 == 1);
		System.out.println(!(c % 2 == 0));
		System.out.println(c % 2 != 0);
		
		System.out.print("c�� ¦���̸鼭 50���� ū����?");
		System.out.println(c % 2 == 0 && c > 50);
		
		System.out.print("c�� ¦���̰ų� 50���� ū����?");
		System.out.println(c % 2 == 0 || c > 50);
		
	//	# �������� : ���� x, y, z�� ��� 3�� ����� �ƴ� �� true�� �Ǵ� �� ������ ��������
		
		int x = 22, y = 23, z = 25;
		
		System.out.println(x % 3 != 0 && y % 3 != 0 && z % 3 != 0);
		
		System.out.println(!(x % 3 == 0 || y % 3 == 0 || z % 3 == 0));
		
//		System.out.println(!(x % 3 == 0 && y % 3 == 0 && z % 3 == 0));
//		System.out.println(x % 3 == 1 && y % 3 == 2 && z % 3 == 1);
//		System.out.println(x % 3 == 1 || y % 3 == 0 || z % 3 == 0);
		
	}
	
}
