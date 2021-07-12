package com.training.iw.logic;

import java.util.ArrayList;

import com.training.iw.bean.Airline;
import com.training.iw.bean.AirlineTable;
import com.training.iw.util.Time;

public class AirlineLogic {

	public static ArrayList<Airline> sortByDestination(AirlineTable table, String destination) {
		
		ArrayList<Airline> list = table.getList();
		ArrayList<Airline> result = new ArrayList<Airline>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDestination().equals(destination)) {
				result.add(list.get(i));
			}
		}
		return result;
	}

	public static ArrayList<Airline> sortByDay(AirlineTable table, String day) {
		
		ArrayList<Airline> list = table.getList();
		ArrayList<Airline> result = new ArrayList<Airline>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDay().equals(day)) {
				result.add(list.get(i));
			}
		}
		return result;
	}

	public static ArrayList<Airline> sortByDayTime(AirlineTable table, String day, Time time) {
		
		ArrayList<Airline> list = table.getList();
		ArrayList<Airline> result = new ArrayList<Airline>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDay().equals(day)) {
				result.add(list.get(i));
			}
		}

		for (int i = 0; i < result.size(); i++) {
			if (result.get(i).getTime().getHour() < time.getHour()) {
				result.remove(i);
			} else if (result.get(i).getTime().getHour() == time.getHour()
					&& result.get(i).getTime().getMinutes() <= time.getMinutes()) {
				result.remove(i);
			}
		}

		return result;
	}
}
