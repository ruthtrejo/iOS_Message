package iOS_Message;

class Contact {
	String firstName;
	String lastName;
	String phoneNumber;
	Message message;
	
	Contact(){
		this.firstName = null;
		this.lastName = null;
		this.phoneNumber = null;
		this.message = null;
	}
	
	Contact(String firstName, String lastName, String phoneNumber, Message message){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.message = message;
	}
	
	//Setters
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
	public void setMessage(Message message) { this.message = message; }
	
	//Getters
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public String getPhoneNumber() { return this.phoneNumber; }
	public Message getMessage() { return this.message; }
	
	//toString message
	public String toString() {
		return "" + this.firstName + " " + this.lastName 
				+ "\n" + this.message;
	}
}