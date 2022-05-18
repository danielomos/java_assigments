import java.util.Random;
import java.util.Scanner;

public class RandomMathQuestions2 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade = 0;
        int userAnswer = 0;
        int correctAnswer = 0;
        int numberOfQuestion = 0;
        System.out.println("Enter the Number of Question you want to answer");
        numberOfQuestion = input.nextInt();
        while (grade != numberOfQuestion){
            correctAnswer = randomQuestion();
            System.out.println("Enter your answer =");
            userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                grade++;
                System.out.println("Correct");
                System.out.println("your current score =" + grade);
            }
            else {
                grade--;
                System.out.println("Wrong");
                System.out.println("your current score =" + grade);
            }
        }

    }



    public static int randomQuestion(){
        int total = 0;
        Random mixed = new Random();
        int firstNumber = mixed.nextInt(10);
        int secondNumber = mixed.nextInt(10);
        int questionSelection = mixed.nextInt(4);

        if (questionSelection == 0){
            System.out.println("What is the Total Sum of = " + firstNumber + " + " + secondNumber );
            total = firstNumber + secondNumber;
        }
        if (questionSelection == 1) {
            System.out.println("What is the Total Sum of = " + firstNumber + " - " + secondNumber);
            total = firstNumber - secondNumber;
        }
        if(questionSelection == 2)  {
            System.out.println("What is the Total Sum of = " + firstNumber + " * " + secondNumber);
            total = firstNumber * secondNumber;
        }
        if(questionSelection == 3) {
            System.out.println("What is the Total of = " + firstNumber + " / " + secondNumber);
            total =(int) firstNumber / secondNumber;
        }
        return  total;
    }
}
