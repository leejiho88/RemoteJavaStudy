package myobj_me;

import myobj.Unit;

public class Bus {
	
	int[][] Seat = {
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		};
	int eSeat = 0;
	
	Bus(){
		System.out.println("���� ���� �¼�");
		
		for (int row = 0; row < 3; row++) {
			for (int colum = 0; colum < 10; colum++) {
				Seat[row][colum] = (int)(Math.random() * 2);
				
				if (Seat[row][colum] == 0) {
					eSeat +=1;
				}
				if (Seat[row][colum] == 0) {
					System.out.print("�� ");
					if (colum >= 9) {
						System.out.println();
					}
				} else if (Seat[row][colum] == 1) {
					System.out.print("�� ");
					if (colum >= 9) {
						System.out.println();
					}
				}
			}
		}
	}
	void emptySeat() {
		System.out.printf("�ܿ� �¼� ��: %d", eSeat);
		return;
	}
}

