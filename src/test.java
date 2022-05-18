import java.util.Scanner;

public class test {
    public static void main (String...args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number or enter -1 to exit:");
        int number = input.nextInt();



        int evenNumber = 0;
        int oddNumber = 0;

        for ( ;number != -1;){

            if (number % 2 == 0 ) {
                evenNumber += number;
            }
            else  if(number % 2 != 0){
                oddNumber += number ;
            }
            System.out.println("enter another number again");
            number = input.nextInt();
        }
        System.out.printf("the total  sum of Even number Between 1 to 30 is: %d%n ", evenNumber);
        System.out.printf("the total  sum of Odd number Between 1 to 30 is: %d%n ", oddNumber);
    }
}
