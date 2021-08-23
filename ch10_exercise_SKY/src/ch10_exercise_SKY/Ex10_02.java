package ch10_exercise_SKY;

import java.util.*;
import java.text.*;

public class Ex10_02 {

	static int paycheckCount(Calendar from, Calendar to) {
		System.out.println(from.equals(to));
		//1. from �Ǵ� to�� null�̸� 0�� ��ȯ�Ѵ�.
		if(from == null || to == null)
			return 0;
		
		//2. from�� to�� ���� ��¥�� 21���̸� 1�� ��ȯ�Ѵ�.
		if(from.equals(to) && from.get(Calendar.DAY_OF_MONTH)==21)
			return 1;
		
		//3. to�� from�� �� ���� �������� ����ؼ� ���� monDiff�� ��´�.
		int monDiff;
		if(to.get(Calendar.YEAR)>=from.get(Calendar.YEAR)) {
			monDiff = (to.get(Calendar.YEAR) - from.get(Calendar.YEAR))*12
					+to.get(Calendar.MONTH) - from.get(Calendar.MONTH);
		}
		else 
			monDiff = -1;
		
		
		//4. monDiff�� �����̸� 0�� ��ȯ�Ѵ�.
		if(monDiff <0)
			return 0;
		
		//5. ���� from�� ��(DAY_OF_MONTH)�� 21���̰ų� �����̰� to�� ��(DAY_OF_MONTH)�� 21���̰ų� �����̸� monDiff�� ���� 1 ������Ų��.
		if(from.get(Calendar.DAY_OF_MONTH)<=21 && to.get(Calendar.DAY_OF_MONTH)>=21)
			monDiff++;
		
		//6. ���� from�� ��(DAY_OF_MONTH)�� 21�� ���İ� to�� ��(DAY_OF_MONTH)�� 21�� �����̸� monDiff�� ���� 1 ���ҽ�Ų��.
		if(from.get(Calendar.DAY_OF_MONTH) >21 && to.get(Calendar.DAY_OF_MONTH) <21)
			monDiff--;
		
		
		return monDiff;

	}
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(sdf.format(fromDate)+" ~ " +sdf.format(toDate)+":");
		System.out.println(paycheckCount(from, to));
	}
	
	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2010,0,1);
		toCal.set(2010,0,1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,21);
		toCal.set(2010,0,21);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,1);
		toCal.set(2010,2,1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,1);
		toCal.set(2010,2,23);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,23);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
		
		fromCal.set(2011,0,22);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
	}
}
// equals ���� 