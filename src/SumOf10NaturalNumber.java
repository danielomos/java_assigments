import java.util.Scanner;

public class SumOf10NaturalNumber {
    public static void main(String[]args){
        int integer = 1;
        int counter = 10;
        int sum = 0;


       while (integer <= counter) {
           sum = sum + integer;
           integer++;
       }




        System.out.print("total sum of 10 natural number"+ "" + sum);
    }
}
