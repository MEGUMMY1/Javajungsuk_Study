package Ex6_04;

public class Ex6_04 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
	}
}

	class Student {
	String name;
	int ban,no,kor,eng,math;
	
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return Math.round(10*getTotal()/(float)3)/(float)10;
	}
}
	