package ch7_exercise_Ogu;

class Outer2 {
	static class Inner {   // static -> �ܺ�Ŭ������ �ν��Ͻ��� �������� �ʾƵ� ��
		int iv=200;
}
}

public class Ex7_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2.Inner inner = new Outer2.Inner();
		System.out.println(inner.iv);
	}

}
