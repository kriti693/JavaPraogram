package ShopingCart;

public class Customer {
	private String name;
	private String ssn;
	
	public Customer(String name,String ssn) {
		this.name=name;
		this.ssn=ssn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSsn() {
		return  ssn;
	}
	public void setSsn(String  ssn) {
		this.ssn= ssn;
	}
}
