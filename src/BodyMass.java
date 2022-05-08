/*body max index (BMI) is a measure of health on weight. it can be calculated by taking your weight in kilograms and dividing by the square of youe height in meters, write a program that prompts the user to enters a weight in pounds and height in inches and displays the BMI. */
import java.util.Scanner;

public class BodyMass {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
            System.out.printf("Enter weight in pounds:%n");
            double weightInPounds = input.nextDouble();
            
            System.out.printf("Enter Height in inches:%n");
            double heightInInches = input.nextDouble();
            
            
            double weightInKilograms = weightInPounds * 0.453592;
            double heightInMeters = heightInInches * 0.0254;
        
            double bmi = weightInKilograms / (heightInMeters * heightInMeters);
            
            System.out.printf("BMI is %.5f%n", bmi);

    }




}
