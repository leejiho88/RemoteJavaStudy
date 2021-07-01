import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class D08_String {

	public static void main(String[] args) {
		/*
		String str = new String("abcdefg");
		String str2 = "hello";
		// String�� �ν��Ͻ� �����ڰ� ��� �ν��Ͻ��� �����
		*/
		
		String fruits = "apple/banana/orange/pineapple/kiwi";
		// StringŬ������ �ν��Ͻ��� fruits�� ����ִ�
		// "apple/banana/orange/pineapple/kiwi"�� �ν��Ͻ��� �ٷ�Ե�
		
		// split(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�
		String[] splitted = fruits.split("/");
		
		for (int i = 0; i < splitted.length; ++i) {
			System.out.println(i + ": " + splitted[i]);
		}
		
		// String.join(delim, �̾���̰� ������...)
		//  - ���� ���ڿ��� ���ϴ� �����ڸ� �߰��Ͽ� �̾���δ�
		String after = String.join(", ", splitted);
		
		System.out.println(after);
		System.out.println(String.join("-", "����", "����", "�췰", "����"));
		
		printRabbitWithMessage(1, "Ŀ��", "����", "�ֽ�", "���", "�Ǹ�");
		printRabbitWithMessage(2, "����", "����");
		
		// substring(start) : ���ڿ��� start���� ���������� �ڸ���
		// substring(start, end) : ���ڿ��� start���� end�̸����� �ڸ� �ν��Ͻ��� ��ȯ
		
		String sn = "991231-1234567";
		// �ڸ� �ν��Ͻ��� ��ȯ���ش�
		String year = sn.substring(0, 2);
		String month = sn.substring(2, 4);
		String date = sn.substring(4, 6);
		
		System.out.println("year: " + year);
		System.out.println("month: " + month);
		System.out.println("date: " + date);
		
		String ph = "010-1234-1234";
		System.out.println("ph�� 1234�� ���ԵǾ� �ֳ���? " + ph.contains("1234"));
		System.out.println("ph�� 1234�� ���ԵǾ� �ֳ���? " + ph.contains("4321"));
		
		// startsWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�
		System.out.println("ph�� 010���� �����ϳ���? " + ph.startsWith("010"));
		// endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻��Ѵ�
		System.out.println("ph�� 4�� ��������? " + ph.endsWith("4"));
		
		// replace(old, new) : ���ڿ��� �ٸ� ���ڿ��� ��ü�� �ν��Ͻ��� ��ȯ�Ѵ�
		String result = ph.replace("1234", "abcd");
		System.out.println("���� : " + ph + ", ��� : " + result);
		// �� �ν��Ͻ��� ����� ��ü�� ����� �ش�. ������ �����ȴ�. 
		
		// getBytes() : ���ڿ��� byte[]�� ��ȯ�Ѵ� (������ ���� �غ�)
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("�ȳ��ϼ��� �ݰ����ϴ�".getBytes()));
		// �迭������ �ּҰ��� �ƴ� ������ ������ Arrays.toString()�� �̿�
		
		// � ��Ģ�� ����� byte[]�� ��ȯ���� ������ �� �ִ�.
		try {
			System.out.println(Arrays.toString("Hello".getBytes("UTF-8")));
			System.out.println(Arrays.toString("Hello".getBytes("UTF-16")));
			System.out.println(Arrays.toString("Hello".getBytes("EUC-KR")));
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// byte[]�� �������� �����͵��� �ٽ� ���ڿ��� ��ĥ �� �ִ�
		byte[] message = "�ȳ��ϼ��� �ݰ����ϴ�.".getBytes();
		System.out.println(new String(message));
		
		// trim() : ���ڿ� �ٱ����� ������ �������ش�
		String user_input = "\t  java \n";
		String answer = "java";
		
		System.out.println(user_input.trim().equals(answer));
		
		// toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		// toLowerCase() : ���ڿ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� �Ѻ��Ѵ�
		String text = "hello, java!!";
		System.out.println(text.toUpperCase());
		System.out.println(text.toUpperCase().toLowerCase());
		
		// indexOf(seq) : ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�
		// indexOf(seq, start) : ���� ��ġ���� ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�
		String languages = "Java, Phython, C, C++, C#, Kotlin, JavaScript";
		languages += languages;
		languages += languages;
		languages += languages;
		
		System.out.println(languages.indexOf("Java"));
		System.out.println(languages.indexOf("Java"));

		// ����: languages���� ��� "Java"��� ���ڿ��� ��� �ε����� ã�� ��
		//		������ �÷��ǿ� �����Ͽ� ����غ�����
		System.out.println(languages.length());
		/* ���� Ǭ ��
		ArrayList<Integer> java = new ArrayList<>();
		ArrayList<Integer> java1 = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			java.add(i * 45);
			java1.add(35 + (i * 45));
		}
		System.out.println(java);
		System.out.println(java1);
		*/

		ArrayList<Integer> indexes = new ArrayList<>();
		String search = "Java";
		/* �̰͵� ���
		for (int start = 0; start < languages.length();) {
			int index = languages.indexOf(search, start);

			if (index == -1) {
				break;
			}
			
			System.out.println("�̹��� ã�� : " + index);
			indexes.add(index);
			start = index + 1;
		}
		*/
		/* ���� �ٿ�����
		int start = 0;
		int found = -1;
		while ((found = languages.indexOf(search, start)) != -1) {
			// found�� ���ؼ� -1�� �ƴϸ� ����
			indexes.add(found);
			start = found + 1;
		}
		*/
		// �����̸�.. �������� ���
		int found = -1;
		while ((found = languages.indexOf(search, found + 1)) != -1) {
			// found�� ���ؼ� -1�� �ƴϸ� ����
			indexes.add(found);
		}
		
		System.out.println("ã���� : " + indexes);
	}
	// Type... : ��������, �������� ���� ������ ���ڸ� �ش� Ÿ�� �迭�� �Ѱܹ��� �� �ִ�
	// �� �������ڴ� �׻� �޼����� �������� �����ؾ� �Ѵ�
	static void printRabbitWithMessage(int abc, String... msgs) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��");
		System.out.println(Arrays.toString(msgs));
	}
}
