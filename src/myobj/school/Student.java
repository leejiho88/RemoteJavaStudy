package myobj.school;

abstract public class Student { // ���߿� �����޾Ƽ� ����ϰԲ� (����, ��������, ���̸��� �ִ�)
	
	final static int MAX_SCORE = 100;	//100���� ����
	
	static String[] lastNameArray = {
			"��", "��", "��", "��", "��", "��","��", "��",
			"��", "����", "����", "��", "��", "��", "��", "��", "��",
			"��", "��", "��", "��", "��", "����"};
	
	static String[] firstNameArray = {
			"��ȯ", "�Ǽ�", "����", "����", "õ��", "�ҿ�", "��ö", "�¸�",
			"����", "�¹�", "����", "����", "��ȣ", "�ѳ�", "����", "�ν�",
			"����", "��ȣ"
	};
	
	// static���� �ν��Ͻ��� ���� ���� x (����ƽ�� �ν��Ͻ����� ������ ���� �ֱ� ������ �ᵵ �ȴ�)
	static String generateRandomName() {	//��� ����
		return lastNameArray[(int)(Math.random() * lastNameArray.length)]
				+ firstNameArray[(int)(Math.random() * firstNameArray.length)];
	}
	
	static int generateRandomScore() {		//���� ����
		return (int)(Math.random() * (MAX_SCORE + 1));
	}
	
	String name;
	int kor;
	int eng;
	
	//������
	public Student() {
		name = generateRandomName();
//		kor = (int)(Math.random() * 101); // �Ȱ��� ���� �ݺ��ϸ� �Լ��� ����� ���°� ����
//		eng = (int)(Math.random() * 101); // static int generateRandomScore()
		kor = generateRandomScore();
		eng = generateRandomScore();
	}
	
	abstract public void printGradeCard();	//�߻�޼ҵ�
	
	public String getName() { // �ٸ� ��Ű������ ������ ���� ���ؼ� �ۺ��� �ٿ���
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	get �Լ����� �޾ƿ��°�
//	set ������ �Է��ϴ°�
}