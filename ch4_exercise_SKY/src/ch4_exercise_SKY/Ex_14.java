package ch4_exercise_SKY;

public class Ex_14 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� �������� ����
		
		// ȭ������ ���� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
		count++;
		System.out.print("1�� 100������ ���� �Է��ϼ��� :");
		input = s.nextInt(); // �Է¹��� ���� ���� input�� �����Ѵ�.
		if(input>answer) {
			System.out.println("�� ���� ���� �Է��ϼ���.");
		}
		else if(input<answer) {
			System.out.println("�� ū ���� �Է��ϼ���.");
		}
		else { // input == answer
			System.out.println("������ϴ�.");
			System.out.print("�õ�Ƚ���� "+count+"���Դϴ�.");
			break;
		}
		} while(true); // ���ѹݺ���

	}

}
