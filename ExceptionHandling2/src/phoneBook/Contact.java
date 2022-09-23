package phoneBook;

public class Contact {

	String name;
	String address;
	String mobileNo;
	
	
	public Contact(String name, String address, String mobileNo) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	
}
