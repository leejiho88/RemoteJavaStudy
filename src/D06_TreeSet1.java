import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.Student;

public class D06_TreeSet1 {
	public static void main(String[] args) {
	// �л� �ν��Ͻ��� 100�� �����, TreeSet�� ��� ���� ������ ������ ��
	// ��� ������ 50������ 70�� ������ �л��� ��� ������� ������� 
	
		TreeSet<Student> stu_set = new TreeSet<>();
		
		for (int i = 0; i < 100; ++i) {
			stu_set.add(new Student());
		}

		System.out.println(stu_set);
		System.out.println("�л��� �� " + stu_set.size() + "�� �Դϴ�.");

		Student from = new Student();
		Student to = new Student();
                
		from.avg = 50.0;
		to.avg = 70.0;

		System.out.println(stu_set.subSet(from, to));

	}
}