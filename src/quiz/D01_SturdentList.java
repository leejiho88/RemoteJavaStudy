package quiz;

import java.util.ArrayList;

import myobj.Student;

public class D01_SturdentList {
/*
	�л�Ŭ������ ��ҷ� ���� arrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 
	 1. �� �л��� ������ �������� ����
	 
	 2. ������ ��/��/��
	 
	 3. 30���� ��� ������ ���
	 
	 4. 30�� �� ���� ��� ������ ���� �л��� ������ ���
*/
	public static void main(String[] args) {
		ArrayList<Student> student_list = new ArrayList<>();
		
		for (int i = 0; i < 30; i++) {
			student_list.add(new Student());
		}
	///	for (Student student : new Student[] {new Student(), new Student()}) {
		for (Student student : student_list) {
			System.out.println(student);
		}
		
		System.out.println("���� ���� ���� : " + Student.best_avg);
		System.out.println("���� ���� ������ �л��� �й� : " + Student.best_avg_snum);
	}
	
	
}