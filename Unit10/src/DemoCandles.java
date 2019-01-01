import java.util.Scanner;
public class DemoCandles {
	public static void main(String[] args) {
		// Demonstrate the candle and scentedcandle class
		Scanner input = new Scanner(System.in);
		Candle unScented = new Candle();
		ScentedCandle scentedCandle = new ScentedCandle();	
		
		//Demo regular candle
		System.out.println("PRICE AN UNSCENTED CANDLE");
		System.out.print("Enter a color:  ");
		unScented.setColor(input.next());
		System.out.print("Enter height in inches:  ");
		unScented.setHeight(input.nextDouble());	
		
		//Demo scented candle
		System.out.println("\nPRICE A SCNETED CANDLE");
		System.out.print("Enter a color:  ");
		scentedCandle.setColor(input.next());
		System.out.print("Enter a scent:  ");
		scentedCandle.setScent(input.next());
		System.out.print("Enter height in inches:  ");
		scentedCandle.setHeight(input.nextDouble());
		
		//Print the candles 
		System.out.println("\nUnscented Candle");
		System.out.println("Color: " + unScented.getColor());
		System.out.println("Height: " + unScented.getHeight() + " inches");
		System.out.println("Price: $" + unScented.getPrice());
		
		System.out.println("\nScented Candle");
		System.out.println("Color: " + scentedCandle.getColor());
		System.out.println("Scent: " + scentedCandle.getScent());
		System.out.println("Height: " + scentedCandle.getHeight() + " inches");
		System.out.println("Price: $" + scentedCandle.getPrice());
	}
}