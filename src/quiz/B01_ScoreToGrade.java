package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {

	/*
	   	점수를 입력받으면 점수에 해당하는 알맞은 등급을 출력해주는 프로그램을 만들어보세요
	   	
	   		90점 이상 : A
	   		80점 이상 : B
	   		70점 이상 : C
	   		60점 이상 : D
	   		그 외	 : F
	   		
	   	※ 유효한 점수는 0 ~ 100점 입니다.
	  	
	 */
		
	public static void main(String[] args) {
		/*
	 // ※ 입력을 받았을 때는 잘못된 값을 먼저 거르는 것이 좋다
		Scanner sc = new Scanner(System.in);
		
		char grade = 'Z';
	 // String msg;
		int score;
		
		System.out.print("점수를 입력해주세요 > ");
		score = sc.nextInt();
		
		if (score < 0 || score >100) {
			System.out.println("잘못된 점수입니다.");
			grade = 'F';
		//	msg = "잘못된 값을 입력하셨습니다.";
		} else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 등급은 %c입니다.\n", grade);
		//	msg = String.format("당신의 등급은 %c입니다.", grade);
		//	System.out.println(msg);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. > ");
		int score = sc.nextInt();
		
		if(score < 0 || score >100) {
			System.out.println("올바른 점수를 입력하세요.");
		} else if (score >= 90 && score <= 100) {
			System.out.println("A 입니다.");
		} else if (score >= 80 && score < 90) { // score < 90, 위에 if문에서 걸러져서 온 값이기 때문에 해당 수식을 쓸 필요가 없다
			System.out.println("B 입니다.");
		} else if (score >= 70) {
			System.out.println("C 입니다.");
		} else if (score >= 60) {
			System.out.println("D 입니다.");
		} else {
			System.out.println("F 입니다.");
		}
		
		
	}
	
}
