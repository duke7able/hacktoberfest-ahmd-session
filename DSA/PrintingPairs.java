public class PrintingPairs {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        print_pairs(arr);
    }

    static void print_pairs(int arr[])
    {
        int n = arr.length;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
}
