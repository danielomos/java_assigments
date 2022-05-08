/* write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.*/
import java.util.Scanner;

public class CompoundValue{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();

		
		double total = savingAmount * (1 + 0.00417);
		
		total = (savingAmount + total) * (1 + 0.00417);
		
		total = (savingAmount + total) * (1 + 0.00417);
		
		total = (savingAmount + total) * (1 + 0.00417);
		
		total = (savingAmount + total) * (1 + 0.00417);
		
		total = (savingAmount + total) * (1 + 0.00417);

		System.out.printf("After the sixth month, the account value is %.2f%n ", + total);
	}
}
