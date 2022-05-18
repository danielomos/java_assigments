import java.util.Scanner;

public class FactorialValueOfNumber {
    public static  void main (String []args) {
        int counter = 1;
        int factorial = 1;
        int number = 1;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter nnumber to find the factorial value\n");
        counter = input.nextInt();

        while (number <= counter){
            factorial *= number;

            number++;
          }
        System.out.print("factorial value of"+" "+ counter+" "+"is:"+factorial);
    }


}

