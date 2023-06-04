package Learn;
interface Drawable{
	void draw();
}
class Ractangle implements Drawable{
	public void draw() {
		System.out.println("Drawing Ractangle...");
	}
}
class Circal implements Drawable{
	public void draw() {
		System.out.println("Drawing Circal...");
	}
}
public class Interface_2 {
public static void main(String[] args) {
	Drawable d = new Circal();
	d.draw();
}
}