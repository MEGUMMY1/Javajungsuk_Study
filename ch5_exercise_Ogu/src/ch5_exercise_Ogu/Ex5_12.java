package ch5_exercise_Ogu;

import java.util.Scanner;

public class Ex5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				{"chair", "����"},
				{"computer", "��ǻ��"	},
				{"integer", "����"}
		};
		
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		for(int i = 0; i<words.length; i++) {
			System.out.printf("Q%d.  %S�� ����?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n");
				n++;
			}
				
			else {
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
			}
		}
		
		System.out.printf("��ü 3������ %d���� ���߼̽��ϴ�.", n);
		
	}

}
