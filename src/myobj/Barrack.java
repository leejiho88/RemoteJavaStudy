package myobj;

public class Barrack {

	final int MAX_QUEUE_SIZE = 5;
	
	Unit[] queue;
	int queue_index;
	
	Barrack(){ 
		queue = new Unit[5];
	}
	
	boolean checkMaxQueue() {
		return queue_index == MAX_QUEUE_SIZE;
	}

	void createSheep() {
		if (checkMaxQueue()) {
			System.out.println("���� ��⿭�� ���� á���ϴ�!");
			return;
			// voidŸ�� �Լ��� return�� �� �� �ִ�
			// ȣ���� ���� ���� ���������� �ʰ� �Լ��� �����Ѵ�
		}
		queue[queue_index++] = new Unit("��", 5);
	}
	
	void createCow() {
		if (checkMaxQueue()) {
			System.out.println("���� ��⿭�� ���� á���ϴ�!");
			return;
		}
		queue[queue_index++] = new Unit("��", 7);
	}
}
