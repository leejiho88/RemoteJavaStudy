
public class B13_Array3 {
	// ��ü �迭�� �ʱ�ȭ (Array of Objects)
	
	public static void main(String[] args) {

		// ���̰� 8�� Car ��ü�迭 ����
		// �� �迭���� ���� NULL���� ����
		B13_Array3[] arrays = new B13_Array3[8];
	
		// �迭���� CarŬ������ �ʱ�ȭ������� �Ѵ�.
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = new B13_Array3();
		}
	
		System.out.println(arrays[1]);
	}
}