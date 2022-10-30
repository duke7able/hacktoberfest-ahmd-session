package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class InbuiltSort{
    public static void main(String[] args) {
        Integer arr[] = { 10, 9, 8, 6, 5, 4, 3, 2, 11, 16, 8 };

        // Arrays.sort(arr);

        // for (int x : arr) {
        //     System.out.print(x + " ");
        // }

        // System.out.println();
        // Reverse the array using Inbuilt Functions
        // Collections.reverse(Arrays.asList(arr));

        // for(int x : arr)
        // {
        //     System.out.print(x + " ");
        // }
        
        
        //Sorting using comparator Functions

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) 
            {
                return b - a;
            }
        });

        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
