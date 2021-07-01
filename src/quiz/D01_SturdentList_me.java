package quiz;

import java.util.ArrayList;

public class D01_SturdentList_me {
/*
	�л�Ŭ������ ��ҷ� ���� arrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 
	 1. �� �л��� ������ �������� ����
	 
	 2. ������ ��/��/��
	 
	 3. 30���� ��� ������ ���
	 
	 4. 30�� �� ���� ��� ������ ���� �л��� ������ ���
*/
	
	
	public static void main(String[] args) {
		Student s = new Student();
		
		ArrayList<Student> students = new ArrayList<>();
		int maxStudents = 30;
		int count = 0;
		
		for(int i = 0 ; i < maxStudents; i++) {
			//add�� ArrayList�� ���� (Student ��ü �����ϸ鼭)
			students.add(new Student(1));
			//get���� ArrayList���� i��° Student�� �����->�ű⼭ print �Լ� ���
			
			double aver = students.get(i).average();
			double bestAver = students.get(0).average();
					
			if (bestAver < aver) {
				bestAver = aver;
				count = i;
			}
			
			students.get(i).print();
//			System.out.println(students.get(i));
		}
//		Student tmp = new Student("��ȣ");
//		tmp.print();//��¹�
		System.out.println("==============�ְ��� �������==============");
		students.get(count).print();
	}
}

class Student {
	String[] lastName = {
			"��", "��", "��", "�Ʊ׸���"};
	
	String[] firstName = {
			"��ȣ", "����", "�ܽ�źƾ", "��", "�ڳ�"};
	
	String rName() {
		return lastName[(int)(Math.random() * lastName.length)]
				+ firstName[(int)(Math.random() * firstName.length)];
	}
	
	int kor;
	int eng;
	int math;
	String name;
	
	double aver;
	int sum;
	public Student() {
		
	}
	public Student(int num) {
		this.name = rName();
		this.kor = (int)(Math.random() * 100 + 1);
		this.eng = (int)(Math.random() * 100 + 1);
		this.math = (int)(Math.random() * 100 + 1);
	}
	
	public int sum() {
		sum = kor + eng + math;
		return sum;
	}
	
	public double average() {
		aver = sum() / 3.0;
		aver = Math.round(aver*100)/100.0;
		return aver;
	}
	
	public void print() {
		System.out.println("�̸�: " + name);
		System.out.println("���� : " + kor + "  ���� : " + eng + "  ���� : " + math);
		System.out.println("�� �� : " + average());
	}
	
}
