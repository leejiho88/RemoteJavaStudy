
public class A03_VarTypes {

	public static void main(String[] args) {
		
		/*
		  	# ���� Ÿ��
		  	 - byte		(1byte)				-128 ~ +127 ���� (256bit)
		  	 
		  	 	1byte => 8bit
		  	 
		  	 	0000 0000 ~ 1111 1111 (255) (��ȣ�� ���� ��� 0 ~ 255���� ǥ�� ����)
		  	 	
		  	 	��ȣ�� ����ϴ� ��쿡�� ù ��° bit�� ��ȣ ��Ʈ�� ����Ѵ�
		  	 	
		  	 	byteŸ���� ��� ���� 0000 0000(0) ~ 0111 1111(127)
		  	 	byteŸ���� ���� ���� 1000 0000(-128) ~ 1111 1111(-1)
		  	 	
		  	 	(bit �������� ��!)
		  	 	(ù ���� ��Ʈ�� ��ȣ��Ʈ 1�̸� ����)
		  	 
		  	 - short 	(2byte)					(65,536bit)	-32,768 ~ 32,767
		  	 - char		(2byte unsigned(��ȣ����))	(65,536bit) 65,536 �� ���� �ڵ� �����
		  	 - int		(4byte)					(4,294,967,296bit) -2^31 ~ 2^31 - 1
		  	 - long		(8byte)					(18,446,744,073,709,551,616bit) -2^63 ~ 2^63 - 1
		 */
		
		 byte a = 3;
		 short b = 10;
		 char c = 10;
		 int d = 10;
		 long e = 10;
		 
		 byte _byte = 123;
		 short _short = 32767;
		 char _char = 65535;
		 int _int = 2100000000;
		 
//		 ����Ÿ�� ���ͷ��� �⺻������ intŸ���̴�
//		 intŸ���� ������ ����� ������ ����ϰ� �ʹٸ� �ڿ� l �Ǵ� L�� �ٿ��� �Ѵ�
		 long _long = 20000000000L;
		 
		 System.out.println(a);
		 
		 /*
		  		# �Ǽ� Ÿ��
		  		
		  		 - float	(4byte)
		  		 - double	(8byte)
		  		 
		  		 �Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�.
		  		 �ε� �Ҽ��� ����� ����Ѵ�.
		  */
//		 �Ҽ� ���ͷ��� �⺻������ doulbeŸ���̹Ƿ� doubleŸ�� �������� �ƹ� �������� ����
		 double _double = 123.1234;
		 
//		 �Ҽ� �ڿ� f �Ǵ� F�� �����ָ� floatŸ�� ���ͷ��̶��ǥ�ð� �ȴ�
		 float _float = 123.123F;
		 
		 /*
		  		# ��/���� Ÿ��
		  		 - boolean
		  		 
		  		 �� �� �ִ� ���� true/false �ۿ� ����
		  */
		 boolean male = true;
		 boolean female = true;
		 boolean powerOn = false;
		 boolean goonpil = true;
		 boolean computerScience = true;
		 
		 /*
		  		# ������ Ÿ��
		  		
		  		 ������ Ÿ���� �빮�ڷ� �����Ѵ�.
		  		 �ҹ��ڷ� �����ϴ� Ÿ���� ��� �⺻�� Ÿ���̶�� �θ���.
		  
		  		 - String
		  		 - �� �� ��� Ŭ������..
		  */
		 String welcome_message = "hello, world!";
		 System.out.println(welcome_message);
		 
		 
//		 char Ÿ���� ���� �ڵ带 �����ϴ� ���� Ÿ���̴�
		 char ch = 120; // �ؾƽ�Ű �ڵ�ǥ�� �ִ�
		 
		 char ch2 = 'x';
		 int num1 = 'x';
		 
		 System.out.println("ch�� ����� �� : " + ch);
		 System.out.println("'x'�� ������ charŸ�� ������ ���: " + ch2);
		 System.out.println("'x'�� ������ intŸ�� ������ ���: " + num1);
	}
	
}
