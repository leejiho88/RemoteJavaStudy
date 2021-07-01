package quiz;

import java.util.ArrayList;

public class D01_SturdentList_me {
/*
	학생클래스를 요소로 갖는 arrayList를 생성하고 학생을 30명 추가해보세요
	 
	 1. 각 학생의 점수는 랜덤으로 설정
	 
	 2. 과목은 국/영/수
	 
	 3. 30명의 평균 점수를 출력
	 
	 4. 30명 중 가장 평균 점수가 높은 학생의 성적을 출력
*/
	
	
	public static void main(String[] args) {
		Student s = new Student();
		
		ArrayList<Student> students = new ArrayList<>();
		int maxStudents = 30;
		int count = 0;
		
		for(int i = 0 ; i < maxStudents; i++) {
			//add로 ArrayList에 삽입 (Student 객체 생성하면서)
			students.add(new Student(1));
			//get으로 ArrayList에서 i번째 Student를 끄집어냄->거기서 print 함수 사용
			
			double aver = students.get(i).average();
			double bestAver = students.get(0).average();
					
			if (bestAver < aver) {
				bestAver = aver;
				count = i;
			}
			
			students.get(i).print();
//			System.out.println(students.get(i));
		}
//		Student tmp = new Student("지호");
//		tmp.print();//출력문
		System.out.println("==============최고의 평균점수==============");
		students.get(count).print();
	}
}

class Student {
	String[] lastName = {
			"존", "이", "김", "맥그리거"};
	
	String[] firstName = {
			"지호", "형권", "콘스탄틴", "윅", "코너"};
	
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
		System.out.println("이름: " + name);
		System.out.println("국어 : " + kor + "  영어 : " + eng + "  수학 : " + math);
		System.out.println("평 균 : " + average());
	}
	
}
