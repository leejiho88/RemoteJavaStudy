
public class B03_Switch {

	/*
	  	# switch-case��
	  	
	  	  - ()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
	  	  - ()�ȿ� boolean Ÿ���� �� �� ����
	  	  - if������ �Ϻ��ϰ� ��ü �����ϴ�
	  	  - default�� if���� else ������ �Ѵ�
	  	  - break�� �� ���� break�� ���� ������ �������鼭 ��� case�� �����Ѵ�
	*/
	public static void main(String[] args) {
		
		int a = 10;
		
		switch (a) {
//		case �ȿ��� ������ ������ ����
		case 1:
			System.out.println("case 1 ����� ����Ǿ����ϴ�.");
			System.out.println("a�� Ȧ���Դϴ�.");
			break;
		case 0:
			System.out.println("case 0 ����� ����Ǿ����ϴ�.");
			System.out.println("a�� ¦���Դϴ�.");
			break;
		default:
			System.out.println("default ����� ����Ǿ����ϴ�.");
			System.out.println("���� �ش��ϴ� case�� �����ϴ�.");
			break;
		}
		
		char cmd = 'd';
		
		switch (cmd) {
		case 'w':
			System.out.println("move forward");
		case 's':
			System.out.println("move backward");
		case 'a':
			System.out.println("move left");
		case 'd':
			System.out.println("move right");			
		case 'p':
			System.out.println("pause");
			break;
		case 'q':
			System.out.println("quit");
			break;
		default:
			System.out.println("�ش��ϴ� Ŀ�ǵ尡 �����ϴ�");
			break;
			
		}
	}
}
