package Learn.Opps;

class Study{
	int id;
	String name;
	String city;
	double contact;
	public Study(int id, String name, String city, double contact) { //Perameterized Constructor
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.contact = contact;
		
	}
	public Study() {
		System.out.println("Non-Perametrized constructor...");
	}
	public void display() {
		System.out.println("id : "+id+", naame : "+name+", city : "+city+", contact : "+contact);
	}

}

public class Constructor {
	public static void main(String[] args) {
		Study st = new Study(1, "Dhruv", "Amreli", 704613211);
		st.display();
	}
}
