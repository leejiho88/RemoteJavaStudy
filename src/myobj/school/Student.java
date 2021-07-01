package myobj.school;

abstract public class Student { // 나중에 물려받아서 사용하게끔 (국어, 영어점수, 반이름이 있다)
	
	final static int MAX_SCORE = 100;	//100점이 만점
	
	static String[] lastNameArray = {
			"강", "고", "구", "권", "김", "나","박", "이",
			"최", "남궁", "제갈", "배", "서", "현", "안", "임", "유",
			"백", "오", "신", "양", "진", "독고"};
	
	static String[] firstNameArray = {
			"수환", "의성", "종윤", "지수", "천혁", "소영", "은철", "승모",
			"수빈", "승민", "수영", "덕중", "지호", "한나", "소윤", "두식",
			"웅빈", "진호"
	};
	
	// static에서 인스턴스를 쓰면 문제 x (스태틱이 인스턴스보다 무조건 먼저 있기 때문에 써도 된다)
	static String generateRandomName() {	//사람 랜덤
		return lastNameArray[(int)(Math.random() * lastNameArray.length)]
				+ firstNameArray[(int)(Math.random() * firstNameArray.length)];
	}
	
	static int generateRandomScore() {		//점수 랜덤
		return (int)(Math.random() * (MAX_SCORE + 1));
	}
	
	String name;
	int kor;
	int eng;
	
	//생성자
	public Student() {
		name = generateRandomName();
//		kor = (int)(Math.random() * 101); // 똑같은 짓을 반복하면 함수를 만들어 쓰는게 좋다
//		eng = (int)(Math.random() * 101); // static int generateRandomScore()
		kor = generateRandomScore();
		eng = generateRandomScore();
	}
	
	abstract public void printGradeCard();	//추상메소드
	
	public String getName() { // 다른 패키지에서 가져다 쓰기 위해서 퍼블릭을 붙여줌
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	get 함수에서 받아오는거
//	set 변수에 입력하는거
}