package ch9_exercise_SKY;

public class Ex9_11 {

	public static void main(String[] args) {
		
			if(args.length != 2) {
				System.out.println("���� �ܰ� �� ��, �� ���� ������ �Է����ּ���.");
			}
			else {
			int start = Integer.parseInt(args[0]);
			int end = Integer.parseInt(args[1]);
			
				if(start<2 || start>9 || end <2 || end>9) {
					System.out.println("���� ������ 2�� 9������ ���̾�� �մϴ�.");
				}
				else {
					for(int i = start; i<=end; i++) {
						for(int j = 1;j <10; j++) {
							System.out.println(i+"*"+j+"="+i*j);
						}
						System.out.println();
				}
			}	
		}
	}
}
