package quiz;

public class A09_ConditionQuiz {

	/*
		[ �˸��� �񱳿����� �������� ]
		
		1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		2. int�� ���� b�� ¦���� �� true
		3. int�� ���� c�� 7�� ����� �� true
		4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
		5. int�� ���� d�� e�� ���̰� 30�� �� true
		6. int�� ���� year�� 400���� ������ �������ų�
		   �Ǵ� 4�� ������ �������� 100���� ������ �������� ���� �� true
		7. �μ��� ö������ 2�� ������ true
		8. �μ��� ö������ ������ 3�� ������ true
		9. boolean�� ���� powerOn �� false�� �� true
		10. ���ڿ� �������� str�� "yes"�� �� true
	*/
	public static void main(String[] args) {
		/*
		int a = 11, b = 2, c = 21;
		int hour = 55;
		int d = 3, e = 33;
		int f = e - d;
		int year = 444;
		int minsuYear = 7, cheolsuYear = 4;
		int mcYear = (minsuYear - cheolsuYear);
		int minsuBirth = 7, cheolsuBrith = 11;
		int mcBirth = cheolsuBrith - minsuBirth;
		boolean powerOn = false;
		String str = "yes";
		

		System.out.print("1�� : ");
		System.out.println(a > 10 && a < 20);
		
		System.out.print("2�� : ");
		System.out.println(b % 2 == 0);
		
		System.out.print("3�� : ");
		System.out.println(c % 7 == 0);
		
		System.out.print("4�� : ");
		System.out.println(!(hour < 0 || hour >= 24) && hour >= 12);
		
		System.out.print("5�� : ");
		System.out.println(f == 30);
		
		System.out.print("6�� : ");
		System.out.println((year % 400 == 0 || year % 4 == 0) && year % 100 != 0);
		
		System.out.print("7�� : ");
		System.out.println(mcYear > 2);
		
		System.out.print("8�� : ");
		System.out.println(mcBirth >= 3);
		
		System.out.print("9�� : ");
		System.out.println(!(powerOn));
		
		System.out.print("10�� : ");
		System.out.println(str == "yes");
		*/
		int a =15, b = 7, c = 7;
		int hour = 13;
		int d = 10, e = 40;
		int year = 2020;
		boolean powerOn = false;
		String str = "yes";
		
		System.out.println(a > 10 && a < 20);
		System.out.println(b % 2 == 0); // System.out.pritnln(b % 2 != 1);
		System.out.println(c % 7 == 0);
		System.out.println(hour < 24 && hour >= 12);
		System.out.println(Math.abs(d - e) == 30);
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		System.out.println(!(powerOn));
		
//		Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �Ѵ�.
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		/*
		�ҹ��ڷ� �����ϴ� Ÿ�� �������� stack�� �������� ���δ�
		�빮�ڷ� �����ϴ� Ÿ�� �������� stack���� �ּҰ��� �����ϰ� ��ü�� heap�� �����Ѵ�
		�빮�ڷ� �����ϴ� Ÿ�� �������� �ּҰ��� ����Ǿ� �ְ�, �ű⿡ .�� ��� ���� �����͸� ������ �� �ִ�
		*/
	}
}
