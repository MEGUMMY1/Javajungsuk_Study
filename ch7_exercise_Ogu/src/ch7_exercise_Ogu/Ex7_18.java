package ch7_exercise_Ogu;



public class Ex7_18 {
	public static void action(Robot robot) {
		if(robot instanceof DanceRobot)
			((DanceRobot)robot).dance();
		if(robot instanceof SingRobot)
			((SingRobot)robot).sing();
		if(robot instanceof DrawRobot)
			((DrawRobot)robot).draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i< arr.length;i++)
			action(arr[i]);
	}

}


class Robot {}
class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ� ."); 
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ� ."); 
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ� ."); 
	}
}