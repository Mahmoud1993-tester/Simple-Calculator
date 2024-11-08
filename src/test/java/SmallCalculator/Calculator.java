package SmallCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value");
        double x = input.nextDouble();
        System.out.println("Enter the second value");
        double y = input.nextDouble();
        System.out.println("Please the process : 1-Addition(+) , 2-Subtraction(-), 3-Multiplication(*), 4-Division(/) : ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The process is Addition and the result = " + (x+y));
                break;
            case 2:
                System.out.println("The process is Subtraction and the result = " + (x-y));
                break;
            case 3:
                System.out.println("The process is Multiplication and the result = " + (x*y));
                break;
            case 4:
                if (y != 0) {
                    System.out.println("The process is Division  and the result = " + (x/y));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4");
                break;
        }

    }
}
