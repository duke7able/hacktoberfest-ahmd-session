public class SubarraySum_2 {
    public static void main(String[] args) {
        int arr[] = { -2, 3, 4, -1, 5, -12, 6, 1, 3 };
        int ans = subarray_sum_2(arr);
        System.out.println(ans);
    }

    static int subarray_sum_2(int arr[])
    {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i=1;i<n;i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum = i > 0 ? prefix[j] - prefix[i - 1] : prefix[j];
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
}

