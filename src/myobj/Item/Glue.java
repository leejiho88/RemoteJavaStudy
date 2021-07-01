package myobj.Item;

public class Glue extends Item {

	public Glue() {
		super("µüÇ®", 1000);
	}
	
	@Override
	public void use() {
		System.out.println("Ç®À»");
	}

}