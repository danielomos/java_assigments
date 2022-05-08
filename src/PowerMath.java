
import java.util.Scanner;

public class PowerMath {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int power = 1;

        int counter = 0;

        if (number2 == 0) {
            power = 1;
        }
        while (counter < number2) {
            power *= number1;
            counter++;
        }
        System.out.printf("%d raised to the power  %d is equal to %d %n", number1, number2, power);
    }
}