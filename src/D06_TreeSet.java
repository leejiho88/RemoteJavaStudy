import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.Student;

public class D06_TreeSet {
/*
	# TreeSet
	
	 - ������ �ִ� Set (������ ���� ���� Hash�� Ư¡)
	 - �ߺ��� ������� �ʴ´� (Set�� Ư¡)
	 - �����͸� �߰��� �� ���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
	 - �̸� ������ �Ǿ� �ֱ� ������ ���ĵ� ������ ���� ������ ���� Set�̴� (ó�� Set�� �����͸� �߰��� �� ���� �����ؼ� �ִ´�)
	 - �ش� TreeSet �ν��Ͻ����� ����� Comparator�� ������ �� �ִ�
*/
	
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		
		System.out.println(numbers);
		
		// �͸� ���� Ŭ����
		// TreeSet�� ���ϴ� Comparator�� ����ϱ� (���� ��������)
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				/*
					�ڸ��� �ٲٰ� �ʹٸ� ��� ����
					�ڸ��� �ٲٱ� ������ ���� ����
					�� ���� ���� ���̸� 0 ����
				*/
				return o2 - o1;
			}
		});
		
		numbers2.addAll(numbers);
		
		System.out.println(numbers2);
		
		// * TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);
		
		// �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ�Ѵ�
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		System.out.println("first? " + numbers.first());
		System.out.println("last? " + numbers.last());
		System.out.println("pollFirst? " + numbers.pollFirst());
		System.out.println(numbers);
		System.out.println("pollLast? " + numbers.pollLast());
		System.out.println(numbers);
		// subSet �κ�����
		System.out.println("subSet(30, 70)? " + numbers.subSet(30, 70));
		
		System.out.println(numbers.comparator());
		System.out.println(numbers2.comparator());
		
		TreeSet<Integer> number3 = new TreeSet<>(numbers2.comparator());
		
//		Collections.sort(new ArrayList<>(numbers), numbers2.comparator());
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list, numbers2.comparator());
		
		System.out.println("list: " + list);
		
		System.out.println("contains 41? " + numbers2.contains(42));
		System.out.println("contains 42? " + list.contains(42));
		
		List<Integer> list2 = new ArrayList<>();
		
		// �Ʒ��� �ڵ尡 true�� �������� null�� �ٸ� ������ �ٲ㺸���� (3���� �̻�)
//		System.out.println(list.containsAll(null));
		System.out.println(list.contains(numbers2.subSet(43, 41)));
		System.out.println(list.contains(list2));
		System.out.println(list.contains(list));
		
	}
}
