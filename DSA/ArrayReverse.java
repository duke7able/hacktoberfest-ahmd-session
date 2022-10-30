public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 45, 60, 80, 90 };
        int n = arr.length;

        reverse_array(arr, n);

        print_array(arr, n);
    }

    static void reverse_array(int arr[], int n)
    {
        int i = 0;
        while(i < n/2)
        {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
            i++;
        }
    }

    static void print_array(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
