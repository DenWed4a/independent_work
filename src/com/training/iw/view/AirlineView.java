package com.training.iw.view;

import java.util.ArrayList;

import com.training.iw.bean.Airline;
import com.training.iw.bean.AirlineTable;
import com.training.iw.logic.AirlineLogic;
import com.training.iw.util.Time;

public class AirlineView {

	public static void print(AirlineTable table, String destination) {

		ArrayList<Airline> list = AirlineLogic.sortByDestination(table, destination);
		for (Airline element : list) {
			System.out.println(element);
		}
	}

	public static void printByDay(AirlineTable table, String day) {

		ArrayList<Airline> list = AirlineLogic.sortByDay(table, day);
		for (Airline element : list) {
			System.out.println(element);
		}
	}
	
	
	public static void print(AirlineTable  table, String day, Time time) {
			
			ArrayList<Airline> list =  AirlineLogic.sortByDayTime(table, day, time);
			for(Airline element : list) {
				System.out.println(element);
			}
		}
}
