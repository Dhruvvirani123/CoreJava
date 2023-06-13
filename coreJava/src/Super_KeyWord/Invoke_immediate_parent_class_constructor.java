package Super_KeyWord;

class person {
	person() {
		System.out.println("Person Class onstructoor");
	}
}

class teacher122 extends person {
	teacher122() {
		super();
		System.out.println("Teacher class Constructor");
	}
}

public class Invoke_immediate_parent_class_constructor {
	public static void main(String[] args) {
		teacher t1 = new teacher();

	}
}