package iOS_Message;

class Message {
	int month;
	int day;
	String time;
	String timeOfDay;
	String text;
	
	//Default Constructor
	Message(){
	}
	Message(int month , int day, String time, String timeOfDay, String text){
		this.month = month;
		this.day = day;
		this.time = time;
		this.timeOfDay = timeOfDay;
		this.text = text;
	}
	
	public void setText(String text){
		this.text = text;
	}
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
	
	public String getText(){
		return this.text;
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
	
	public String toString() {
		String d = String.format("%02d" , this.day);
		String m = String.format("%02d" , this.month);
		return m + "/" d + " " + this.time + " " + this.timeOfDay + "\n" + this.text;
	}
	
	
	
	
}
