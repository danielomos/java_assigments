import java.util.Random;
import java.util.Scanner;

public class RandomMathQuestions1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter;
        int answer = 0;
        int co = 0;

        System.out.println("Number of question you feel like answering today");
        int numberOfQuestion = input.nextInt();
        for (counter= 1; counter <= numberOfQuestion; ++counter)  {
            int result = randomquestion();
            System.out.println("Enter your answer =");
            answer = input.nextInt();
            if (answer == result) {
                co +=1;
                System.out.println("Correct");
            }
            else if (answer != result){
                co -=1;
                System.out.println("wrong");
            }
            else {System.out.println("noting");}



        }

        System.out.println("your total result is  =" + co);

    }






    public static int randomquestion() {
        int result = 0;
        int counter = 0;
        int sum = 0;
        Random mixed = new Random();
        int first = mixed.nextInt(10);
        int questions= mixed.nextInt(4);
        int second = mixed.nextInt(10);

        switch(questions) {
            case 0:
                System.out.println("What is the total sum for "+ first +" + " + second);
                sum = first + second;
                // return sum;
                break;
            case 1:
                System.out.println("What is the total difference for "+ first +" - " + second);
                sum = first - second;
                //return sum;
                break;
            case 2:
                System.out.println("What is the total multiplication for "+ first +" * " + second);
                sum = first * second;
                //return sum;
                break;
            case 3:
                System.out.println("What is the total multiplication for "+ first +" / " + second);
                sum = first / second;

        }

        return sum;
    }
}


