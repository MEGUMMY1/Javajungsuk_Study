import java.util.*;

public class ch09_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = 0;
		int last = 0;
		
	
		while(true) {
		start = s.nextInt();
		last = s.nextInt();
		
		if(start==0 || last==0)
			System.out.println("���� �ܰ� �� ��, �ΰ��� ������ �Է��ϼ���.");
		
		else if(start<=2 || start>=9 || last<=2 || last>=9)
			System.out.println("���� ������ 2�� 9������ ���̾�� �մϴ�");
		
		else {
			System.out.println("USAGE : GugudanTest "+start+" "+last);
				
			
			for(int i=start; i<=last; i++) {
				for(int j=1; j<10; j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
				System.out.println();
			}
			break;
		}
		}
		
	}

}
