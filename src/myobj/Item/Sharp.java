package myobj.Item;

public class Sharp extends Item {

	public Sharp() {
		super("����", 3000);
	}
	
	@Override
	public void use() {
		System.out.println("�������� ä��� ���� ���ϴ�");		
	}

}