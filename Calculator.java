import java.util.*;

public class Calculator {

    public static void add(double x, double y) {
        System.out.println("Result: " + (x + y));
    }

    public static void sub(double x, double y) {
        System.out.println("Result: " + (x - y));
    }

    public static void mul(double x, double y) {
        System.out.println("Result: " + (x * y));
    }

    public static void div(double x, double y) {
        if (y != 0) {
            System.out.println("Result: " + (x / y));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = sc.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = sc.nextDouble();
        System.out.println("Enter the operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                add(firstNumber, secondNumber);
                break;
            case '-':
                sub(firstNumber, secondNumber);
                break;
            case '*':
                mul(firstNumber, secondNumber);
                break;
            case '/':
                div(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid operation. Please enter one of the following operators: +, -, *, /");
                break;
        }

        sc.close();
    }
}
