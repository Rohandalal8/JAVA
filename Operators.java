public class Operators {
    public static void main(String[] args) {
        int A = 10;
        int B = 2;

        // Arithmetic Operators
        System.out.println("A + B = " + (A + B));
        System.out.println("A - B = " + (A - B));
        System.out.println("A * B = " + (A * B));
        System.out.println("A / B = " + (A / B));
        System.out.println("A % B = " + (A % B));

        // Increment and Decrement Operators
        System.out.println("A++ = " + (A++)); // Post-increment
        System.out.println("++A = " + (++A)); // Pre-increment
        System.out.println("B-- = " + (B--)); // Post-decrement
        System.out.println("--B = " + (--B)); // Pre-decrement

        // Relational Operators
        System.out.println("A == B: " + (A == B));
        System.out.println("A != B: " + (A != B));
        System.out.println("A < B: " + (A < B));
        System.out.println("A > B: " + (A > B));
        System.out.println("A <= B: " + (A <= B));
        System.out.println("A >= B: " + (A >= B));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Assignment Operators
        int C = 5;
        C += 3; // C = C + 3
        System.out.println("C after C += 3: " + C);
        C -= 2; // C = C - 2
        System.out.println("C after C -= 2: " + C);
        C *= 4; // C = C * 4
        System.out.println("C after C *= 4: " + C);
        C /= 2; // C = C / 2
        System.out.println("C after C /= 2: " + C);
        C %= 3; // C = C % 3
        System.out.println("C after C %= 3: " + C);

    }
    
}
