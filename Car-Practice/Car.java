public class Car {
	String model;
	int year;
	int speed;

	// Methods


	public void brake() {
		System.out.println("Slowing down...");
		speed = 0;
	}

	public void reverse() {
		System.out.println("Backing up.");
		speed = -5;

	}
}
