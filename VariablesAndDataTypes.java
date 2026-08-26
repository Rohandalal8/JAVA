
import java.util.*;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));

        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area of circle with radius " + rad + " is: " + area);

        float c = 25.12f;
        int d = (int) c; // Type casting from float to int
        System.out.println("Int value: " + d);

        char ch = 'A';
        int num = ch; // Implicit type casting from char to int
        System.out.println("ASCII value of " + ch + " is: " + num);
    }
}