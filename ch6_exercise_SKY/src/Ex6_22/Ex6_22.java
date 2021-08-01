package Ex6_22;

public class Ex6_22 {
	static boolean isNumber(String str) {
		if(str == null || str.equals("")) {
			return false;
		}
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) <= '0' || str.charAt(i)-'0' >= '9') {
				return false;
			}	
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
	}
}
