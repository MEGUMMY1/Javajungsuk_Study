package ch4_exercise_SKY;

public class Ex_13 {

	public static void main(String[] args) {
		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ�
		// �ϳ��� �о �˻��Ѵ�.
		for(int i=0; i < value.length() ;i++) {
			int tmp= value.charAt(i)-'0';
			if(tmp<=0 || tmp >=9) {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
		} else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
		}
	}
}
