package myobj.Item;
/*
�� Ŭ������ ��ӹ��� 3���� �������� ��������
�� �� Item Ŭ������ �������� �� ��
*/
abstract public class Item {

String name;
int price;

public Item(String name, int price) {
	this.name = name;
	this.price = price;
}

final public void info() { // ����� �޴��� �������̵� ��������� final�� ����
	System.out.println("�̸� : " + name);
	System.out.println("���� : " + price + "��");
}

abstract public void use();
}