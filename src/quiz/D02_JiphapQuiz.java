package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz<T> {
/*
	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
	
		[1, 2, 3, 4] 합집합 [3, 4, 5]  =>  [1, 2, 3, 4, 5]
	
	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하느 메서드
	
		[1, 2, 3, 4] 교집합 [3, 4, 5]  =>  [3, 4]
	
	3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	
			[1, 2, 3, 4] - [3, 4, 5] => [1, 2]
			
			[3, 4, 5] - [1, 2, 3, 4] => [5]
	
	를 만들고 테스트 해보세요
*/	
	public static void main(String[] args) {
		D02_JiphapQuiz<Integer> jiphap = new D02_JiphapQuiz<>();
		// <Apple> 제네릭 안에 Apple를 넣으면 T자리에 Apple로 채워짐
		// 따라서 Apple를 넣으면 Fruit은 못들어감
		// 제네릭에는 당연한 업셋팅이 안됨 따라서 Fruit을써도 Fruit을 상속받은 Apple도 못들어간다
		// <?>는 다 들어갈수 있다.
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

	// <Integer>를 뺴면 모든 타입이 대응 가능
	// 모든 타입이 들어갈수 있는 대신에 Object타입이 된다
	// 나올떄 자기 타입을 찾아야 해서 제네릭이 생김
	// 제네릭에 T를 넣으면 모든 타입에 대응 가능, T는 인스턴스가 생길때 결정이 된다
	// static은 인스턴스가 존재하지 않아도 static을 사용할 수 있다

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