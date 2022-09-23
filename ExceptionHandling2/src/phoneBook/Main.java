package phoneBook;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = 1;
		ArrayList<Contact> contact = new ArrayList<>();

		
		while(x != 0) {
			System.out.println("Press 1 for adding a contact");
			System.out.println("Press 2 for searching a contact");
			System.out.println("Press 3 for deleting a contact");
			System.out.println("Press 4 for showing all contacts");
			System.out.println("Press 0 for exit");
			x = scn.nextInt();
			
			if(x== 1) {
				
				System.out.println("Please enter the name of Contact");
				String name = scn.next();
				
				System.out.println("Please enter the address of contact");
				String address = scn.next();
				
				System.out.println("Please enter the MobileNo of contact");
				String mobile = scn.next();
				
				Contact temp = new Contact(name,address,mobile);
				contact.add(temp);
				
			}
			else if(x ==2) {
				System.out.println("Please enter the name of Contact");
				String name = scn.next();
				for(int i= 0;i<contact.size();i++) {
					Contact temp = contact.get(i);
					if(temp.name.equals(name)) {
						System.out.println(temp);
						break;
					}
				}
			}
			else if(x ==3 ) {
				System.out.println("Please enter the name of Contact you want to delete");
				String name = scn.next();
				for(int i= 0;i<contact.size();i++) {
					Contact temp = contact.get(i);
					if(temp.name.equals(name)) {
						contact.remove(i);
						System.out.println("Contact has been deleted");
						break;
					}
				}
			}
			else if(x ==4 ) {
				
				for(int i= 0;i<contact.size();i++) {
					Contact temp = contact.get(i);
						System.out.println(temp);
				}
			}
			
		}
		
		System.out.print("Thanks for using phonebook");
	}

}
