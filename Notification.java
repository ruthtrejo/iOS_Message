import java.util.*;
class Notification {
	public static void main(String [] args) {
		Contact [] contacts = new Contact[4];
		System.out.println("Hello User, welcome to iMessage!");
//		while(true){
			displayMenu(contacts);
			
			Scanner scnr = new Scanner(System.in);
			int choice = scnr.nextInt();
			System.out.println(showMessageInfo(contacts,choice));
//		}
		
	}
	
	/* The method prints the message of the specific Contact the user chose. */
	public static String showMessageInfo(Contact[] contacts, int choice) {
		System.out.println("Message From: " + contacts[choice-1].getFirstName());
		return contacts[choice-1].message.toString();
	}
	
	/* The method prints the Phone Number of the specific Contact the user chose. */
	public static String showPhoneNumber(Contact[] contacts, int choice) {
		return contacts[choice-1].phoneNumber;
	}
	
	/* The method displayed the menu that allows the user to choose. */
	public static void displayMenu(Contact[] contacts) {
		fillContacts(contacts); //Fill contact list and then traverse to display names
		
		System.out.print("The following Contacts sent you a message:\n"); 
		for(int i = 0; i < contacts.length; i++) {
			System.out.println((i+1) + ". " + contacts[i].getFirstName());
		}
		System.out.println("Please select a contact you would like to view [1-4]:\n");
	}
	
	/* The method will fill the contact array in the main menu with the contact list provided to students. */
	public static void fillContacts(Contact[] contacts) {
		//Using constructor to set Contact and message attributes
		contacts[0] = new Contact("Erik","Macik","915-211-1234", 
				new Message(11,03,"05:19","PM","Hey guys look at this meme I found"));
		contacts[1] = new Contact("Joshua","Ramos","915-987-6547",
				new Message(11,02,"02:13","AM","Yo! I just won first place in FallGuys! :D"));
		
		//Using setters to set Contact and message values
		
		//Creating Message and Contact object for William using setters
		Message william = new Message();
		william.setText("Draw me like one of french girls ;)");
		william.setMonth(11);
		william.setDay(10);
		william.setTimeOfDay("PM");
		william.setTime("09:06");
		
		contacts[2] = new Contact();
		contacts[2].setFirstName("William");
		contacts[2].setLastName("Croslen");
		contacts[2].setPhoneNumber("915-321-7854");
		contacts[2].setMessage(william);
		
		//Creating Message and Contact object for Ruth using setters
		Message ruth = new Message();
		ruth.setText("so... I just wasted another $25 in COD mobile");
		ruth.setMonth(11);
		ruth.setDay(03);
		ruth.setTime("11:54");
		ruth.setTimeOfDay("PM");
		
		//setting contact information for Ruth
		contacts[3] = new Contact();
		contacts[3].setFirstName("Ruth");
		contacts[3].setLastName("Trejo");
		contacts[3].setPhoneNumber("915-741-2589");
		contacts[3].setMessage(ruth);
	}
}