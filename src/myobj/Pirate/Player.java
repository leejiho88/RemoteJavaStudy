package myobj.Pirate;

public class Player {
/*
	1. �÷��̾�� ���ϴ� ���� ���ư��鼭 Į�� ���

	2. ���� �������� ���ư��� ������ �������� �����ȴ�

	3. �÷��̾�� �������� �� �� �ִ� (�ּ� 2��, �ִ�� ���� ���ڸ�ŭ)

	4. �� ���� ������ ���� ������ ������ �� �ִ�.

	5. ���� �������� ���� �÷��̾ �й��Ѵ�
		
*/
	String name;
	int win;
	int lose;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void win() {
		this.win++;
	}
	
	public void lose() {
		this.lose++;
	}
	
	public String getName() {
		return name;
	}
}
