package quiz;

import java.util.Collections;
import java.util.HashSet;

public class D07_CheckValidSocialNumber {
/*
	사용자가 주민등록번호를 입력하면
	그 주민등록번호가 유효한지 검사하는 프로그램을 만들어보세요
	
	맨앞 2자리 숫자
	월 자리에 01 ~ 12 이내 숫자
	일 자리에 01 ~ 31 이내의 숫자
	(1, 3, 5, 7, 8, 10, 12월이면 31일 / 4, 6, 9, 11월이면 30일 /
	 2월은 윤년일때 29 아니면 28일)
	 7번째 자리 '-'
	 뒷자리 전부 숫자
*/
	private static HashSet<Integer> month30;
	private static HashSet<Integer> month31;
	
	static {
		month30 = new HashSet<>();
		month31 = new HashSet<>();
		
		Collections.addAll(month30, 1, 3, 5, 7, 8, 10, 12);
		Collections.addAll(month31, 4, 6, 9, 11);
	}
	
	private static boolean validGender(char gender) {
		return gender >= '1' && gender <= '4';
//		if (gender == '1' || gender == '2' || gender == '3' || gender == '4')
	}
	
	private static int calcYear(int year, char gender) {
		return gender < '3' ? year + 1900 : year + 2000;
		// 아래 식을 한줄로 표현할 수 있다.
//		if (gender < '3') {
//			return year + 1900;
//		} else {
//			return year + 2000;
//		}
	}
	
	public static boolean check(String sn) {
		char[] sn_arr = sn.toCharArray();
		
		if (!validGender(sn_arr[7])) {
			System.out.println("[Warning] 성별에 문제가 있습니다.");
			return false;
		}
		
		int year = calcYear(
				Integer.parseInt("" + sn_arr[0] + sn_arr[1]),
				sn_arr[7]);
		int month = Integer.parseInt("" + sn_arr[2] + sn_arr[3]);
		int date = Integer.parseInt("" + sn_arr[4] + sn_arr[5]);
		
		if (month30.contains(month) && (date < 1 || date > 30)) {
			// month30에 포함도지만 date에 벗어나면 거른다.
			System.out.println("[Warning] 날자에 문제가 있습니다.");
			return false;
		} else if (month31.contains(month) && (date < 1 || date > 31)) {
			System.out.println("[Warning] 날자에 문제가 있습니다.");
			return false;
		} else if (month == 2) {
			boolean leapYear = (year % 400 == 0)
					|| (year % 4 == 0 && year % 100 != 0);
			
			if (leapYear && (date < 1 || date > 29)) {
				System.out.println("[Warning] 윤년은 29일까지 입니다.");
				return false;
			} else if (!leapYear && (date < 1 || date > 28)) {
				System.out.println("[Warning] 2월은 28일까지 입니다.");
				return false;
			}
		}
		
		return true;
		// 거를건 다 걸렀으므로 나가는 값은 true로 나가야 에러가 안난다
	}
	
	public static void main(String[] args) {
		if (check("000229-3234567")) {
			System.out.println("올바른 주민번호입니다");
		} else {
			System.out.println("잘못된 주민번호입니다.");
		}
	}
}
