package myobj.school;

public class MachinerunningStudent extends Student {
	
	// 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수가 있다 statistics
	int math;
	int st;
	int pl;
	
	public MachinerunningStudent() { // 
		super();
		math = generateRandomScore();
		st = generateRandomScore();
		pl = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + st + pl);
	}
	
	double getAverage() {
		return getSum() / 5.0; 
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("┌────────────────────────────────────────────────┐");
		//System.out.println("│이름 : " + super.name + " │ 총점: " + getSum() + " 평균 : " + getAverage() + "│"); // super를 안써도 됨 (자식클래스에 네임이 없어서..)
		System.out.println("│이름 : " + getName() + " │ 총점: " + getSum() + " 평균 : " + getAverage() + "│"); // super를 안써도 됨 (자식클래스에 네임이 없어서..)
		System.out.println("│국어\t영어\t수학\tST\tPL          │");
		System.out.println("│------------------------------------------------│");
		System.out.printf( "│%d\t%d\t%d\t%d\t%d                │\n", kor, eng, math, st, pl);
		System.out.println("└────────────────────────────────────────────────┘");
	}

}
