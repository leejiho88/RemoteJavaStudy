
public class exAppleMango {

	int ace_count;
	
	public exAppleMango() {
		ace_count = 10;
	}
	
	public void action() {
		while(ace_count-- > 0) {
			System.out.println(ace_count);
		}
	}
	
	public static void main(String[] args) {
		exAppleMango am = new exAppleMango();
		
		am.action();
		am.action();
		am.action();
	}
}
