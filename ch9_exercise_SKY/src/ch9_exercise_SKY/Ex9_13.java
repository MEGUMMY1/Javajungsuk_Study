package ch9_exercise_SKY;

public class Ex9_13 {
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa�� " + stringCount(src, "aa") +"�� ã�ҽ��ϴ�.");
		}
		
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
		}
		
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if (key == null || key.length() == 0)
			return 0;
		
		while(true) {
			index = src.indexOf(key,pos);
			if(index==-1) {
				break;
			}
			else {
				count++;
				pos= index+ key.length();
			}
		}

		return count;
	}
}
// 5���� ����