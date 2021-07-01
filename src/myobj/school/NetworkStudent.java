package myobj.school;

public class NetworkStudent extends Student {
	
	//����
	int re;
	int ne;
	int cc;
	
	//������ constructor
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
		System.out.println("����������������������������������������������������������������������������������������������������");
		//System.out.println("���̸� : " + super.name + " �� ����: " + getSum() + " ��� : " + getAverage() + "��"); // super�� �Ƚᵵ �� (�ڽ�Ŭ������ ������ ���..)
		System.out.println("���̸� : " +  getName() + " �� ����: " + getSum() + " ��� : " + getAverage() + "                ��"); // super�� �Ƚᵵ �� (�ڽ�Ŭ������ ������ ���..)
		System.out.println("������\t����\tRE\tNE\tCC               ��");
		System.out.println("��------------------------------------------------��");
		System.out.printf( "��%d\t%d\t%d\t%d\t%d               ��\n", kor, eng, re, ne, cc);
		System.out.println("����������������������������������������������������������������������������������������������������");
	}
}
