package myobj.Dice;

public class fiveDice {
	
	static int DICES_NUM = 5;
	static int NUM_OF_DICE = 6;
	
	int[] dices;
	int[] number;
	
	public fiveDice() {
		dices = new int[DICES_NUM];
		number = new int[NUM_OF_DICE];
	}
	
	public void rNum() {
		for(int i = 0; i < 5; i++) {
			dices[i] = number[(int)(Math.random() * NUM_OF_DICE + 1)];
		}
	}
	
	// Full House
	// Small
	boolean Small() {
		boolean small = false;
		return true;
	}
	
	boolean Large() {
		boolean large = false;
		return large;
	}
}
