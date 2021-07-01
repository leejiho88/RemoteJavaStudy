package quiz;

import java.util.Scanner;

public class A06_GuessAge {

	public static void main(String[] args) {
	 
		/*
			사용자로부터 태어난 해와 올해의 년도를 입력받으면
			그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요
		*/ 
	 /*
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("당신이 태어난 해는 언제인가요?");
	 int year = sc.nextInt();
	 System.out.print("올해는 몇년도 인가요?");
	 int year1 = sc.nextInt();
	 
	 System.out.println("당신의 한국 나이는 : "+ (year1 - year + 1));
	 */
	 
	 
	  Scanner sc = new Scanner(System.in);
	  int birthYear, thisYear;
	  int age;
	  
	  System.out.print("태어난 해를 입력 > ");
	  birthYear = sc.nextInt();
	   
	  System.out.print("올해를 입력 > ");
	  thisYear = sc.nextInt();
	  
	  age = thisYear - birthYear + 1;
	  
//	  System.out.println("당신의 나이는 "
//	  			+ (thisYear - birthYear + 1) + "살 입니다.");
 
	  System.out.println("당신의 나이는 " + age + "살 입니다.");
	  
	 
	 
	 
 }
	
}
