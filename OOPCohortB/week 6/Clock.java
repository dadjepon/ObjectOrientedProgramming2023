package gh.edu.ashesi.OOPCohortB;

/**
 * Package for Clock Class 
 */

/**
 * <b>Clock Class</b>
 * <i>There are some issues with the logic of the code 
 * provided in this class. Run this code by passing 
 * several sets parameters (say 300, 600) into 
 * 'clock.setSeconds(900)'.</i>
 * <i>Take note of the results and use the debugger to 
 * correct any logical errors</i>
 * <i>Also look out for some 'To Do' tasks in the code.
 * @author David Ebo Adjepon-Yamoah
 * @version 1.0.1
 * @since 22/02/2023
 */
public class Clock {

	/**
	 * Instance/Member Variables
	 */
	private static int seconds;
	private int minute;
	private int hour;
	
	//Can you think of a way to turn this clock
	//into a 24-hour clock (i.e., where 2:00 pm is 14:00)
	//using this boolean variable?
	private boolean is24HourClock;
	
	/**
	 * Clock Constructor
	 * @param none
	 */
	public Clock() {
		//Initialising the static variable: seconds
		seconds = 0;
		
		//Initialising non-static variable: minute & hour
		this.minute = 0;
		this.hour = 0;
	}
	
	/**
	 * <i>getSeconds</i> Accessor or Getter Method
	 * @param none
	 * @return int <non-static>
	 */
	public int getSeconds() {
		return Clock.seconds;
	} 

	/**
	 * <i>getMinute</i> Accessor or Getter Method
	 * @param none
	 * @return int
	 */
	public int getMinute() {
		this.minute = (this.getSeconds())/60;
		
		//Remainder of division: Seconds 
		if(this.minute%60 > 0)
			{
				this.setSeconds(this.minute%60);
			}
		else if(this.minute%60 <= 0){
			this.setSeconds(0);
		}

		return this.minute;
	} 
	
	/**
	 * <i>getHour</i> Accessor or Getter Method
	 * @param none
	 * @return int
	 */
	public int getHour() {
		this.minute = (this.getSeconds())/60;
		
		this.hour = this.minute/60;
		
		//Remainder of division: Minutes 
		if(this.minute%60 > 0)
			{
				this.setMinute(this.minute%60);
			}
		else if (this.minute%60 <= 0)
			{
				this.setMinute(0);
			}
		return this.hour;
	} 
	
	/**
	 * <i>setSeconds</i> Mutator or Setter Method 
	 * @param int seconds
	 * @return void
	 */
	public void setSeconds(int seconds)
	{
		if(seconds >= 0) 
		{
			Clock.seconds = seconds;
		}
		else {System.out.println("Provide valid number values greater than or equal to zero!");}
	}
	
	/**
	 * <i>setMinute</i> Mutator or Setter Method 
	 * @param none
	 * @return int
	 */
	public void setMinute(int minutes)
	{
		if(minutes >= 0) 
		{
			this.minute = minutes;
		}
		else {System.out.println("Provide valid number value greater than or equal to zero!");}
	}
	
	/**
	 * <i>setMinute</i> Mutator or Setter Method 
	 * @param double hours
	 * @return void
	 */
	public void setHour(int hours)
	{
		if(hours >= 0) 
		{
			this.hour = hours;
		}
		else {System.out.println("Provide valid number value greater than or equal to zero!");}
	}
	
	/**
	 * Set Alarm Method
	 * @param hour
	 * @param minute
	 * @return void
	 */
	public void setAlarm(int hours, int minutes)
	{
		if(((minutes >= 0) && (minutes <=60)) &&
			((hours >= 0) && (hours <=60))) 
		{
			//Seconds?
			this.hour = hours;
			this.minute = minutes;
		}
		else 
		{
			System.out.println("Provide valid number values greater than or equal to zero!");
		}
		
	}
	
	/**
	 * Auxiliary Method: toString Method
	 * @param none
	 * @return String
	 */
	public String toString()
	{
		return "Current Time is (HH:MM:SS) - "
				+ getHour()+":"
				+ getMinute()+":"
				+ getSeconds();
	}
	
	/**
	 * Auxiliary Method: equals Method
	 * @param none
	 * @return String
	 */
	public boolean equals(Object obj)
	{
		//Check if Object is null
		if(obj == null) return false;
		
		//To Do: How is 'instanceof' used here?
		
		//Type cast Object to that of the Clock class
		Clock clock = (Clock) obj;
		
		//Compare the attributes of the two objects
		return ((seconds == clock.getSeconds()) 
				&& (this.minute == clock.minute) 
				&& (this.hour == clock.hour));
	}

	
	/**
	 * Auxiliary Method: hashCode Method
	 * @param none
	 * @return String
	 */
	public int hashCode()
	{
		//In computing the hash values of objects,
		//prime numbers are typically used
		//To Do: Why are 7 and 31 used here?
		int hash = 7;
		hash = hash * 31 + this.getSeconds();
		hash = hash * 31 + this.minute;
		hash = hash * 31 + this.hour;
		
		return hash;
	}
	
	/**
	 * Main Method
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		Clock clock = new Clock();
		
		//Passing a test parameter of 900 seconds 
		clock.setSeconds(900);
		
		//Printing out static variable: seconds
		//Take note that it is accessed by calling 
		//the name of the class and using the 'dot operator'  
		System.out.println("Seconds: "+Clock.seconds);
		
		//clock.getMinute();
		//clock.getHour();
		
		//Printing the String representation of the Clock
		System.out.println(clock.toString());
	}

}
