
public class ClassA {

	public int plus(int a, int b) {
		return a + b;
	}
	
<<<<<<< HEAD
	public float pluss(int a, int b) {
		return a + b;
=======
	public int  minus(int a, int... b) {
		for (int c : b) {
			a -= c;
		}
		
		return a;
>>>>>>> refs/heads/branchB
	}
}
