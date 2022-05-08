/* write a program that prompts the user to enter the distance to drive , the fuel efficiency of the car in miles per gallon, and the price per gallon, and display the cost of the trip. */


import java.util.Scanner;

public class CostOfDriving { 

    public static void main (String [] args) {
        Scanner collect = new Scanner(System.in);
        
        
        System.out.printf("Enter the Driving Distance%n");
        float Distance = collect.nextFloat();
        
        System.out.printf("Enter Miles Per gallon%n");
        float miles = collect.nextFloat();
        
        System.out.printf("Enter price per gallon%n");
        float price = collect.nextFloat();
        
        
        float costPerMiles = price / miles;
        
        float totalCost = costPerMiles * Distance;
        
        
        System.out.printf("The Cost of Driving is %.3f%n", totalCost);
        
        

}


}
