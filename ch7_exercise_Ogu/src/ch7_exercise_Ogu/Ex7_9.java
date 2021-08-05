package ch7_exercise_Ogu;

//7_19��

public class Ex7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.buy(new Tv19());
		b.buy(new Computer());
		b.buy(new Tv19());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}

class Buyer {
	int money = 1000;
	Product_19[] cart = new Product_19[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product cart index �迭 �� ����
	void buy(Product_19 p) {
	
		if (money < p.price)
			return;
		else {
			money-=p.price;
			add(p);
		}
	}
	
	void add(Product_19 p) {
		if(i>=cart.length) {
			Product_19[] tmp = new Product_19[cart.length * 2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i++] = p;
		
	} // add(Product p)
	
		
	void summary() {
		int sum = 0;
		String list = "";
		for(int i = 0; i<this.i; i++) {
			list += cart[i] + ", ";
			sum += cart[i].price;
		}
		System.out.println("������ ���� : " + list);
		System.out.println("����� �ݾ� : "+ sum);
		System.out.println("���� �ݾ� : " + money);
	} // summary()
}

class Product_19 {
	int price; // ��ǰ�� ����
	Product_19(int price) {
		this.price = price;
	}
}

class Tv19 extends Product_19 {
	Tv19() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer extends Product_19 {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}

class Audio extends Product_19 {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}
