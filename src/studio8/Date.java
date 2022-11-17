package studio8;

import java.util.Objects;

public class Date {
	private int month; //the months 1-12
	private int day; //the days 1-31
	private int year; //year
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	private boolean holidayOrNot; //holiday or not

	public Date(int month, int day, int year, boolean holidayOrNot) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holidayOrNot = holidayOrNot;
	}
	
	public String toString(int month, int day, int year, boolean holidayOrNot) {
		return this.month + " / " + this.day + " / " + this.year;
	}
	
    public static void main(String[] args) {
    	
    }

}
