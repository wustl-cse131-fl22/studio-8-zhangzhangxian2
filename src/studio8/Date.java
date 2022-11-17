package studio8;

public class Date {
	private int month; //the months 1-12
	private int day; //the days 1-31
	private int year; //year
	private boolean holidayOrNot; //holiday or not

	public Date(int month, int day, int year, boolean holidayOrNot) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holidayOrNot = holidayOrNot;
	}
	
	public static String toString(int month, int day, int year, boolean holidayOrNot) {
		return this.month + " / " + this.day + " / " + this.year;
	}
	
    public static void main(String[] args) {
    	toString(2, 22, 2222, true);
    }

}
