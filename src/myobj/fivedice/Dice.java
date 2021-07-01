package myobj.fivedice;

import java.util.Arrays;

public class Dice {

	final static int MAX_DICES = 5;
	final static int MAX_DICE_NUM = 6;
	int[] dices;
	int[] counts;
	
	public Dice() {
		dices = new int[MAX_DICES];
		counts = new int[MAX_DICE_NUM];
	}
	
	public void roll() {
		for (int i = 0; i < MAX_DICES; i++) {
			dices[i] = (int)(Math.random() * MAX_DICE_NUM + 1);
		}
	}
	
	public void rollOne(int index) {
		dices[index - 1] = (int)(Math.random() * MAX_DICE_NUM + 1);
	}
	
	public void countDices() {
		for (int i = 0; i < MAX_DICE_NUM; i++) {
			counts[i] = 0;
		}
		
		for (int i = 0; i < MAX_DICES; i++) {
			counts[dices[i] - 1]++;
		}
	}
	
	public void checkAll() {
		System.out.println("Your dices: " + Arrays.toString(dices));
		if (checkNo5()) {
			System.out.println("5 ���̽�!!");
		} else if (checkNo4()) {
			System.out.println("4 ���̽�!!");
		} else if (checkNo3()) {
			System.out.println("���� ��Ʈ����Ʈ!!");
		} else if (checkNo2()) {
			System.out.println("���� ��Ʈ����Ʈ!!");
		} else if (checkNo1()) {
			System.out.println("Ǯ�Ͽ콺!!");
		} else {
			System.out.println("�ƽ�����..�ƹ��͵� �ƴϿ���..");
		}
	}
	
	// Ǯ�Ͽ콺 Ȯ���ϱ�.
	boolean checkNo1() {
		boolean check2 = false;
		boolean check3 = false;
		
		for (int count : counts) {
			if (count == 2) {
				check2 = true;
			} else if (count == 3) {
				check3 = true;
			}
		}
		return check2 && check3;
	}
	
	// ���� ��Ʈ����Ʈ Ȯ���ϱ�.
	boolean checkNo2() {
		boolean check = false;
		
		if (counts[2] >= 1 && counts[3] >= 1) {
			if (counts[0] >= 1 && counts[1] >= 1 || counts[1] >= 1 && counts[4] >= 1 || counts[4] >= 1 && counts[5] >= 1) {
				check = true;
			}
		}
		return check;
	}
	
	// ���� ��Ʈ����Ʈ Ȯ���ϱ�.
	boolean checkNo3() {
		boolean check = false;
		
		if (counts[1] >= 1 && counts[2] >= 1 && counts[3] >= 1 && counts[4] >= 1) {
			if (counts[0] >= 1 || counts[5] >= 1) {
				check = true;
			}
		}
		return check;
	}
	
	// 4 ���̽� Ȯ���ϱ�.
	boolean checkNo4() {
		boolean check = false;
		for (int count : counts) {
			if (count >= 4) {
				check = true;
			}
		}
		return check;
	}
	
	// 5 ���̽� Ȯ���ϱ�.
	boolean checkNo5() {
		boolean check = false;
		for (int count : counts) {
			if (count == 5) {
				check = true;
			}
		}
		return check;
	}
}
