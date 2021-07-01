package quiz;

public class A09_ConditionQuiz {

	/*
		[ 알맞은 비교연산을 만들어보세요 ]
		
		1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		2. int형 변수 b가 짝수일 때 true
		3. int형 변수 c가 7의 배수일 때 true
		4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
		5. int형 변수 d와 e의 차이가 30일 때 true
		6. int형 변수 year가 400으로 나누어 떨어지거나
		   또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때 true
		7. 민수가 철수보다 2살 많으면 true
		8. 민수가 철수보다 생일이 3달 빠르면 true
		9. boolean형 변수 powerOn 이 false일 때 true
		10. 문자열 참조변수 str이 "yes"일 때 true
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
		

		System.out.print("1번 : ");
		System.out.println(a > 10 && a < 20);
		
		System.out.print("2번 : ");
		System.out.println(b % 2 == 0);
		
		System.out.print("3번 : ");
		System.out.println(c % 7 == 0);
		
		System.out.print("4번 : ");
		System.out.println(!(hour < 0 || hour >= 24) && hour >= 12);
		
		System.out.print("5번 : ");
		System.out.println(f == 30);
		
		System.out.print("6번 : ");
		System.out.println((year % 400 == 0 || year % 4 == 0) && year % 100 != 0);
		
		System.out.print("7번 : ");
		System.out.println(mcYear > 2);
		
		System.out.print("8번 : ");
		System.out.println(mcBirth >= 3);
		
		System.out.print("9번 : ");
		System.out.println(!(powerOn));
		
		System.out.print("10번 : ");
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
		
//		타입명이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한다.
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		/*
		소문자로 시작하는 타입 변수들은 stack에 차곡차곡 쌓인다
		대문자로 시작하는 타입 변수들은 stack에는 주소값만 보관하고 실체는 heap에 존재한다
		대문자로 시작하는 타입 변수에는 주소값이 저장되어 있고, 거기에 .을 찍고 실제 데이터를 참조할 수 있다
		*/
	}
}
