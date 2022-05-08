/*write a program that reads the balance and the annual percentage interest  rate and displays the interest for the next month.*/

import java.util.Scanner;

public class Interest {
    public static void main (String [] args){
        Scanner collect = new Scanner(System.in);
    
        System.out.printf("Enter balance:%n");
        double balance = collect.nextDouble();
        double annualRate = collect.nextDouble();
        
        double monthlyRate = annualRate / 1200;
        
        double nextInterest = balance * monthlyRate;
        
        System.out.printf("Next month interest rate is %.5f%n", nextInterest);
        
    
    }

}
