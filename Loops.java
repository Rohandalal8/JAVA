import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // Example of a for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop iteration: " + i);
        }

        // Example of a while loop
        int j = 0;
        while (j < 5) {
            System.out.println("While Loop iteration: " + j);
            j++;
        }

        // Example of a do-while loop
        int k = 0;
        do {
            System.out.println("Do-While Loop iteration: " + k);
            k++;
        } while (k < 5);

        // break statement example
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Breaking the loop at iteration: " + m);
                break;
            }
            System.out.println("Break Loop iteration: " + m);
        }

        // continue statement example
        for (int n = 0; n < 10; n++) {
            if (n % 2 == 0) {
                // System.out.println("Continuing at iteration: " + n);
                continue;
            }
            System.out.println("Continue Loop iteration: " + n);
        }

        // check if a number is prime
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}