package quiz;

import java.util.ArrayList;
import java.util.HashMap;

public class D07_PhoneBook1 {

	public static class Info {
		// 내용을 양심껏
		String name;
		String location;
	}
	
	HashMap<String, HashMap<String, Info>> phonebook;
	
	public D07_PhoneBook1() {
		phonebook = new HashMap<>();
	}
	/*
		# HashMap을 이용해 전화번호부를 구현해보세요
		
		 1. phonebook에는 그룹/전화번호/이름을 저장할 수 있다
		 2. 그룹명을 키값으로 넣으면 해당 그룹에 해당하는 HashMap을 꺼낼 수 있다
		 3. 꺼낸 HashMap에 전화번호를 넣으면 이름을 꺼낼 수 있다
		
		# 구현해야 할 메서드
		
		 1. 새로운 그룹을 추가하는 메서드
		 2. 그룹에 새로운 전화번호를 등록하는 메서드
		 3. 등록된 모든 번호를 선택한 항목 기준으로 오름/내림차순으로 보여주는 메서드
		 4. 이름의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
		 5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
	*/
	
	// 원래 ArrayList였던게 Object로 가면 다시 ArrayList로 다운 캐스팅이 가능하지만
	// 원래 Object타입은 ArrayList로 Casting이 안된다ㅎ
	
	// 1.
	void addGroup(String group) {
		phonebook.put(group, new HashMap<>());
	}
	//2. key값을 통해 value값을 저장
	void addNumber(String group, String number, String name, String location) {
		Info info = new Info();
		info.name = name;
		info.location = location;
		
		HashMap<String, Info> information = phonebook.get(group);
		information.put(number, info);
		phonebook.put(group, information);
	}
	// 3.
	void showAllNum() {
		ArrayList<Info> numList = new ArrayList();
		for (String key : phonebook.keySet()) {
			HashMap<String, Info> information = phonebook.get(key);
			System.out.println(key);
			
			numList.clear(); // 시작전에 값을 초기화, 그렇지 않으면 누적되서 에러
			for (Info i : information.values()) {
				numList.add(i);
			}
		}
	}
	// 4. 이름의 일부를 입력하면 일치하는 모든 정보가 검색되는 메서드
	void searchByName(String name) {
		for (String group : phonebook.keySet()) {
			HashMap<String, Info> information = phonebook.get(group);
			for (Info value : information.values()) {
				if (value.name.contains(name)) {
					System.out.println(value);
				}
			}
		}
	}
	// 5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
	void searchByNum(String name) {
		for (String group : phonebook.keySet()) {
			HashMap<String, Info> information = phonebook.get(group);
			
			for (String key : information.keySet()) {
				if (key.contains(name)) {
					System.out.println(phonebook.get(group).get(key));
				}
			}
		}	
	}
}




