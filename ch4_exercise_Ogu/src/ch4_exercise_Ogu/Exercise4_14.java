package ch4_exercise_Ogu;

public class Exercise4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int computerNumber = (int)(Math.random() * 100) + 1;
	        int userNumber = 0;
	        int trial = 0;
	        while(userNumber != computerNumber){
	            System.out.println("1�� 100������ ���� �Է��ϼ���.");
	            userNumber = scanner.nextInt();
	            if(userNumber > computerNumber){
	                System.out.println("�� ���� ���� �Է��ϼ���.");
	            }else{
	                System.out.println("�� ū���� �Է��ϼ���.");
	            }
	            trial++;
	        }
	        System.out.println("������ϴ�.\n�õ�Ƚ���� " + trial + "���Դϴ�.");
	}

}
