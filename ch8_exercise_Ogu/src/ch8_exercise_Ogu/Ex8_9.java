package ch8_exercise_Ogu;
// ����� ���� ���� Ŭ����

class UnsupportedFuctionException extends RuntimeException{
	// ���� �ڵ� ���� �����ϱ� ���� �ʵ带 �߰�
	private final int ERR_CODE;
	UnsupportedFuctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFuctionException(String msg) { // ������
		this(msg, 100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "[" + getErrCode() + "]" + super.getMessage();
	}
}

public class Ex8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.",100); 
	}

}
