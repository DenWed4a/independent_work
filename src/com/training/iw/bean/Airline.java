package com.training.iw.bean;

import com.training.iw.util.Time;

public class Airline {
	private String destination;
	private int flight;
	private String planeType;
	private String day;
	private Time time;

	public Airline(String destination, int flight, String planeType, String day, Time time) {

		this.destination = destination;
		this.flight = flight;
		this.planeType = planeType;
		this.day = day;
		this.time = time;
	}

	public String getDestination() {
		return destination;
	}

	public int getFlight() {
		return flight;
	}

	public String getPlaneType() {
		return planeType;
	}

	public String getDay() {
		return day;
	}

	public Time getTime() {
		return time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flight;
		result = prime * result + ((planeType == null) ? 0 : planeType.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flight != other.flight)
			return false;
		if (planeType == null) {
			if (other.planeType != null)
				return false;
		} else if (!planeType.equals(other.planeType))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [Destination - " + destination + ", flight number - " + flight + ", plane type - " + planeType
				+ ", day - " + day + ", time - " + time + "]";
	}

}
