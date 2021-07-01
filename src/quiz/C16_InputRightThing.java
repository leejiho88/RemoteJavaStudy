package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {
/*
	사용자로부터 숫자를 입력받되 숫자를 제대로 입력받을때 까지 계속 입력받는 프로그램을 만들어 보세요
	(다른 타입의 값이 입력되어도 강제종료되지 않아야 합니다.)
*/
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 스캐너에 잘못된 입력을 하면 찌꺼기가 남아있게 된다
		
		while (true) {
			try {
				System.out.println("숫자 >> ");
				int a =sc.nextInt();
				System.out.println(a);		// 예외가 발생하지 않을시 catch로
				System.out.println("성공!");	// 가지 않고 정수를 입력하면 a 출력
				break;	// 차례로 실행됨, 제대로 입력했다면 break를 만나 탈출
			} catch(InputMismatchException e) {
				System.out.println("제대로 된 숫자로 다시 입력해주세요!");
				System.out.println("잘못 입력됐던 것: " + sc.nextLine());
				// sc.nextLine은 타입 상관없이 출력해줌, 출력 되지 않으면 입력받은
				// 출력될떄 까지 입력받은 값이 남아있음
			}
		}
	}
}
