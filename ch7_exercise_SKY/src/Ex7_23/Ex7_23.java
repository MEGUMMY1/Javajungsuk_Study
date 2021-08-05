package Ex7_23;

public class Ex7_23 {
	
	static double sumArea(Shape[] arr) {
		double total = 0;
		for(int i=0;i<arr.length;i++) {
			total+=arr[i].calcArea();
		}
		return total;
	}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("������ ��:"+sumArea(arr));
	}
}

class Point {
	int x;
	int y;
	Point() {
		this(0,0);	
	}

	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

abstract class Shape {
	Point p;
	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}



class Circle extends Shape {
	double r;
	final double PI = 3.14;
	
	
	Circle(){
		super(new Point(0,0));
		this.r=1;
	}
	Circle(double r){
		super(new Point(0,0));
		this.r=r;
	}
	Circle(Point p, Double r){
		super.p=p;
		this.r=r;
	}
	
	double calcArea() {
		return r*r*PI;
	}
}


class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(){
		super(new Point(0,0));
		this.width=1;
		this.height=1;
	}
	Rectangle(double width,double height){
		super(new Point(0,0));
		this.width=width;
		this.height=height;
	}
	Rectangle(Point p, double width,double height){
		super.p=p;
		this.width=width;
		this.height=height;
	}
	
	 double calcArea() {
		return width*height;
	}
	
	boolean isSquare() {
		return (width==height) ? true : false;
	}
}
