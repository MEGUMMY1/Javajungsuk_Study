package ch6_exercise_Ogu;

public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "ȫ�浿"; 
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("�̸� :"+s.name); 
		System.out.println("���� :"+s.getTotal()); 
		System.out.println("��� :"+s.getAverage());
	}

}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return Math.round(getTotal()*10f/3f)/10f;
	}
}