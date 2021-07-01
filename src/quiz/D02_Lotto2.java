package quiz;

import java.util.ArrayList;
import java.util.Random;

public class D02_Lotto2 {
/*
	1. 1 ~ 45�� �ߺ����� ���� ���ڸ� �����ϴ� �޼��带 �ۼ��غ�����
	   (��÷��ȣ�� 7��, �մ��� ���� ��ȣ�� 6��) 
	
	2. ���α׷��� ���۵Ǹ� ��÷��ȣ�� �ϳ� �����ϰ� (���� 7��)
	   ��÷��ȣ�� ��ġ�ϴ� 7���� ���ڰ� ���� �� ���� ��ȣ�� ��� �̾ƺ�����
	   
	3. 1�� �Ǵ� 2� ��÷�ɋ����� ���� �󸶳� ����� ����غ����� (���� 6���� ���� ������ õ��)
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
		
		System.out.println("��÷ ��ȣ: " + comNum1);
		System.out.println("���ʽ� ��ȣ: " + comNum1.get(6));
		
		int won = 0;
		
		while(true) {
			won += 1000;
			customerNum1.retainAll(comNum1);
			
			if (customerNum1.size() == 6) {
				System.out.println("�� 1�� ��÷");
				System.out.println("Lotto ���� ���: " + won);
				won += 1000;
				break;
				
			} else if (customerNum1.size() == 5) {
				System.out.println("�� 2�� ��÷");
				System.out.println("Lotto ���� ���: " + won);
				won += 1000;
				break;
			}
		}
		System.out.println("Lotto ���� ���: " + won);
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