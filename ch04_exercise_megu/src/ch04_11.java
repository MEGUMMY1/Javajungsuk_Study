
public class ch04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibonnaci 1, 1 . ������ ������ ù �� ���ڸ� �� �Ѵ�
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // ����° ��
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ ) {
			num3=num1+num2;
			System.out.print(","+num3);
			num1=num2;
			num2=num3;
		}

	}

}