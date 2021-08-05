
public class ch07_19 {

	public static void main(String[] args) {
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
	int i = 0; // Product cart index �迭 �� ����
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� "+p+"�� �� �� �����ϴ�.");
			return;
		}
			
		money-=p.price;
		add(p);
	}
	void add(Product p) {
		if(i>=cart.length) {
			Product[] newcart=new Product[cart.length*2];
			for(int j=0;j<cart.length;j++) {
				newcart[j]=cart[j];
			}
			newcart=cart;
		}
		cart[i++]=p;
	} 
	void summary() {
		String list="";
		int sum=0;
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null)
				break;
			list+=cart[i]+", ";
			sum+=cart[i].price;
		}
		System.out.println("������ ����:"+list);
		System.out.println("����� �ݾ�:"+sum);
		System.out.println("���� �ݾ�:"+money);
	}
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


