
public class ch04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 answer . ������ ������ ���� �� �� �����Ѵ�
		int answer =(int)(Math.random()*100)+1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� �������� ����
		// Scanner ȭ������ ���� ������Է��� �ޱ� ���ؼ� Ŭ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
		count++;
		System.out.print("1�� 100 ������ ���� �Է��ϼ��� :"); 
		input = s.nextInt(); // input . �Է¹��� ���� ���� �� �����Ѵ�
		if(input==answer) {
			System.out.println("������ϴ�.");
			System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
			break;
		}
		else if(input>=answer)
			System.out.println("�� ���� ���� �Է��ϼ���.");
		else if(input<=answer)
			System.out.println("�� ū ���� �Է��ϼ���.");
		} while(true); // ���ѹݺ���
	}

}
