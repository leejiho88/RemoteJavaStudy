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
		// <Apple> 제네릭 안에 Apple를 넣으면 T자리에 Apple로 채워짐
		// 따라서 Apple를 넣으면 Fruit은 못들어감
		// 제네릭에는 당연한 업셋팅이 안됨 따라서 Fruit을써도 Fruit을 상속받은 Apple도 못들어간다
		// <?>는 다 들어갈수 있다.
		
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
	
	//<? extends T> : T타입을 상속받는 모든 것은 들어올 수 있다.
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