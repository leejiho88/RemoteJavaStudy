
public class C12_InnerClass {
/*
	# Ŭ���� ���ο� Ŭ���� ����ϱ�
	
	 - Ŭ���� ���ο��� Ŭ������ �����ϰ� ����� �� �ִ�
	 - Ŭ���� ���ο� �����ϴ� Ŭ������ �ٱ��� Ŭ������ �ν��Ͻ��� �����ؾ� ����� �� �ִ�
	 - static Ŭ������ �����ϸ� �ν��Ͻ��� ��� ����� �� �ִ�
*/
	public static void main(String[] args) {
		// ���� �ν��Ͻ� Ŭ������ �ν��Ͻ� ����
		MintChocoLatte drink = new MintChocoLatte(true);
		MintChocoLatte drink2 = new MintChocoLatte(false);
		
		drink.new Chocolate();
		drink2.new Chocolate();
		
		// ���� ����ƽ Ŭ������ �ν��Ͻ� ����
		MintChocoLatte.Mint mint = new MintChocoLatte.Mint();
	}
}

class MintChocoLatte{
	
	boolean hot;
	
	public MintChocoLatte(boolean isHot) {
		hot = isHot;
	}
	/**
		������ Ŭ������ MintChocoLatte�� �ν��Ͻ��� �����ؾ� �Բ� �����Ǵ� ���赵�̴�.
		���ο��� MintChocoLatte�� �ν��Ͻ� ������ ������ �޴� Ŭ������ ������ �� �ִ�.
	 */
	
	// ������ Ŭ������ MintChocoLatte�� �ν��Ͻ��� �����ؾ� �Բ� �����Ǵ� ���赵�̴�.
	class Chocolate {
		String msg;
		
		public Chocolate() {
			if (hot) {
				System.out.println("���ݸ��� �� ��ҽ��ϴ�");
			} else {
				System.out.println("���ݸ��� �� �ȳ���ϴ�.");
			}
		}
	}
	
	/**
		���ο� �ν��Ͻ��� ������ ���� �ʴ� static Ŭ������ �����ϴ� �͵� �����ϴ�.
	 */
	static class Mint{
		public Mint() {
			System.out.println("��Ʈ�� �µ��� ������ �����ʰ� ġ����� ���ϴ�");
		}
	}
}
