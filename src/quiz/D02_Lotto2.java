package quiz;

import java.util.ArrayList;
import java.util.Random;

public class D02_Lotto2 {
/*
	1. 1 ~ 45의 중복없는 랜덤 숫자를 생성하는 메서드를 작성해보세요
	   (당첨번호는 7개, 손님이 고르는 번호는 6개) 
	
	2. 프로그램이 시작되면 당첨번호를 하나 지정하고 (숫자 7개)
	   당첨번호와 일치하는 7개의 숫자가 나올 때 까지 번호를 계속 뽑아보세요
	   
	3. 1등 또는 2등에 당첨될떄까지 돈을 얼마나 썼는지 계산해보세요 (숫자 6개를 뽑을 때마다 천원)
*/
	public static void main(String[] args) {
		ArrayList<LottoNum> customerNum1 = new ArrayList<>();
		ArrayList<LottoNum> customerNum2 = new ArrayList<>();
		
		ArrayList<LottoNum> comNum1 = new ArrayList<>();
		ArrayList<LottoNum> comNum2 = new ArrayList<>();
		ArrayList<LottoNum> comNum3 = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			customerNum1.add(new LottoNum());
			customerNum2.add(new LottoNum());
		}
		
		for (int i = 0; i < 7; i++) {
			comNum1.add(new LottoNum());
			comNum2.add(new LottoNum());
		}
		
		customerNum1.removeAll(customerNum2);
		comNum1.removeAll(comNum2);
		
		comNum3 = comNum1;
		
		System.out.println("당첨 번호: " + comNum1);
		System.out.println("보너스 번호: " + comNum1.get(6));
		
		int won = 0;
		
		while(true) {
			won += 1000;
			customerNum1.retainAll(comNum1);
			
			if (customerNum1.size() == 6) {
				System.out.println("축 1등 당첨");
				System.out.println("Lotto 구매 비용: " + won);
				won += 1000;
				break;
				
			} else if (customerNum1.size() == 5) {
				System.out.println("축 2등 당첨");
				System.out.println("Lotto 구매 비용: " + won);
				won += 1000;
				break;
			}
		}
		System.out.println("Lotto 구매 비용: " + won);
	}
}

class LottoNum{
	public int Num;
	
	final private int MAX_NUMBER = 45;
	
	private static Random ran = new Random();
	
	public LottoNum() {
		Num = ran.nextInt(MAX_NUMBER + 1);
	}
	
	public String toString() {
		return String.format("%d", Num);
	}
	
}