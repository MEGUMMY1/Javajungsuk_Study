import java.util.*;
public class ch05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray(); // String char[] �� �� ��ȯ
			for(int j=0; j<words.length;j++) {
				int temp1; char temp2;
				temp1=(int)(Math.random()*question.length);
				temp2=question[j];
				question[j]=question[temp1];
				question[temp1]=temp2;
			}
			
			System.out.printf("Q%d. %s �� ������ �Է��ϼ���.>",
					i+1, new String(question));
			
			String answer = scanner.nextLine();
			// trim() answer , equals word[i] ���� �� �¿� ������ ������ �� �� �� ��
			if(words[i].equals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ�.%n%n"); 
			else
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
		}
	}

}