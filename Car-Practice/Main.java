public class Main {
	public static void main(String[] args) {
		Car myFerrari = new Car();

		myFerrari.model = "Ferrari SF90";
		myFerrari.year = 2025;

		System.out.println("Driving a " + myFerrari.model);

		myFerrari.reverse();

		System.out.println("Current speed = " + myFerrari.speed);
	}
}
