
package ch5_exercise_SKY;

import java.util.*;
public class Ex5_12 {
	
	public static void main(String[] args) {
		String [][] words = {
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer","����"}
		};
		
		Scanner scanner = new Scanner(System.in);
		int count=0;
		
		for(int i=0;i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1,words[i][0]);
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n");
				count++;
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n",words[i][1]);
			}
		}
		System.out.printf("��ü %d���� �� %d ���� ���߼̽��ϴ�.%n%n",words.length,count);
	}
}
