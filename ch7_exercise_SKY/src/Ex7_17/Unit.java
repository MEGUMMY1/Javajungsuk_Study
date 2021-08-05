package Ex7_17;

abstract public class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() { /* ���� ��ġ�� ���� */ };
}

	class Marine extends Unit { // ����
		void move(int x, int y) { /* ������ ��ġ�� �̵� */ }
		void stimPack() { /* �������� ����Ѵ�.*/}
	}
	
	class Tank extends Unit { // ��ũ
		void move(int x, int y) { /* ������ ��ġ�� �̵� */ }
		void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */}
	}
	
	class Dropship extends Unit { // ���ۼ�
		void move(int x, int y) { /* ������ ��ġ�� �̵� */ }
		void load() { /* ���õ� ����� �¿��.*/ }
		void unload() { /* ���õ� ����� ������.*/ }
	}
	
	