package coreJava;

class Address{
	String houseno;
	String city;
	String country;
	public Address(String name, String houseno, String city, String country) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.country = country;
	}
}

class employee{
	String name;
	Address address;
	
	public employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public void displaydetails() {
		System.out.println(address.houseno + address.city + address.country);
	}
	
}

public class Aggregation {
	public static void main(String[] args) {
		Address ad = new Address("d123", "Amreli", "India", null);
		
		employee e1 = new employee("Dhruv", ad);
		e1.displaydetails();
	}
}
