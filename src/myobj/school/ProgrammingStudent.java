package myobj.school;

public class ProgrammingStudent extends Student {

	//variable
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() { // 
		super();
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + pl + al + ds);
	}
	
	double getAverage() {
		return getSum() / 6.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("┌────────────────────────────────────────────────┐");
//		System.out.println("│이름 : " + super.name + " │ 총점: " + getSum() + " 평균 : " + getAverage() + "│"); // super를 안써도 됨 (자식클래스에 네임이 없어서..)
		System.out.println("│이름 : " + getName() + " │ 총점: " + getSum() + " 평균 : " + getAverage() + "│"); // super를 안써도 됨 (자식클래스에 네임이 없어서..)
		System.out.println("│국어\t영어\t수학\tPL\tAL\tDS       │");
		System.out.println("│------------------------------------------------│");
		System.out.printf( "│%d\t%d\t%d\t%d\t%d\t%d       │\n", kor, eng, math, pl, al, ds);
		System.out.println("└────────────────────────────────────────────────┘");
	}
}
