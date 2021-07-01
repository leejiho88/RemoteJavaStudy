import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.Student;

public class D06_TreeSet2 {
	public static void main(String[] args) {
		TreeSet<Fruit123> fru = new TreeSet<>();
		
		for (int i = 0; i < 20; i++) {
			fru.add(new Fruit123());
		}
		
		System.out.println(fru);
		
	}
}

class Fruit123 implements Comparable<Fruit123> {
	static String[] fruname = {
			"딸기", "Grape", "수박", "참외", "용과", "Kiwi", "Melon",
			"Apple", "Mango", "Banana", "Coconut", "Kakao", "아보카도",
			"배", "Blue Berry"};
	static int[] fruPrice = {
			1000, 1500, 1800, 2000, 2300, 3000, 3700, 4000,
			5000};
	
	public String name;
	public int price;
	public int etc;
	
	final private int MAX_ECT = 30;

	private static Random ran = new Random();
	
	public static String generateRandomName() {
		return fruname[(int)(Math.random() * fruname.length)];
	}
	public static int generateRandomPrice() {
		return fruPrice[(int)(Math.random() * fruPrice.length)];
	}
	
	public Fruit123() {
		etc = ran.nextInt(MAX_ECT + 1);
		name = generateRandomName();
		price = generateRandomPrice();
	}
	
	@Override
	public String toString() {
		return String.format("%s의 가격은 %d 수량은 %s 입니다.", name, price, etc);
	}
	@Override
	public int compareTo(Fruit123 o) {
		return Integer.compare(this.price, o.price);
	}
}