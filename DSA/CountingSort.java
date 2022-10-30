package Sorting;

import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = { 8,4,3,1 };
        int n = arr.length;

        counting_sort(arr, n);
        print(arr, n);
    }

    static void counting_sort(int arr[], int n)
    {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        int freq_length = max > n ? max : n;
        
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(freq_length + 1, 0));
        
        for (int i = 0; i < n; i++)
        {
            int element = arr[i];
            list.set(element, list.get(element) + 1);
        }

        int j = 0;
        for(int i=0;i<freq_length + 1;i++)
        {
            while(list.get(i) > 0)
            {
                arr[j] = i;
                j += 1;
                list.set(i, list.get(i) - 1);
            }
        }
    }

    static void print(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
