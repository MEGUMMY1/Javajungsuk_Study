package ch9_exercise_Ogu;

public class Ex9_05 {

	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		
		while(true) {
			pos = src.indexOf(target, pos);
			
			if(pos == -1)
				break;
			
			count++;
			pos += target.length();
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));

	}

}
