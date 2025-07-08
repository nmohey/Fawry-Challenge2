package bookstore;

public class Demo extends Book {
	public Demo(){
		super();
	}
	
	public boolean isForSale(){
		return false;
	}
	
	public double buy(int quantity, String email, String address){
		System.out.println("Book not for sale!");
		return price;
	}
}
