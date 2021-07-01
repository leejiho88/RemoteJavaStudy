package myobj.Item;
/*
이 클래스를 상속받은 3가지 아이템을 만들어보세요
※ 단 Item 클래스는 수정하지 말 것
*/
abstract public class Item {

String name;
int price;

public Item(String name, int price) {
	this.name = name;
	this.price = price;
}

final public void info() { // 상속을 받더라도 오버라이드 하지말라고 final을 붙임
	System.out.println("이름 : " + name);
	System.out.println("가격 : " + price + "원");
}

abstract public void use();
}