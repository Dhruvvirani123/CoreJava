package coreJava;

abstract class bank {
	abstract int getbalance();
}

class bankA extends bank {
	int balance;

	void deposite(int money) {
		balance += money;
	}

	int getbalance() {
		return balance;
	}
}

class bankB extends bank {
	int balance;

	void deposit(int money) {
		balance += money;
	}

	int getbalance() {
		return balance;
	}
}

class bankC extends bank {
	int balance;

	void deposit(int money) {
		balance += money;
	}

	int getbalance() {
		return balance;
	}
}

public class AbstractBank {
	public static void main(String[] args) {
		bankA bankA = new bankA();
		bankB bankB = new bankB();
		bankC bankC = new bankC();

		bankA.deposite(10000);
		bankB.deposit(20000);
		bankC.deposit(30000);

		System.out.println("Balance of bank A : " + bankA.getbalance());
		System.out.println("Balance of bank B : " + bankB.getbalance());
		System.out.println("Balance of bank C : " + bankC.getbalance());
	}
}