package quiz;

public class D04_IsJavaVariable {
/*
	����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �ڹ��� �����ν� ���� �� �ִ���
	�˻��ϴ� �޼��带 ����� �׽�Ʈ�غ�����
*/
	public static void main(String[] args) {
		String str = "JAva123";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check("String".toCharArray()));
		
		System.out.println(check("int".toCharArray()));
		
		System.out.println(check("java123".toCharArray()));
	}
	
	public static boolean check(char[] str) {
		// Charcter.isJavaIdentifierStart : �ڹ� �������� ù ��° ���ڷ� �������� üũ
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		// Character.isJavaIdentifierPart : �ڹ� �������� ������ �κ����� �������� üũ
		for (int i = 1; i < str.length; ++i) {
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}
}
