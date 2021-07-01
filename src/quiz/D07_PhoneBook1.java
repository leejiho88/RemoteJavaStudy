package quiz;

import java.util.ArrayList;
import java.util.HashMap;

public class D07_PhoneBook1 {

	public static class Info {
		// ������ ��ɲ�
		String name;
		String location;
	}
	
	HashMap<String, HashMap<String, Info>> phonebook;
	
	public D07_PhoneBook1() {
		phonebook = new HashMap<>();
	}
	/*
		# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
		
		 1. phonebook���� �׷�/��ȭ��ȣ/�̸��� ������ �� �ִ�
		 2. �׷���� Ű������ ������ �ش� �׷쿡 �ش��ϴ� HashMap�� ���� �� �ִ�
		 3. ���� HashMap�� ��ȭ��ȣ�� ������ �̸��� ���� �� �ִ�
		
		# �����ؾ� �� �޼���
		
		 1. ���ο� �׷��� �߰��ϴ� �޼���
		 2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
		 3. ��ϵ� ��� ��ȣ�� ������ �׸� �������� ����/������������ �����ִ� �޼���
		 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
		 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	*/
	
	// ���� ArrayList������ Object�� ���� �ٽ� ArrayList�� �ٿ� ĳ������ ����������
	// ���� ObjectŸ���� ArrayList�� Casting�� �ȵȴ٤�
	
	// 1.
	void addGroup(String group) {
		phonebook.put(group, new HashMap<>());
	}
	//2. key���� ���� value���� ����
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
			
			numList.clear(); // �������� ���� �ʱ�ȭ, �׷��� ������ �����Ǽ� ����
			for (Info i : information.values()) {
				numList.add(i);
			}
		}
	}
	// 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ �˻��Ǵ� �޼���
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
	// 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
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




