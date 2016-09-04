package com.yz.utils;

import java.text.ParseException;

public class TestMain {
	
	public static void main(String[] args) {
		String time1 = "2016-09-04 21:08";
		
		String time2 = "2016-09-04 21:28";
		
		
		try {
			System.out.println(DateTimeKit.minutesBetweenStr(time1, time2)>10);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
