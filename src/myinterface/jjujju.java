package myinterface;

public class jjujju implements Puppy_Food{

	int food = 0;
	int max_food = 4;
	int water = 0;
	int max_water = 5;
	
	
	@Override
	public int feed_food() {
		return food += 1;
	}

	@Override
	public int feed_water() {
		return water += 1;
	}

	@Override
	public boolean food_check() {
		if (food == max_food) {
			return false;
		} else {
			return true;
		}
	}
	@Override
	public boolean water_check() {
		if (water == max_water) {
			return false;
		} else {
			return true;
		}
	}
	
	public void feedCheck() {
		if (food_check() == true) {
			System.out.println("��ᰡ ���� á���ϴ�");
		} else {
			if (food == 2) {
				System.out.println("��ᰡ ���� ���ҽ��ϴ�.");
			} else if (food == 0) {
				System.out.println("��ᰡ ������ϴ�.. ���ް� �����մϴ�.");
			}
		}
		
		if (water_check() == true) {
			System.out.println("�׸� �ּ���.. ���ް� ������ ���� �Դϴ�.");
		} else {
			if (water == 2) {
				System.out.println("���� ���� ���� ���ҽ��ϴ�");
			} else if (water == 0) {
				System.out.println("���ް� ���� ������ �����ϴ�.");
			}
		}
	}

	
}
