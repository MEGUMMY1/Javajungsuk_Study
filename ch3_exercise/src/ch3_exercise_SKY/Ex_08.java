package ch3_exercise_SKY;

public class Ex_08 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); // byte ǥ��
		char ch = 'A';
		ch = (char)(ch + 2); // char ǥ��
		float f = (float)3 / 2; // float ǥ��
		long l = 3000l * 3000 * 3000; // l ǥ��
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2; // float ǥ��
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}

}
