package Inheritance;

class emp {
	float salary = 100000;
}

class programer extends emp {
	int bonus = 1000;
}

public class Inheritance {
	public static void main(String[] args) {
		programer e = new programer();
		System.out.println("employee salary : " + e.salary);
		System.out.println("employee bouns : "+e.bonus);
	}
}
