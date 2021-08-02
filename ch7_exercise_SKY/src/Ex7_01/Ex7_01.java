package Ex7_01;

	class SutdaDeck {
		final int CARD_NUM = 20;
		SutdaCard[] cards = new SutdaCard[CARD_NUM];
		SutdaDeck() {
			for(int i=0;i<CARD_NUM; i++) {
				if((i==0 || i==2 || i==7) && i<CARD_NUM/2)  //  ���̸鼭 �迭�� �ε����� 10�� ���� �ʴ� ���
					cards[i] = new SutdaCard(i+1,true);
				
				else if(i<CARD_NUM/2) // ���� �ƴϸ鼭 �迭�� �ε����� 10�� ���� �ʴ� ���
					cards[i] = new SutdaCard(i+1,false);
				
				else  // ���� �ƴϸ鼭 �迭�� �ε����� 10�� �Ѵ� ���
					cards[i] = new SutdaCard(i-9,false);

			}				
		}
	}

	class SutdaCard {
		int num;
		boolean isKwang;
		SutdaCard() { this(1, true); }
		SutdaCard(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		}
	
		// info()��� ObjectŬ������ toString()�� �������̵��ߴ�.
		public String toString() {
			return num + ( isKwang ? "K":"");
		}
	}

public class Ex7_01 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i < deck.cards.length;i++)
		System.out.print(deck.cards[i]+",");
		}
}
