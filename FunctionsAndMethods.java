import java.util.*;

public class FunctionsAndMethods {

    public static void printHello() {
        System.out.println("Hello, World!");
    }

    // function to swap two numbers
    public static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b: " + b);
    }
    
    // method overloading
    // function to add two numbers
    public static int addNumbers(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // function to add three numbers
    public static int addNumbers(int x, int y, int z) {
        int sum = x + y + z;
        return sum;
    }

    // function to add float numbers
    public static float addNumbers(float x, float y) {
        float sum = x + y;
        return sum;
    }

    // function to check if a number is prime or not
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        }   
    }

    // function to check primes in a range
    public static void checkPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // function to convert binary to decimal
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10;
        }
        return decimal;
    }

    // function to convert decimal to binary
    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int power = 0;
        while (decimal > 0) {
            int lastDigit = decimal % 2;
            binary += lastDigit * Math.pow(10, power);
            power++;
            decimal /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        System.out.println("Sum of two numbers: " + addNumbers(a, b));
        System.out.println("Sum of three numbers: " + addNumbers(a, b, c));
        System.out.println("Sum of two float numbers: " + addNumbers(d, e));
        System.out.println("Is " + a + " prime? " + isPrime(a));
        System.out.print("Primes in the range " + a + " to " + b + ": ");
        checkPrimesInRange(a, b);
        System.out.println("Decimal of binary " + a + " is: " + binaryToDecimal(a));
        System.out.println("Binary of decimal " + a + " is: " + decimalToBinary(a));
    }
}
