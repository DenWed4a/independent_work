package com.training.iw.logic;

import com.training.iw.util.Time;

public class TimeLogic {
	
	public static Time setTime(int hour, int minutes) {
		Time time = new Time(hour, minutes);
		
		if (time.getMinutes() > 60) {
			time.setMinutes(time.getMinutes() - 60);
			time.setHour(time.getHour() + 1);
		}
		
		if (time.getHour() == 24) {
			time.setHour(0);
		} else if (time.getHour() > 24) {
			time.setHour(time.getHour() - 24);
		}
		return time;
	}
}
