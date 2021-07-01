package myobj.Pirate;

public class MrTong {

	boolean[] stabbed;
	boolean[] launch;
			
	public boolean launched;
				
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];

		for (int i = 0; i < 4; i++) {
			launch[(int)(Math.random() * size)] = true;
		}
	}

	public boolean stab(int index) {
		if (stabbed[index]) {
			return true;
		} else {
			stabbed[index] = true;
			launched = launch[index];
			return true;
		}
	}
		
	public boolean[] getStabbed() {
			return stabbed;
	}
}