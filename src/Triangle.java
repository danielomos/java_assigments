/*write a program that prompts the user to enter three points (x1, y1),(x2, y2),(x3,y3) of a triangle and displays its area. */

import java.util.Scanner;

public class Triangle{
    public static void main(String[] args){
    
    Scanner calc = new Scanner (System.in);
    
        System.out.printf("Enter three points for a Triangle:%n");
            double x1 = calc.nextDouble();
            double y1  = calc.nextDouble();
            double x2 = calc.nextDouble();
            double y2  = calc.nextDouble();
            double x3 = calc.nextDouble();
            double y3  = calc.nextDouble();
            
            double side1 = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
            double side2 = Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
            double side3 = Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
            
            double firstS = (side1+side2+side3) / 2;
            
            double secondS = Math.sqrt(firstS*(firstS-side1)*(firstS-side2)*(firstS-side3));
            
            System.out.printf("print%.3f%n",secondS);
            
    
    
    
    }



}
