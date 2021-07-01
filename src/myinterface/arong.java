package myinterface;

public class arong implements Puppy_Food{
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
			System.out.println("사료가 가득 찼습니다");
		} else {
			if (food == 2) {
				System.out.println("사료가 절반 남았습니다.");
			} else if (food == 0) {
				System.out.println("사료가 비었습니다.. 아롱이가 슬퍼합니다.");
			}
		}
		
		if (water_check() == true) {
			System.out.println("그만 주세요.. 아롱이가 오줌을 많이 쌉니다.");
		} else {
			if (water == 2) {
				System.out.println("물이 절반 정도 남았습니다");
			} else if (water == 0) {
				System.out.println("아롱이가 심한 갈증을 느낍니다.");
			}
		}
	}
}
