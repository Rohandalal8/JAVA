import java.util.*;

public class FunctionsAndMethods {

    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static int addNumbers(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addNumbers(a, b);
        System.out.println("Sum: " + sum);

        // printHello();
    }
}
