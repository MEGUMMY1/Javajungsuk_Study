package ch10_exercise_SKY;

import java.util.*;
import java.text.*;

public class Ex10_01 {

	public static void main(String[] args) {
		
		Calendar start = Calendar.getInstance();
		start.set(2010,0,1); 
		
		Calendar end = Calendar.getInstance();
		end.set(2011,0,1); 
		end.add(Calendar.DATE, -1);
		
		int END_DAY = end.get(Calendar.DAY_OF_YEAR); // ���� �⵵�� �� �� �Ϸ� �̷�����ִ��� �ľ� (������ ��� ���)		
				
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.");
		
		for(int i=0;i<END_DAY;i++,start.add(Calendar.DATE,1)) {
			Date sday = start.getTime();
			if(start.get(Calendar.DAY_OF_WEEK) ==1 && start.get(Calendar.DAY_OF_WEEK_IN_MONTH) ==2)
				System.out.println(sdf.format(sday));
		}
	}
}

//check
