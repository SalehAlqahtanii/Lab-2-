import java.util.Scanner;
public class Aaa {
public static void main (String [] args){
	Scanner Keyboard = new Scanner(System.in);
	
	System.out.println("Enter the amount of money");
	int amount = Keyboard.nextInt();
int fiveHundreds = 500;
int hundreds = 100;
int fifties = 50;
int tens = 10;
int fives = 5;
int riyals = 1;
int fh = (amount/fiveHundreds);
int h = ((amount%fiveHundreds)/hundreds);
int f = ((amount%hundreds)/fifties);
int t = ((amount%fifties)/tens);
int fi = ((amount%tens)/fives);
int r = ((amount%fives)/riyals);
System.out.println(fh + " Five Hundreds");
System.out.println(h + " Hundreds");
System.out.println(f + " fifties");
System.out.println(t + " tens");
System.out.println(fi + " Fives");
System.out.println(r + " Riyals");
     }
}
