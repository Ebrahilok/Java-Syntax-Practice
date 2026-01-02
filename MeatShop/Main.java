public class Main{
	public static void main(String[] args){

	// First Object
	
	Product Ribeye = new Product();
	Ribeye.name = "Ribeye";
	Ribeye.price = 250.5;
	Ribeye.kilos = 10;

	Ribeye.sell(3);

	// Second Object
	
	Product Chorizo = new Product();
	Chorizo.name = "Chorizo";
	Chorizo.price = 120.0;
	Chorizo.kilos = 50;
	
	Chorizo.restock(20);

	System.out.println("Ribeye Stock: " + Ribeye.kilos);
	System.out.println("Chorizo Stock: " + Chorizo.kilos);
	}
}
