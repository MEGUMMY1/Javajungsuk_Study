package Ex7_19;

public class Ex7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

	class Buyer {
		int money = 1000;
		Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
		int i = 0; // Product�迭 cart�� ���� index
		
		void buy(Product p) {
			if(this.money < p.price) {
				System.out.println("�ܾ��� �����Ͽ� "+p+"��/�� ��� �����ϴ�.");
				return;
			}
			else {	
			this.money -= p.price;
			add(p);
			}
	}
	
		void add(Product p) {
			if(i>=cart.length) {
				Product[] tmp = new Product[cart.length*2];
				System.arraycopy(cart, 0, tmp, 0, cart.length);
				cart = tmp;
				
			}
			cart[i]= p;
			i++;
			
	} // add(Product p)
	
		void summary() {
			int total=0;
			System.out.print("������ ���� :");
			for(int j=0;j<this.i;j++) {
				System.out.print(cart[j]+",");
				total+=cart[j].price;
			}
			System.out.println();
			System.out.println("����� �ݾ�: "+total);
			System.out.println("���� �ݾ�: "+ (this.money));

		} // summary()
	}

	class Product {
		int price; // ��ǰ�� ����
		Product(int price) {
			this.price = price;
		}
	}
	
	class Tv extends Product {
		Tv() { super(100); }
		public String toString() { return "Tv"; }
	}
	
	class Computer extends Product {
		Computer() { super(200); }
		public String toString() { return "Computer";}
	}
	
	class Audio extends Product {
		Audio() { super(50); }
		public String toString() { return "Audio"; }
	}

	// check
	
	