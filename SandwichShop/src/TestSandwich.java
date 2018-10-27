
public class TestSandwich {
	public static void main(String[] args) {
		
	//make bread objects, wish we were to loops already.
	Sandwich which1 = new Sandwich("Wheat", 150.0, "ham", 200.0);
	Sandwich which2 = new Sandwich("Rye", 200.0, "Beef", 201);
	Sandwich which3 = new Sandwich("White", 250.0, "American Cheese", 80);
	Sandwich which4 = new Sandwich("Pumpernickle", 500.0,"Turkey", 180);	
	//display bread objects
	which1.display();
	which2.display();
	which3.display();
	which4.display();
	}
}

