package Learn.Opps;

class Account {
	private long accno;
	private String name;
	private float ammount;

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAmmount() {
		return ammount;
	}

	public void setAmmount(float ammount) {
		this.ammount = ammount;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccno(6574839);
		acc.setName("Dhruv Virani");
		acc.setAmmount(12000);

		System.out.println("Account no. : " + acc.getAccno() + " Account Holder Name : " + acc.getName()
				+ " Total Ammount : " + acc.getAmmount());
	}
}
