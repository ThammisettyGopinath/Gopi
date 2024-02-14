package ProjectOne;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        System.out.println("Enter 1st number : ");
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        System.out.println("Enter 2nd number : ");
        double num2=sc.nextDouble();
        System.out.println("Choose Operator : +,-,*,/,% ");
        String operator=sc.next();
        switch(operator)
        {
            case "+":
                System.out.println("Addition is : " + (num1+num2));
                break;
            case "-":
                System.out.println("Subtraction  is : " + (num1-num2));
                break;
            case "*":
                System.out.println("Multiplication is : " + (num1*num2));
                break;
            case "/":
                System.out.println("Division is : " + num1/num2);
                break;
            case "%":
                System.out.println("Modulus is : " + num1%num2);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
