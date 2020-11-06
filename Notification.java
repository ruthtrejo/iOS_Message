import java.util.*;
class Notification {
		
	public static void main(String [] args) {
		Contact [] contacts = new Contact[4];
		boolean sentinel = false;
		int choice = 0;
		char getPhoneNo, repeat;
		
		System.out.println("Hello User, welcome to iMessage!\n\n");
		while(!sentinel){
			displayMenu(contacts);
			Scanner scnr = new Scanner(System.in);
			choice = scnr.nextInt();
			System.out.println(showMessageInfo(contacts,choice));
			
			//flush scanner
			scnr.nextLine();
			
			System.out.println("\nWould you like to view their phone number? [y] Yes [n] no");
			getPhoneNo = scnr.nextLine().charAt(0);
			
			//If the user wants to view the phone number, show it. 
			if(getPhoneNo == 'y' || getPhoneNo == 'y')
				System.out.println("Phone Number: " + showPhoneNumber(contacts, choice));
			
			System.out.println("\nWould you like to view another message? [y] Yes [n] no");
			repeat = scnr.nextLine().charAt(0);
			
			//If the user does not want to repeat the menu, end loop. 
			if(repeat == 'n' || repeat == 'n')
				sentinel = true;
			
		}//end while
		
		System.out.println("\n Exiting iMessage application...\nDone");
		
		
	}//end main
	
	/* The method prints the message of the specific Contact the user chose. */
	public static String showMessageInfo(Contact[] contacts, int choice) {
		System.out.println("\nMessage From: "+ contacts[choice-1].getFirstName());
		return contacts[choice-1].message.toString();
	}//end showMessageInfo
	
	/* The method prints the Phone Number of the specific Contact the user chose. */
	public static String showPhoneNumber(Contact[] contacts, int choice) {
		return contacts[choice-1].phoneNumber;
	}//end showPhoneNumber
	
	/* The method displayed the menu that allows the user to choose. */
	public static void displayMenu(Contact[] contacts) {
		fillContacts(contacts); //Fill contact list and then traverse to display names
		
		System.out.print("The following Contacts sent you a message:\n"); 
		for(int i = 0; i < contacts.length; i++) {
			System.out.println((i+1) + ". " + contacts[i].getFirstName());
		}
		System.out.print("\nPlease select a contact you would like to view [1-4]:\n> ");
	}//end displayMenu
	
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
	}//end fillContacts
}//end Notification class