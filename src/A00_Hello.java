
// �ּ� (Comment)
//- ���α׷� ���࿡ ������ ��ġ�� ����
//- �����Ϸ��� �ؼ����� ����
//- �ַ� ���α׷��Ӱ�(�� �ҽ��� ���� �� �ٸ� ���α׷��ӵ鿡��) �ϰ� ���� ���� ���� �� ����Ѵ�

/*
 	���� �� �ּ�
	 - �ش� ���� ������ ��� �ؽ�Ʈ�� �ּ��� �ȴ�
*/

/*
 	# Eclips ����Ű
 	
 	- Ctrl + F11 : Run
 	- Ctrl + [+, -] : �۾� ũ�� ����
 	- Ctrl + M : ���� ȭ�� �ִ�/�ּ�ȭ
 	- Ctrl + X : �߶󳻱�
 	- Ctrl + C : �����ϱ�
 	- Ctrl + V : �ٿ��ֱ�
 	- Alt + ����Ű : �� �̵�
 	- Home : ���� �� ������ �̵�
 	- Shift + Home : ���� Ŀ�� ��ġ���� ���� �� �ձ��� �������
 	- End : ���� �� �ڷ� �̵�
 	- Shift + End : ���� Ŀ�� ��ġ���� ���� �� �ڱ��� �������
 	- Tab : �鿩����
 	- Tab + Shift : ������ �鿩����
 	- Ctrl + Shift + F : �ڵ����� �鿩���� ����
 	- ��Ʈ��D ���������
	- ��Ʈ��K ã��
	- ��Ʈ����Ű ��ġ�ٲٱ�
	- ��Ʈ�ѽ����̽� �ڵ��ϼ�
	- ��Ʈ�Ѿ�Ʈ ���Ʒ�����Ű
	- ��Ʈ�ѽ���ƮF 
	
 	# Window ����Ű
 	- Win + . : �̸�Ƽ��
	- Win + Shift + S : ĸ��
	- Win + D : ����ȭ��
	- Win + E : Ž����
	- Win + ����Ű : ȭ�� ���� ���� 
 
*/

// �� public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�
public class A00_Hello {
	// ���� ���� ������ ���� �װ��� ���콺 Ŀ���� �ΰų� F2�� ������
	// �ش� ������ ���� ������ �ذ�å�� �� �� �ִ�.
	
	/*
	 	# main() �Լ�
	 	- ���α׷��� ���� ����
	 	- ����ڰ� ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� ����
	 	- main() �Լ��� ������ �߰�ȣ{}�� �����ȴ�
	 	- �߰�ȣ�� ������ �˱� ���� �ϱ� ���� �鿩����(Tab)�� ����Ѵ�.
	 	- main() �Լ��� ������ ���α׷��� ����ȴ� (���߿� �ƴϴ�)
	 	
	 	# �Լ���?
	 	 - � �ܾ� �ڿ� ()�� �ִ� ���� ��� �Լ���� �θ���
	 */
	public static void main(String[] args) {
		// ���α׷��� ����
		
		/*
		 	# System.out.println() �Լ�
		 	 - ()�ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ�
		 	
		 	# �ܼ�
		 	 - ���ڸ� ������ ���� ȭ�� (���� ��ǻ�� ȭ��)
		 	 - Eclips������ �׽�Ʈ������ �Ͼ� ������ �ܼ��� �����Ѵ� (���� ������)
		 	 - ��Ŭ�������� Ctrl + F11�� ������ �츮�� ���� ���α׷���
		 	   �׽�Ʈ�� �ֿܼ��� �����غ� �� �ִ�.
		 	 - �츮�� ���� �ҽ� �ڵ�(.java)�� ������ �����(.class)��
		 	   bin������ ����Ǿ� �ִ�
		 */
		System.out.println("Hello, world! 1");
		System.out.println("Hello, world! 2"); 
//		System.out.println("Hello, world! 3"); 
		System.out.println("Hello, world! 4"); 
		System.out.println("Hello, world! 5");
		
		System.out.println("��������������������������������");
		System.out.println("��              ��");
		System.out.println("��    Hello!    ��");
		System.out.println("��              ��");
		System.out.println("��������������������������������");
				
		/*
				# JAVA�� ������ ���� (���ͷ�)
				
				 - "" ���̿� ���� �͵�	: ���ڿ�(String), ���ڸ� ������ ���� �ִ� ������ Ÿ��
		 		 - '' ���̿� ���� ��	: ����(Character), ���� �� �ϳ��� �� �� �ִ� ������ Ÿ��
		 		 - ���ڸ� ���� �� : ����(Integer)
		 		 - �Ҽ��� ���� �� : �Ǽ�(Float, Double)
		 		 - true, false
		 */
		
		/*
		 		 # �����ݷ�(;)
 				  - ��ɾ� �� �ڿ� �ٿ� ��ɾ �������� �˸��� �뵵
		 */
		
		System.out.println("ABCDEFG ");
		System.out.println('A');
		
//		�ع��ڿ��� ������ ����
		System.out.println(123456789 + 10);
		System.out.println("123456789" + 10);
	
		System.out.println(123.12345 + 0.0333);
		
		System.out.println(true);
		System.out.println(false);
		
		// ''�� ����ϴ� ���� Ÿ�� �����ʹ� �����δ� ���ڰ��� ������ �ִ�.
		// ���ڿ� ������ �����δ� ���� ���� Ÿ���̸� ���� ��굵 �����ϴ�
		System.out.println('A');
		System.out.println((int)'A'); // 'A'�� ���ڷ� ǥ���϶�� ��
		
		System.out.println(66);
		System.out.println((char)66); // 66�� ���ڷ� ǥ���϶�� ��
		
		// 'D'�� 'A'���� �󸶳� �ڿ� �ִ� �������� �� �� ����
		System.out.println('D' - 'A');
		
		// ������ ���ڸ� ����ϸ� �⺻�����δ� ������ �ȴ�.
		System.out.println('A' + 3);
		
		System.out.println((char)'A' + 0);
		System.out.println((char)'A' + 1);
		System.out.println((char)'A' + 2);
		System.out.println((char)'A' + 3);
		System.out.println((char)'A' + 4);
		System.out.println((char)'A' + 25);
		System.out.println((char)'A' + 26);
		
		
		System.out.print((int)'��');
		System.out.print((int)'��');
		
		// ""�� ����ϴ� ���ڿ� Ÿ�԰� �ٸ� Ÿ���� ���ϸ� ����� �ϴ°��� �ƴ϶� �̾���δ�
		System.out.println("10" + 10);
		System.out.println(10 + 10);
		
		// ���� + �Ǽ��� ����� �Ǽ��̴�
		System.out.println(3.14 + 10);
		
		// �Ǽ��� ������ ��ȯ�ϸ� �Ҽ��� �Ʒ��� �����Ѵ�
		System.out.println((int)33.999999);
		System.out.println((int)3.5 + 3.5); // �տ� �κи� ����Ÿ������ ��ȯ��
		System.out.println((int)(3.5 + 3.5));
		// ���α׷��� ��
	}
	
}
