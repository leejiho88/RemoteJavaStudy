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
	// 학생 인스턴스를 100개 만들고, TreeSet에 평균 점수 순으로 저장한 후
	// 평균 점수가 50점에서 70점 사이인 학생이 모두 몇명인지 세어보세요 
	
		TreeSet<Student> stu_set = new TreeSet<>();
		
		for (int i = 0; i < 100; ++i) {
			stu_set.add(new Student());
		}

		System.out.println(stu_set);
		System.out.println("학생은 총 " + stu_set.size() + "명 입니다.");

		Student from = new Student();
		Student to = new Student();
                
		from.avg = 50.0;
		to.avg = 70.0;

		System.out.println(stu_set.subSet(from, to));

	}
}