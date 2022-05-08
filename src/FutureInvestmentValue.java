/*write a program that reads in investment amount, annual, annual interest rate , and number of years , and displays the future investment value*/
import java.util.Scanner;

public class FutureInvestmentValue {
	public static void main(String[] args) {
		Scanner collect = new Scanner(System.in);

		System.out.printf("Enter investment amount:%n ");
		double amount = collect.nextDouble();
		System.out.printf("Enter annual interest rate in percentage:%n ");
		double annualRate = collect.nextDouble();
				
		System.out.printf("Enter number of years:%n ");
		double years = collect.nextInt();

        double monthlyRate = annualRate / 1200;
        
		double futureInvestmentValue = 
			amount * Math.pow(1 + monthlyRate, years * 12);
		
		
		System.out.printf("Accumulated value is %.2f%n", futureInvestmentValue);
	}
}
