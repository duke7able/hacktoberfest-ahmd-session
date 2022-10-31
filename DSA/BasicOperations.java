import java.util.*;

public class BasicOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter the number of students");
        int n;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
