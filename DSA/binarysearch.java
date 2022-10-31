import java.util.*;

public class BinarySearch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 10, 20, 30, 40, 45, 60, 70, 89 };
        int key = sc.nextInt();

        int ans = binary_search(arr, key);

        if (ans == -1)
        {
            System.out.println(key + " not present in the array");
        }
        else
        {
            System.out.println(key + " present in the array at index " + ans);
        }
        sc.close();
    }

    static int binary_search(int arr[], int key)
    {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while(start <= end)
        {
            int mid = (start + end) >> 1;

            if (arr[mid] == key) 
            {
                return mid;
            } 
            else if (arr[mid] > key) 
            {
                end = mid - 1;
            } 
            else 
            {
                start = mid + 1;
            }
        }
        return -1;
    }
}
