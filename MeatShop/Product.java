public class Product {
	String name;
	double price;
	int kilos;

	public void sell(int amount){
	System.out.println("Sold " + amount + " kilos of " + name);
		kilos = kilos - amount;
	}

	public void restock(int amount){
	System.out.println("Restocking " + amount + " kilos");
		kilos = amount + kilos;
	}
}
