import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D03_Collections {
/*
	# Collections Ŭ����
	
	 - �÷����� ���ϰ� �ٷ� �� �ִ� �پ��� ��ɵ��� ���ִ� Ŭ����
	 
	 Collection - Set (HashSet, LinkedHashSet, TreeSet)
	 			- List (ArrayList, Vector, LinkedList)
	 			- Queue (PriorityQueue)
	 
	 Map - SortedMap(TreeMap)
	 	 - Hashtable
	 	 - LinkedHashMap
	 	 - HashMap
*/
	public static void main(String[] args) {
		
		ArrayList<String> foods = new ArrayList<>();
		
		foods.add("�ܹ���");
		foods.add("���");
		foods.add("���θ�");
		foods.add("û����");
		foods.add("����ư�");
		foods.add("¥���");
		
		System.out.println(foods);
		
		// String Ÿ�Ե� ũ�Ⱑ �ִ�.
		// �ѱ��� ������ ������, �����ڵ� ������ ���Ѵ�
		System.out.println("max foods: " + Collections.max(foods));
		System.out.println("min foods: " + Collections.min(foods));
		
		// ����
		Collections.sort(foods);
		System.out.println("������� ����: " + foods);
		
		int[] arr = {1, 7, 3, 5, 13, 1};
		Arrays.sort(arr);
		
		System.out.println(arr); // �ּҰ��� ����
		System.out.println(Arrays.toString(arr));
		
		// �ڼ���
		Collections.shuffle(foods);
		System.out.println("�ڼ���: " + foods);
		
		// Collections�� �ѹ��� ������ �߰��ϱ�
		// add�� ���Ƽ� ���� �ȴ�? �̰� �����
		Collections.addAll(foods, "����Ƣ��", "ġ�ƽ", "ġŲ�ʰ�", "��¡��Ƣ��", "����Ƣ��");
		System.out.println(foods);
		
		foods.add("ġŲ�ʰ�");
		foods.add("ġŲ�ʰ�");
		foods.add("ġŲ�ʰ�");
		
		// �ش� ���� �� �� ����ִ����� ���� �˻��� �� �ִ�.
		System.out.println(Collections.frequency(foods, "ġŲ�ʰ�"));
		
		// �÷����� �����´�
		Collections.reverse(foods);
		System.out.println(foods);
		
		// �÷��� ���� �� ���� ��ġ�� ��ȯ�Ѵ�
		Collections.swap(foods, 0, 8);
		System.out.println(foods);
		
		// ���������� 5ĭ �̵�
		Collections.rotate(foods, 5);
		System.out.println(foods);
		
		// �������� 10ĭ �̵�
		Collections.rotate(foods, -10);
		System.out.println(foods);
	}
}
