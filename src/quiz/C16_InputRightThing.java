package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {
/*
	����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹����� ���� ��� �Է¹޴� ���α׷��� ����� ������
	(�ٸ� Ÿ���� ���� �ԷµǾ ����������� �ʾƾ� �մϴ�.)
*/
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// ��ĳ�ʿ� �߸��� �Է��� �ϸ� ��Ⱑ �����ְ� �ȴ�
		
		while (true) {
			try {
				System.out.println("���� >> ");
				int a =sc.nextInt();
				System.out.println(a);		// ���ܰ� �߻����� ������ catch��
				System.out.println("����!");	// ���� �ʰ� ������ �Է��ϸ� a ���
				break;	// ���ʷ� �����, ����� �Է��ߴٸ� break�� ���� Ż��
			} catch(InputMismatchException e) {
				System.out.println("����� �� ���ڷ� �ٽ� �Է����ּ���!");
				System.out.println("�߸� �Էµƴ� ��: " + sc.nextLine());
				// sc.nextLine�� Ÿ�� ������� �������, ��� ���� ������ �Է¹���
				// ��µɋ� ���� �Է¹��� ���� ��������
			}
		}
	}
}
