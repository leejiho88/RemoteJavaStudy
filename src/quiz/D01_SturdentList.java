package quiz;

import java.util.ArrayList;

import myobj.Student;

public class D01_SturdentList {
/*
	학생클래스를 요소로 갖는 arrayList를 생성하고 학생을 30명 추가해보세요
	 
	 1. 각 학생의 점수는 랜덤으로 설정
	 
	 2. 과목은 국/영/수
	 
	 3. 30명의 평균 점수를 출력
	 
	 4. 30명 중 가장 평균 점수가 높은 학생의 성적을 출력
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
		
		System.out.println("가장 높은 점수 : " + Student.best_avg);
		System.out.println("가장 높은 점수인 학생의 학번 : " + Student.best_avg_snum);
	}
	
	
}