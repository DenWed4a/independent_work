package com.training.iw.main;

import java.util.ArrayList;

import com.training.iw.bean.Airline;
import com.training.iw.bean.AirlineTable;
import com.training.iw.logic.*;
import com.training.iw.util.Time;
import com.training.iw.view.AirlineView;

public class Main {

	private static ArrayList<Airline> lines = null;

	static {
		lines = new ArrayList<Airline>();
		lines.add(new Airline("Minsk", 1421, "Boeng 747", "Monday", TimeLogic.setTime(23, 70)));
		lines.add(new Airline("Moscow", 78921, "Boeng 747", "Tuesday", TimeLogic.setTime(15, 00)));
		lines.add(new Airline("Minsk", 11356, "Boeng 747", "Sunday", TimeLogic.setTime(10, 30)));
		lines.add(new Airline("Riga", 1998, "Boeng 747", "Friday", TimeLogic.setTime(9, 10)));
		lines.add(new Airline("Tallin", 1455, "Boeng 747", "Suterday", TimeLogic.setTime(10, 14)));
		lines.add(new Airline("Kiev", 1478, "Boeng 747", "Thurthday", TimeLogic.setTime(23, 00)));
		lines.add(new Airline("Warshava", 1487, "Boeng 747", "Monday", TimeLogic.setTime(8, 59)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirlineTable table = new AirlineTable(lines);

		AirlineView.print(table, "Minsk");

		AirlineView.printByDay(table, "Sunday");

		AirlineView.print(table, "Friday", new Time(9, 00));

	}

}
