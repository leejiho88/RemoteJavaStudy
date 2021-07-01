
public class A03_VarTypes {

	public static void main(String[] args) {
		
		/*
		  	# 정수 타입
		  	 - byte		(1byte)				-128 ~ +127 범위 (256bit)
		  	 
		  	 	1byte => 8bit
		  	 
		  	 	0000 0000 ~ 1111 1111 (255) (부호가 없는 경우 0 ~ 255까지 표현 가능)
		  	 	
		  	 	부호를 사용하는 경우에는 첫 번째 bit를 부호 비트로 사용한다
		  	 	
		  	 	byte타입의 양수 범위 0000 0000(0) ~ 0111 1111(127)
		  	 	byte타입의 음수 범위 1000 0000(-128) ~ 1111 1111(-1)
		  	 	
		  	 	(bit 전구같은 것!)
		  	 	(첫 번쨰 비트는 부호비트 1이면 음수)
		  	 
		  	 - short 	(2byte)					(65,536bit)	-32,768 ~ 32,767
		  	 - char		(2byte unsigned(부호없음))	(65,536bit) 65,536 ※ 문자 코드 저장용
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
		 
//		 정수타입 리터럴은 기본적으로 int타입이다
//		 int타입의 범위를 벗어나는 값ㅂ을 사용하고 싶다면 뒤에 l 또는 L을 붙여야 한다
		 long _long = 20000000000L;
		 
		 System.out.println(a);
		 
		 /*
		  		# 실수 타입
		  		
		  		 - float	(4byte)
		  		 - double	(8byte)
		  		 
		  		 실수는 주로 그래픽 계산에 사용된다.
		  		 부동 소수점 방식을 사용한다.
		  */
//		 소수 리터럴은 기본적으로 doulbe타입이므로 double타입 변수에는 아무 문제없이 들어간다
		 double _double = 123.1234;
		 
//		 소수 뒤에 f 또는 F를 적어주면 float타입 리터럴이라는표시가 된다
		 float _float = 123.123F;
		 
		 /*
		  		# 참/거짓 타입
		  		 - boolean
		  		 
		  		 들어갈 수 있는 값은 true/false 밖에 없다
		  */
		 boolean male = true;
		 boolean female = true;
		 boolean powerOn = false;
		 boolean goonpil = true;
		 boolean computerScience = true;
		 
		 /*
		  		# 참조형 타입
		  		
		  		 참조형 타입은 대문자로 시작한다.
		  		 소문자로 시작하는 타입은 모두 기본형 타입이라고 부른다.
		  
		  		 - String
		  		 - 그 외 모든 클래스들..
		  */
		 String welcome_message = "hello, world!";
		 System.out.println(welcome_message);
		 
		 
//		 char 타입은 문자 코드를 저장하는 정수 타입이다
		 char ch = 120; // ※아스키 코드표에 있다
		 
		 char ch2 = 'x';
		 int num1 = 'x';
		 
		 System.out.println("ch에 저장된 값 : " + ch);
		 System.out.println("'x'를 저장한 char타입 변수의 출력: " + ch2);
		 System.out.println("'x'를 저장한 int타입 변수의 출력: " + num1);
	}
	
}
