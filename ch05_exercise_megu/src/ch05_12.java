import java.util.Scanner;

public class ch05_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]words= {
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
		};
		Scanner scanner = new Scanner(System.in);
		int count=0;
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s�� ����?",i+1,words[i][0]);
			
			String tmp=scanner.nextLine();
			
			
			if(tmp.equals(words[i][1])) {
				count++;
				System.out.printf("�����Դϴ�.%n%n");
			}else System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n",words[i][1]);
		}
		System.out.printf("��ü "+words.length+"���� �� %d���� ���߼̽��ϴ�.%n", count);
}
}
