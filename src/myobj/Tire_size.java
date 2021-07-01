package myobj;

public class Tire_size {

	String name;
	int radius;
	String brand;
	double wieght;
	double tread;
	String tread_pattern;
	static double pi = 3.14;
	static int[] wheel_size = {30, 31, 32, 33};
	
}
// 초기 스펙의 경우 스테틱 가능, 나중에 변경되더라도 초기에 변경이 없는것
class TaxiDriver{
	static final int MAX_DRIVER_COUNT = 300;
	static int allDriverCount;
	
	String name;
}
class YellowGomJelly{
	static int score = 150;
	int x;
	int y;
}

class PinkGomJelly{
	static int score = 300;
}

class Marine{
	static int attack = 5;
	int hp;
}