package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz3<T> {

	static class Fruit {}
	
	static class Apple extends Fruit {}
	static class Banana extends Fruit {}        
	static class Carrot {}
	
	public static void main(String[] args) {
		D02_JiphapQuiz3<String> jiphap = new D02_JiphapQuiz3<>();        
		// <Apple> ���׸� �ȿ� Apple�� ������ T�ڸ��� Apple�� ä����
		// ���� Apple�� ������ Fruit�� ����
		// ���׸����� �翬�� �������� �ȵ� ���� Fruit���ᵵ Fruit�� ��ӹ��� Apple�� ������
		// <?>�� �� ���� �ִ�.
		
		List<String> A = new ArrayList<>();
		Set<String> B = new HashSet<>();
                
		A.add("Americano");
		A.add("Americano");
		A.add("Cold Brew");
        A.add("Latte");
                
        B.add("Americano");
        B.add("Coke");
        B.add("Sprite");
                
        System.out.println(jiphap.union(A, B));
        System.out.println(jiphap.intersection(A, B));
        System.out.println(jiphap.diff(B, A));
                
        D02_JiphapQuiz3<Fruit> jiphap2 = new D02_JiphapQuiz3<>();
                
        List<Apple> apple_list = new ArrayList<>();
        Set<Banana> apple_set = new HashSet<>();
                
        jiphap2.union(apple_list, apple_set);
	}
	
	//<? extends T> : TŸ���� ��ӹ޴� ��� ���� ���� �� �ִ�.
	public HashSet<T> union(Collection<? extends T> A, Collection<? extends T> B) {
		HashSet<T> union = new HashSet<>();
        	
		union.addAll(A);
		union.addAll(B);
        	
		return union;
	}
        
	public HashSet<T> intersection(Collection<? extends T> A, Collection<? extends T> B) {
		HashSet<T> inter = new HashSet<>();
		
		inter.addAll(A);
		inter.retainAll(B);
                
		return inter;
	}
	
	public HashSet<T> diff(Collection<? extends T> A, Collection<? extends T> B) {
		HashSet<T> diff = new HashSet<>();

		diff.addAll(A);
		diff.removeAll(B);

		return diff;
	}
}