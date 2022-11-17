package studio8;


public class Time {
	private int hour; //1-24
	private int minute; //1-60
	private boolean twelveOrTwentyFour; //format of display

	public Time(int hour, int minute, boolean twelveOrTwentyFour) {
		this.hour = hour;
		this.minute = minute;
		this.twelveOrTwentyFour = twelveOrTwentyFour;
	}
	
	public String toString(int hour, int minute, boolean twelveOrTwentyFour) {
		return this.hour + " / " + this.minute;
	}
	
	public static void main(String[] args) {
		
    	
    }

}