package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class D07_PhoneBook2 {

   public static class Info implements Comparable<Info>{
      // 내용은 양심껏
      String name;
      String address;
      
      @Override
      public int compareTo(Info o) {
         return this.name.compareTo(o.name) != 0 ? this.name.compareTo(o.name) : this.address.compareTo(o.address);
      }
      @Override
      public String toString() {
         return String.format("이름: %s, 주소: %s\n", name, address);
      }
   }
   
   HashMap<String, HashMap<String, Info>> phonebook;
   
   public D07_PhoneBook2() {
      phonebook = new HashMap<>();
   }
   
   // 1. 새로운 그룹을 추가하는 메서드
   void addGroup(String group) {
      phonebook.put(group, new HashMap<>());
   }
   
   // 2. 그룹에 새로운 전화번호를 등록하는 메서드
   void addNumber(String group, String phone, String name, String address) {
      Info info = new Info();
      info.address = address;
      info.name = name;
      
      HashMap<String, Info> infos = phonebook.get(group);
      infos.put(phone, info);
      phonebook.put(group, infos);
   }
   
   // 3. 등록된 모든 번호를 선택한 항목(Info) 기준으로 오름/내림차순으로 보여주는 메서드
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
   
   // 4. 이름의 일부를 입력하면 일치하는 모든 정보가 검색되는 메서드
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
   
   // 5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
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
         System.out.println("원하는 항목을 골라주세요. (1. 그룹 등록 2. 번호 등록 3. 이름 검색 4. 번호 검색 5. 전체 출력 6. 나가기)");
         input = sc.nextInt();
         if (input == 1) {
            System.out.println("추가하시려는 그룹명을 입력하세요.");
            group = sc.next();
            if (pb.phonebook.containsKey(group)) {
               System.out.println("이미 존재하는 그룹이에요.");
            } else {
               pb.addGroup(group);
            }
            
         } else if (input == 2) {
            System.out.println("등록하시려는 그룹을 입력하세요.");
            group = sc.next();
            if (!pb.phonebook.containsKey(group)) {
               System.out.println("존재하지 않는 그룹이에요.");
            } else {
               System.out.println("등록하시려는 번호를 입력하세요.");
               phone = sc.next();
               System.out.println("이름을 입력하세요.");
               name = sc.next();
               System.out.println("주소를 입력하세요.");
               address = sc.next();
               pb.addNumber(group, phone, name, address);
            }
         } else if (input == 3) {
            System.out.println("검색어를 입력하세요.");
            name = sc.next();
            pb.searchByName(name);
         } else if (input == 4) {
            System.out.println("검색어를 입력하세요.");
            phone = sc.next();
            pb.searchByNum(phone);
         } else if (input == 5) {
            System.out.println("기준을 선택해주세요. (1. 이름/2. 주소)");
            input = sc.nextInt();
            if (input == 1) {
               pb.showAllNumber(true);
            } else if (input == 2) {
               pb.showAllNumber(false);
            } else {
               System.out.println("그런 기준 없어요.");
            }
         } else if (input == 6) {
            System.out.println("이용해 주셔서 감사합니다.");
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