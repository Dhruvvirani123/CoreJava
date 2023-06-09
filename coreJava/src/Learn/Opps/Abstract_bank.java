package Learn.Opps;

abstract class bank {
	abstract int getrateofintrest();
}

class SBI extends bank {
	int getrateofintrest() {
		return 7;
	}
}

class PNB extends bank {
	int getrateofintrest() {
		return 6;
	}
}

class BOB extends bank {
	int getrateofintrest() {
		return 8;
	}
}

public class Abstract_bank {
	public static void main(String[] args) {
		bank b;
		b = new SBI();
		System.out.println("SBI Rate of Intrest : " + b.getrateofintrest() + "%");

		b = new PNB();
		System.out.println("PNB Rate of Intrest : " + b.getrateofintrest() + "%");

		b = new BOB();
		System.out.println("BOB Rate of Intrest : " + b.getrateofintrest() + "%");
	}
}