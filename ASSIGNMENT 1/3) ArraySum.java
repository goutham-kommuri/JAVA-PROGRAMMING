import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println("The sum of all elements in the array is: " + sum);

        scanner.close();
}
}
output
Enter the number of elements in the array: 5
Enter the elements of the array:
1
22
33
45
65
The sum of all elements in the array is: 166

=== Code Execution Successful ===
