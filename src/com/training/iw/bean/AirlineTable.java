package com.training.iw.bean;

import java.util.ArrayList;

public class AirlineTable {
	private ArrayList<Airline> list;
	
	public AirlineTable(){}
	
	public AirlineTable(ArrayList<Airline> list) {
		this.list = list;
	}

	public ArrayList<Airline> getList() {
		return list;
	}

	public void setList(ArrayList<Airline> list) {
		this.list = list;
	}


	
}
