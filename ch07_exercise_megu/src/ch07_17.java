class Unit {
	int x, y; // ���� ��ġ
	void move(int x, int y) {}
	void stop() {}
}

class Marine extends Unit { // ����
	void stimPack() {}
}
class Tank extends Unit { // ��ũ
	void changeMode() {}
}
class Dropship extends Unit { // ���ۼ�
	void load() {}
	void unload() {}
}

public class ch07_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
