package coreJava;

abstract class marks{
	public abstract float getPercentage();
}
class A extends marks{

	int marks1,marks2,marks3;
	A(int m1, int m2, int m3){
		marks1 = m1;
		marks2 = m2;
		marks3 = m3;
	}
	@Override
	public float getPercentage() {
		float total = ((marks1+marks2+marks3)/(float)300)*100;
		return total;
	}
	
}
class B extends marks{

	int marks1,marks2,marks3;
	B(int m1, int m2, int m3){
		marks1 = m1;
		marks2 = m2;
		marks3 = m3;
	}
	@Override
	public float getPercentage() {
		float total = ((marks1+marks2+marks3)/(float)400)*100;
		return total;
	}
}

public class StudentMarks {
	public static void main(String[] args) {
		
		A a = new A(70,50,100);
		System.out.println("Percentage A : "+a.getPercentage());
		
		B b = new B(90,64,86);
		System.out.println("Percentage B : "+b.getPercentage());
	}
}
