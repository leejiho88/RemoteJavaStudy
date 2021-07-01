import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
/*
	# ����ǥ����
	
	 - ���ڿ��� ������ ǥ���� �� �ִ� ǥ����
	 - Ư�� ���α׷��� �� ���ӵ��� �ʴ´�
	 - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��Y �� �ִ�
	 
	# Java���� ����ǥ������ �ٷ� �� ����ϴ� Ŭ����
	
	 - Pattern
	 - Matcher
*/
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�ϴ��� ���θ� �˻�
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@]eep", "saeep"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdefghijkABCDEFGHIJK]", "saeeK"));
	
		/*
			[abc]	: �ش� �ڸ��� a �Ǵ� b �Ǵ� c�� ���
			[^abc]	: �ش� �ڸ��� abc�� ������ ��� ���� ���
			[a-z]	: a���� z���� ��� ���
			[A-Z]	: A���� Z���� ��� ���
			[\\-]	: ���ڷμ� -�� ��� (Escape)
			[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ���ڸ� ���(������)
		*/
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[a-e&&c-z]eep", "saeep"));
		
		/*
			# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
			
			 .	: ��� ����
			 \d	: ��� ����
			 \D	: ���ڸ� ������ ����
			 \s	: ��� ���� (\t, \n, \r, ' ')
			 \S	: ������ ������ ��� ��
			 \w	: �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
			 \W	: \w�� ������ ��� ��
		*/
		System.out.println(Pattern.matches("s.eep", "sleep"));
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));
		
		/*
			# �ش� ������ ����� ������ ������ �����ϴ� ���
			
			 [.]{n}    : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
			 [.]{n,m}  : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�
			 [.]{n,}   : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�
			 [.]?	   : ? ���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�
			 [.]+	   : + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�
			 [.]*	   : * ���� ������ 0�� �̻� ���;� �Ѵ� (�ȳ��͵� �ȴ�)
		*/
		System.out.println(Pattern.matches("[.]{5}", "....."));
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", ".abs."));
		System.out.println(Pattern.matches("[.]{2,5}", "."));
		System.out.println(Pattern.matches("[.]{2,5}", ".."));
		System.out.println(Pattern.matches("[.]{2,5}", "..."));
		System.out.println(Pattern.matches("[.]{2,5}", "...."));
		System.out.println(Pattern.matches("[.]{2,5}", "....."));
		System.out.println(Pattern.matches("[.]{2,5}", "......"));
		
		System.out.println(Pattern.matches("s?heep", "sheep"));
		System.out.println(Pattern.matches("s?heep", "sssheep")); // �������� �ȵȴ�
		System.out.println(Pattern.matches("s?heep", "heep"));
		System.out.println(Pattern.matches("s?heep", "kheep")); // ���� ���ڴ� �ȵȴ�
		
		System.out.println(Pattern.matches("s+heep", "sssssheep"));
		System.out.println(Pattern.matches("s+heep", "heep"));
		System.out.println(Pattern.matches("[-+]h", "+h"));
		// ��������: �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		
		System.out.println(Pattern.matches("010\\-[1234567890]{3,4}\\-[1234567890]{3,4}", "010-1234-1234"));
		// ���� ���� �������� �Ʒ��� �� �����ϴ�
		System.out.println(Pattern.matches("010-[0-9]{3,4}-[\\d]{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("010-?\\d{4}-?\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("010-?\\d{4}-?\\d{4}", "01012341234"));
		System.out.println(Pattern.matches("010-?[2-9]\\d{3}-?\\d{4}", "01012341234"));
		System.out.println(Pattern.matches("010(-?\\d{4}){2}", "01012341234"));
		
		// ��������: �ش� ���ڿ��� �ֹε�Ϲ�ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches(
				"\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-?[1-4]\\d{6}", "000231-1079928"));
					// �տ��� 0�̸� ���ڸ��� 1~9, ���ڸ��� 1�̸� ���ڸ��� 0~2
		
		// ��������: �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ������ ��������
		// \.	: �׳�.
		// [.]	: �׳�.
		System.out.println(Pattern.matches("\\w+@\\w+(\\.\\w+)?(\\.\\w+)?", "gcc123@gmail.com"));
		
		// # Matcher ����ؼ� �� ���ڿ� �˻��ϱ�
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		// Pattern �ν��Ͻ� ����
		Pattern pattern1 = Pattern.compile("a.{2}le");
		Pattern pattern2 = Pattern.compile("na");
		
		// pattern1�� fruit�� �˻��� ����� ��ȯ�Ѵ�
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : ã�� �͵� �߿� ���� ���� �����ϸ� true
		while (matcher.find()) {
			System.out.println("ã�� ��: " + matcher.group());
			System.out.println("��ġ: " + matcher.start() + "���� " + matcher.end() + "����");
			System.out.println(fruit.substring(matcher.start(), matcher.end()));
		}
	}
}






