package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz<T> {
/*
	1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	
		[1, 2, 3, 4] ������ [3, 4, 5]  =>  [1, 2, 3, 4, 5]
	
	2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	
		[1, 2, 3, 4] ������ [3, 4, 5]  =>  [3, 4]
	
	3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	
			[1, 2, 3, 4] - [3, 4, 5] => [1, 2]
			
			[3, 4, 5] - [1, 2, 3, 4] => [5]
	
	�� ����� �׽�Ʈ �غ�����
*/	
	public static void main(String[] args) {
		D02_JiphapQuiz<Integer> jiphap = new D02_JiphapQuiz<>();
		// <Apple> ���׸� �ȿ� Apple�� ������ T�ڸ��� Apple�� ä����
		// ���� Apple�� ������ Fruit�� ����
		// ���׸����� �翬�� �������� �ȵ� ���� Fruit���ᵵ Fruit�� ��ӹ��� Apple�� ������
		// <?>�� �� ���� �ִ�.
		List<Integer> A = new ArrayList<>();
		Set<Integer> B = new HashSet<>();
                
		A.add(1);
		A.add(2);
		A.add(3);
        A.add(4);
                
        B.add(1);
        B.add(3);
        B.add(5);
		
		System.out.println(jiphap.union(A, B));
		System.out.println(jiphap.intersection(A, B));
		System.out.println(jiphap.diff(B, A));
	}

	// <Integer>�� ���� ��� Ÿ���� ���� ����
	// ��� Ÿ���� ���� �ִ� ��ſ� ObjectŸ���� �ȴ�
	// ���Ë� �ڱ� Ÿ���� ã�ƾ� �ؼ� ���׸��� ����
	// ���׸��� T�� ������ ��� Ÿ�Կ� ���� ����, T�� �ν��Ͻ��� ���涧 ������ �ȴ�
	// static�� �ν��Ͻ��� �������� �ʾƵ� static�� ����� �� �ִ�

	public static HashSet<Integer> union(Collection<Integer> A, Collection<Integer> B) {
		HashSet<Integer> union = new HashSet<>();
		
		union.addAll(A);
		union.addAll(B);
		
		return union;
	}
	
	public static HashSet<Integer> intersection(Collection<Integer> A, Collection<Integer> B){
		HashSet<Integer> inter = new HashSet<>();
		
		inter.addAll(A);
		inter.retainAll(B);
		
		return inter;
	}
	
	public static HashSet<Integer> diff(Collection<Integer> A, Collection<Integer> B){
		HashSet<Integer> diff = new HashSet<>();
		
		diff.addAll(A);
		diff.removeAll(B);
		
		return diff;
	}
}