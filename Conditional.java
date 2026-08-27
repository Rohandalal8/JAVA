import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example of if-else statement
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Tax: " + tax);

        // Ternary operator example
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);

        // Switch statement example
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a % b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
