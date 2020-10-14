import java.util.Scanner;
public class Fuel { 
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double distance = kb.nextDouble();
		System.out.println("Enter kilos per liter: ");
		double kilos = kb.nextDouble();
		System.out.println("Enter price per liter: ");
		double price = kb.nextDouble();
		double cost = (distance / kilos)*price;
		System.out.println("the cost of driving is: "+"$"+cost);
	}
}