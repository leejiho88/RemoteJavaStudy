import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D05_Comparator {
/*
	# Comparable
	
	 - �� �������̽��� ������ Ŭ������ ���� ũ�Ⱑ �� ������ Ŭ������ �ȴ�
	 - �� �������̽��� ������ Ŭ������ Collections�� ���� ����� �̿��� �� �ִ�
	
	# Comparator
	
	 - �� �������̽��� ������ Ŭ������ ���� �������� ���ȴ�.
	 
 */
	public static void main(String[] args) {
		
		Snack s1 = new Snack("��Ϲ���Ĩ", "�Ե�", "��Ϲ��͸�", 600, 2000);
		Snack s2 = new Snack("�����۽�", "��ȭ", "���ĸ�", 800, 2000);
		Snack s3 = new Snack("ĭ��", "�Ե�", "����", 250, 1000);
		Snack s4 = new Snack("Ȩ����", "LG��Ȱ�ǰ�", "����", 359, 1750);
		Snack s5 = new Snack("����ƽ", "KG", "���ڸ�", 700, 1200);
		
		ArrayList<Snack> snacks = new ArrayList<>();
		
		Collections.addAll(snacks, s1, s2, s3, s4, s5);
//		System.out.println(snacks);
		
//		Collections.sort(snacks, new ����������());
//		System.out.println(snacks);
//		
//		Collections.sort(snacks, new ���ںз���_��������());
//		System.out.println(snacks);
//		
//		Comparator<Snack> reversed_���ںз��� = Collections.reverseOrder(new ���ںз���());
//		
//		Collections.sort(snacks, reversed_���ںз���);
//		System.out.println(snacks);
//		
//		Collections.sort(snacks);
//		System.out.println(snacks);
		
		Collections.sort(snacks, new �̸���������());
		System.out.println(snacks);
	}
}

class Snack implements Comparable<Snack> {
	String name;
	String company;
	String taste;
	int calorie;
	int price;
	
	public Snack(String name, String company, String taste, int calorie, int price) {
		this.name = name;
		this.company = company;
		this.taste = taste;
		this.calorie = calorie;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s/%s/%dkcal/%d��", name, company, taste, calorie, price);
	}

	@Override // ���� ������ ���ٸ� �̸������� �����Ѵ�
	public int compareTo(Snack o) {
		if (this.price > o.price) {
			return 1;
		} else if (this.price < o.price) {
			return -1;
		} else {
			return this.name.compareTo(o.name);
		}
	}
	
	public int compareC(Snack c) {
		if (this.company.charAt(0) > c.company.charAt(0)) {
			return 1;
		} else if (this.company.charAt(0) < c.company.charAt(0)) {
			return -1;
		} else {
			return this.name.compareTo(c.name);
		}
	}
}
/*
	������ �̸� ���� �������� ������ �ϵ�, ���� �������� ������ �̸����� �������� �����غ���
	(���� 3���� �� �߰��غ���)
*/

class �̸��������� implements Comparator<Snack> {
	
	@Override
	public int compare(Snack c1, Snack c2) {
		if (c1.company.charAt(0) > c2.company.charAt(0)) {
			return -1;
		} else if (c1.company.charAt(0) < c2.company.charAt(0)) {
			return 1;
		} else {
			return 0;	
		}
	}
}

class ���ںз��� implements Comparator<Snack> {
	
	@Override
	public int compare(Snack o1, Snack o2) {
		if (o1.calorie > o2.calorie) {
			return 1;
		} else if (o1.calorie < o2.calorie) {
			return -1;
		} else {
			return 0;	
		}
	}
}

class ���ںз���_�������� implements Comparator<Snack>{
	
	@Override
	public int compare(Snack o1, Snack o2) {
		if (o1.calorie > o2.calorie) {
			return -1;
		} else if (o1.calorie < o2.calorie) {
			return 1;
		} else {
			return 0;	
		}
	}
}

class ���������� implements Comparator<Snack>{
	/*
		# compare ��Ģ
		
		 �� ���� �ڸ��� �ٲٰ� ������ 1�� ����
		 �� ���� �ڸ��� �ٲ��� �ʰ� ������ -1�� ����
		 �� ���� ���� ���� ���̶�� 0�� ����
	*/
	@Override
	public int compare(Snack o1, Snack o2) {
		if (o1.price > o2.price) {
			return 1;
		} else if (o1.price < o2.price) {
			return -1;
		} else {
			return 0;	
		}
	}
}