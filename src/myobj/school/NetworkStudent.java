package myobj.school;

public class NetworkStudent extends Student {
	
	//변수
	int re;
	int ne;
	int cc;
	
	//생성자 constructor
	public NetworkStudent() { // 
		super();
		re = generateRandomScore();
		ne = generateRandomScore();
		cc = generateRandomScore();
	}
	
	//Method
	int getSum() {
		return (kor + eng + re + ne + cc);
	}
	
	double getAverage() {
		return getSum() / 5.0;
	}

	@Override
	//Method
	public void printGradeCard() {
		System.out.println("┌────────────────────────────────────────────────┐");
		//System.out.println("│이름 : " + super.name + " │ 총점: " + getSum() + " 평균 : " + getAverage() + "│"); // super를 안써도 됨 (자식클래스에 네임이 없어서..)
		System.out.println("│이름 : " +  getName() + " │ 총점: " + getSum() + " 평균 : " + getAverage() + "                │"); // super를 안써도 됨 (자식클래스에 네임이 없어서..)
		System.out.println("│국어\t영어\tRE\tNE\tCC               │");
		System.out.println("│------------------------------------------------│");
		System.out.printf( "│%d\t%d\t%d\t%d\t%d               │\n", kor, eng, re, ne, cc);
		System.out.println("└────────────────────────────────────────────────┘");
	}
}
