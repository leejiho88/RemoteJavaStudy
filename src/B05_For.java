
public class B05_For {
	
	/*
	  	# 반복문 (loop)
	  	
	  	  - for, while, do-while(X), for-each
	  	  - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
	  	  
	  	# for문
	  	  
	  	  for (초기값; 반복조건; 증가폭){
	  	  	가운데에 있는 반복조건이 true인 동안 반복될 명령어들을 적는 곳
	  	  }
	*/
	
	public static void main(String[] args) {
		
		/*
		  	1. 가장 기본적인 형태의 for문
		  	 - 초기값에는 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다(ex, 10번 반복하고 싶으면 i < 10이 된다, 0번부터 시작하니까)
		  	 - 증가는 1씩 한다
		  	 - 원하는 횟수만큼 반복하기 가장 좋은 형태의 for문
		  
		*/
		//for문이 시작되면 도착하는 순서
		//		  1.	2.   5.   syso가 3.   4. }에 갔다가 5.에 갔다가 다시 2.로가서 조건 확인 다시 syso로가서 출력 2~5 반복
		for (int i = 0; i < 10; ++i) { // i < 10, 10이 되면 종료되기 때문에 9번까지만 출력(i <= 10 가능)
			System.out.println("Hello, world! " + i); // i를 붙이면 뒤에 넘버링이 되어 갯수가 맞는지 확인가능(단, 0부터 시작)
		}
		/*
		    2. 초기값, 증가값, 조건은 마음대로 변경할 수 있다.
		*/
		for (int i = 100; i > 0; --i) {
			System.out.println("Hello, world! " + i);
		}
		
		/*
		  	3. 초기값과 증가값의 위치는 마음대로 변경할 수 있다.
		*/
		int a = 123;
		for (; a < 234;) {
//			a += 5;
			System.out.println("Hello! " + a);
			a += 5; // 증가값을 여기에 적어도 된다
		}
		
		/*
		  	4. 반복문 내부에 다른 문법들도 자유롭게 사용할 수 있다.
		*/
		for (int month = 1; month <= 12; ++month) {
			String season;
			
			switch(month) {
			case 12: case 1: case 2:
				season = "겨울";
				break;
			case 3: case 4: case 5:
				season = "봄";
				break;
			case 6: case 7: case 8:
				season = "여름";
				break;
			case 9: case 10: case 11:
				season = "가을";
				break;
			default:
				season = "없음";
				break;
			}
			System.out.printf("%d월은 %s입니다.\n", month, season);
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
