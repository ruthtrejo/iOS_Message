package iOS_Message;

public class Message {
	int month;
	int day;
	String time;
	String timeOfDay;
	
	public void setMonth(int month){
		this.month = month;
	}
	public void setDay(int day){
		this.day = day;
	}
	public void setTime(String time){
		this.time = time;
	}
	public void setTimeOfDay(String timeOfDay){
		this.timeOfDay = timeOfDay;
	}
	
	
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
	public String getTime(){
		return this.time;
	}
	public String getTimeOfDay(){
		return this.timeOfDay;
	}
}
