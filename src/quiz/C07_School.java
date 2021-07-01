package quiz;

import myobj.school.MachinerunningStudent;
import myobj.school.NetworkStudent;
import myobj.school.ProgrammingStudent;
import myobj.school.Student;

//import ����Ű ��Ʈ��+����Ʈ+O

public class C07_School {
	/*
	1. �� ���� ������ 30���̴�.
	
	2-1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�
	
	2-2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�
	
	2-3. �ӽŷ��� �� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�
	
	3. ��� �л��� ���� ������ �̸��� �������� �����Ѵ�.
	   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�. (�Ǵ� �ߺ����� ������ ����)
	   
	4. ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־�� �Ѵ�.
*/
	//method
	public static void main(String[] args) {
//		ProgrammingStudent pro = new ProgrammingStudent();
//		NetworkStudent net = new NetworkStudent();
//		MachinerunningStudent mac = new MachinerunningStudent();
		
		Student[] school = new Student[30];
		
		double a = 0;
		float b = 0;
		int c = 0;
		
		//�� int�� float�� �ȵ���
		//c = b;
		
		for (int i = 0; i < school.length; i++) {
			school[i] = new ProgrammingStudent();
			school[i].printGradeCard();

			school[i] = new NetworkStudent();
			school[i].printGradeCard();

			school[i] = new MachinerunningStudent();
			school[i].printGradeCard();
		}
		
//		System.out.println(pro.getName());
//		pro.printGradeCard();
//		net.printGradeCard();
//		mac.printGradeCard();
	}
}