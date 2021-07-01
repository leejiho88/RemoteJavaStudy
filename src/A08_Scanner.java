import java.util.Scanner;
// java.*;�� �ص� ������ �ٸ� ��ɵ��� ���Ƽ� �ϳ��� ������ �� ��ɸ� �ҷ��´�
public class A08_Scanner {

//	Ŭ�������� ��� ���� ���� ��Ű��
	
/*
	# java.util.Scanner Ŭ����
	  - ���α׷��� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� �����Ǿ� �ִ� Ŭ����
	  - ��𿡼� �Է��� ������ ������ �ڿ� �پ��� ������ �Է¹��� �� �ִ�
	  - �ַܼκ��� �Է¹ް� ���� ���� System.in�� ��� �Ѵ�
*/
	
	public static void main(String[] args) {
		


		Scanner sc = new Scanner(System.in);
	//	new�� ���ο� ��ĳ�ʸ� ������ �� ����Ѵ�
	//	 - new Scanner(System.in)
	//	 - new �� �� ��ĳ�ʿ� ������ �Է� ���(InputStream)�� ����ϴ� ��ĳ�ʸ� �����Ѵ�
	//	 - ��, System.in���κ��� �Է¹޴� ���ο� ��ĳ�ʸ� �ϳ� �����Ѵ�
	//	 - �� �� Scanner Ÿ�� ���� sc�� ������ ��ĳ�ʸ� ��� ���´�
		
/*
	# Scanner Ŭ������ nextInt()
	  - �������� ������ ������ �ϳ� ������
	  - ��ĳ�ʿ� ���� ���� �ƹ��͵� ���� ���� ���缭 �Է��� ��� ��ٸ���
	  - ������ �Է¹޾ƾ� �Ѵ�
*/	
		System.out.print("�ƹ� ������ �Է��غ����� > ");
		int num = sc.nextInt();
		
		System.out.println("����� �Է��� ���� " + num + "�Դϴ�.");
		
	//	�Ǽ��� �Է¹��� ���� nextDouble()�� ����Ѵ�
		System.out.print("�̹����� �Ҽ��� �Է��غ����� >> ");
		double d = sc.nextDouble();
		
		System.out.printf("�Է��� �Ҽ��� %.5f�Դϴ�.\n", d);
		
	//	���ڿ��� �ƴ� ���� �Է¹��� ��ĳ�ʿ��� '\n'�� �����ְ� �ȴ�
	//	13'\n'
		sc.nextLine(); // ��ĳ�ʿ� �����ִ� '\n'����
		
	//	���ڿ��� �Է¹��� ���� next() �Ǵ� nextLine()�� ����Ѵ�
	//	next()�� ��� ������ �������� �Է¹ް�, nextLine()�� '\n'�� �������� �Է¹޴´�
		System.out.print("�̹����� ���ڿ��� �Է��غ����� >> ");
		String str = sc.next();
		
		System.out.println("��� : " + str);
	}
}
