package myobj.school;

public class MachinerunningStudent extends Student {
	
	// ����, ����, ����, �����, ���α׷��� ��� ������ �ִ� statistics
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
		System.out.println("����������������������������������������������������������������������������������������������������");
		//System.out.println("���̸� : " + super.name + " �� ����: " + getSum() + " ��� : " + getAverage() + "��"); // super�� �Ƚᵵ �� (�ڽ�Ŭ������ ������ ���..)
		System.out.println("���̸� : " + getName() + " �� ����: " + getSum() + " ��� : " + getAverage() + "��"); // super�� �Ƚᵵ �� (�ڽ�Ŭ������ ������ ���..)
		System.out.println("������\t����\t����\tST\tPL          ��");
		System.out.println("��------------------------------------------------��");
		System.out.printf( "��%d\t%d\t%d\t%d\t%d                ��\n", kor, eng, math, st, pl);
		System.out.println("����������������������������������������������������������������������������������������������������");
	}

}
