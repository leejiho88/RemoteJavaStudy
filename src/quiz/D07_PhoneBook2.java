package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class D07_PhoneBook2 {

   public static class Info implements Comparable<Info>{
      // ������ ��ɲ�
      String name;
      String address;
      
      @Override
      public int compareTo(Info o) {
         return this.name.compareTo(o.name) != 0 ? this.name.compareTo(o.name) : this.address.compareTo(o.address);
      }
      @Override
      public String toString() {
         return String.format("�̸�: %s, �ּ�: %s\n", name, address);
      }
   }
   
   HashMap<String, HashMap<String, Info>> phonebook;
   
   public D07_PhoneBook2() {
      phonebook = new HashMap<>();
   }
   
   // 1. ���ο� �׷��� �߰��ϴ� �޼���
   void addGroup(String group) {
      phonebook.put(group, new HashMap<>());
   }
   
   // 2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
   void addNumber(String group, String phone, String name, String address) {
      Info info = new Info();
      info.address = address;
      info.name = name;
      
      HashMap<String, Info> infos = phonebook.get(group);
      infos.put(phone, info);
      phonebook.put(group, infos);
   }
   
   // 3. ��ϵ� ��� ��ȣ�� ������ �׸�(Info) �������� ����/������������ �����ִ� �޼���
   void showAllNumber(boolean byName) {
      ArrayList<Info> pbList = new ArrayList<>();
      for (String group : phonebook.keySet()) {
         HashMap<String, Info> infos = phonebook.get(group);
         System.out.println("[" + group + "]");
         pbList.clear();
         for (Info i : infos.values()) {
            pbList.add(i);
         }
         if (byName) {
            Collections.sort(pbList);
         } else {
            Collections.sort(pbList, new SortByAdd());
         }
         System.out.println(pbList);
      }
   }
   
   // 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ �˻��Ǵ� �޼���
   void searchByName(String name) {
      for (String group : phonebook.keySet()) {
         HashMap<String, Info> infos = phonebook.get(group);
         for (Info i : infos.values()) {
            if (i.name.contains(name)) {
               System.out.println(i);
            }
         }
      }
   }
   
   // 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
   void searchByNum(String name) {
      for (String group : phonebook.keySet()) {
         HashMap<String, Info> infos = phonebook.get(group);
         for (String i : infos.keySet()) {
            if (i.contains(name)) {
               System.out.println(phonebook.get(group).get(i));
            }
         }
      }
   }
   
   public static void main(String[] args) {
	   D07_PhoneBook2 pb = new D07_PhoneBook2();
      String group;
      String name;
      String address;
      String phone;
      int input;
      
      Scanner sc = new Scanner(System.in);
      
      while(true) {
         System.out.println("���ϴ� �׸��� ����ּ���. (1. �׷� ��� 2. ��ȣ ��� 3. �̸� �˻� 4. ��ȣ �˻� 5. ��ü ��� 6. ������)");
         input = sc.nextInt();
         if (input == 1) {
            System.out.println("�߰��Ͻ÷��� �׷���� �Է��ϼ���.");
            group = sc.next();
            if (pb.phonebook.containsKey(group)) {
               System.out.println("�̹� �����ϴ� �׷��̿���.");
            } else {
               pb.addGroup(group);
            }
            
         } else if (input == 2) {
            System.out.println("����Ͻ÷��� �׷��� �Է��ϼ���.");
            group = sc.next();
            if (!pb.phonebook.containsKey(group)) {
               System.out.println("�������� �ʴ� �׷��̿���.");
            } else {
               System.out.println("����Ͻ÷��� ��ȣ�� �Է��ϼ���.");
               phone = sc.next();
               System.out.println("�̸��� �Է��ϼ���.");
               name = sc.next();
               System.out.println("�ּҸ� �Է��ϼ���.");
               address = sc.next();
               pb.addNumber(group, phone, name, address);
            }
         } else if (input == 3) {
            System.out.println("�˻�� �Է��ϼ���.");
            name = sc.next();
            pb.searchByName(name);
         } else if (input == 4) {
            System.out.println("�˻�� �Է��ϼ���.");
            phone = sc.next();
            pb.searchByNum(phone);
         } else if (input == 5) {
            System.out.println("������ �������ּ���. (1. �̸�/2. �ּ�)");
            input = sc.nextInt();
            if (input == 1) {
               pb.showAllNumber(true);
            } else if (input == 2) {
               pb.showAllNumber(false);
            } else {
               System.out.println("�׷� ���� �����.");
            }
         } else if (input == 6) {
            System.out.println("�̿��� �ּż� �����մϴ�.");
            break;
         }
      }
   }
   
   class SortByAdd implements Comparator<Info>{
      @Override
      public int compare(Info o1, Info o2) {
         return o1.address.compareTo(o2.address) != 0 ? o1.address.compareTo(o2.address) : o1.name.compareTo(o2.name);
      }
   }
   
}