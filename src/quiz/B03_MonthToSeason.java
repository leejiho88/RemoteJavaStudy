package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {

	/*
	  	사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
	  	(switch-case문을 사용할 것)	  
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String season;
		
		System.out.print("월을 입력하세요 > ");
		int month = sc.nextInt();
		
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
			break; // default를 안써주면 아래 season에 빨간줄이 뜬다.(들어갈 수도 있고 안들어갈 수 도있는 확률이 존재 하기 때문)
		}
		if (month < 1 || month >12) {
			System.out.println("잘못된 계절입니다.");
		} else {
			System.out.printf("%d월은 %s입니다.\n", month, season);
		}
		/*
		switch (month) {
		case 1:
			System.out.println("계절은 겨울 입니다.");
			break;
		case 2:
			System.out.println("계절은 겨울 입니다.");
			break;	
		case 3:
			System.out.println("계절은 봄 입니다.");
			break;
		case 4:
			System.out.println("계절은 봄 입니다.");
			break;
		case 5:
			System.out.println("계절은 봄 입니다.");
			break;
		case 6:
			System.out.println("계절은 여름 입니다.");
			break;
		case 7:
			System.out.println("계절은 여름 입니다.");
			break;
		case 8:
			System.out.println("계절은 여름 입니다.");
			break;
		case 9:
			System.out.println("계절은 가을 입니다.");
			break;
		case 10:
			System.out.println("계절은 가을 입니다.");
			break;
		case 11:
			System.out.println("계절은 가을 입니다.");
			break;
		case 12:
			System.out.println("계절은 겨울 입니다.");
			break;
		default:
			System.out.println("달을 잘못 입력하셨습니다.");
		}
		*/
		/*
		boolean winter = (month == 1 && month == 2 && month == 12);
		boolean spring = (month == 3 && month == 4 && month == 5);
		boolean summer = (month == 6 && month == 7 && month == 8);
		boolean autumn = (month == 9 && month == 10 && month == 11);
		*/
		
	}
}
