package ch7_exercise_Ogu;

abstract class Unit {  // �߻�Ŭ����
	int x, y;
	void move(int x, int y) {};  // �߻�޼���� �ϸ� �ؿ� ���� �����Ƽ�  �н�
	void stop() {}
}

class Marine extends Unit{ // ����
	void stimPack() { } 
}

class Tank extends Unit{ // ��ũ
	void changeMode() {} 
}

class Dropship extends Unit{ // ���ۼ�
	void load() {  } 
	void unload() {  } 
}


public class Ex7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
