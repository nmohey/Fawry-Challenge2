package bookstore;

public class EBook extends Book {
	String filetype;
	
	public EBook(String filetype){
		super();
		this.filetype = filetype;
	}
	
	public double buy(int quantity, String email, String address){
		System.out.println("EBook sent to Mail Service to email: " + email);
		return price;
	}
}
