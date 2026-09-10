import java.util.*;

public class Arrays {

    // Update marks function
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    // Linear search function
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Largest number in array
    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    // Binary Search function
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("Mid index: " + mid + ", Mid value: " + numbers[mid]);
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Reverse an array
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            // Swap numbers[first] and numbers[last]
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    // pairs in an array
    public static void printPairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    // Print all subarrays of an array
    public static void subarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int marks[] = new int[50];
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println(marks[0]);

        // int marks2[] = {97, 98, 99};
        // update(marks2);
        // for (int i = 0; i < marks2.length; i++) {
        // System.out.print(marks2[i] + " ");
        // }

        int numbers[] = { 2, 4, 6, 8, 10, 12 };
        // int key = 4;
        // // int index = linearSearch(numbers, key);
        // int index = binarySearch(numbers, key);

        // if (index == -1) {
        // System.out.println("Not Found");
        // } else {
        // System.out.println("Key found at index: " + index);
        // }

        // int largestNumber = largest(numbers);
        // System.out.println("Largest number is: " + largestNumber);

        // reverse(numbers);
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i] + " ");
        // }

        // printPairs(numbers);
        subarrays(numbers);
    }
}
