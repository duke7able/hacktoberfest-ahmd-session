package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { -2, 3, 4, -1, 5, -12, 6, 1, 3 };
        insertion_sort(arr);
        print(arr);
    }

    static void insertion_sort(int arr[])
    {
        int n = arr.length;

        for(int i=1;i<n;i++)
        {
            int current = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > current)
            {
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            arr[prev + 1] = current;
        }
    }

    static void print(int arr[])
    {
        int n = arr.length;
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
