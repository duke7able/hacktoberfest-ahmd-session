package Character_Arrays;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Digital_Spaces {
    public static void main(String[] args) throws IOException {
        
        //Given a sentence, count the number of alphabets, digits and spaces in the sentence

        //1. Read one by one and process
        //2. Store the sentence and process

        //Using 1

        Scanner sc = new Scanner(System.in);

        // char c = (char) System.in.read();

        // int alphabets = 0;
        // int digits = 0;
        // int spaces = 0;

        // while(c != '\n')
        // {
        //     if(c >= '0' && c <= '9')
        //     {
        //         digits++;
        //     }
        //     else if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
        //     {
        //         alphabets++;
        //     }
        //     else if(c == ' ' || c == '\t')
        //     {
        //         spaces++;
        //     }
        //     c = (char) System.in.read();
        // }
        // System.out.println("Total Alphabets " + alphabets);
        // System.out.println("Total Digits " + digits);
        // System.out.println("Total Spaces " + spaces);

        //Using 2
        String s = "";

        s = sc.nextLine();
        int n = s.length();
        int index = 0;

        int a = 0;
        int d = 0;
        int sp = 0;

        while (index < n)
        {
            char element = s.charAt(index);

            if (element >= '0' && element <= '9') 
            {
                d++;
            } 
            else if (element >= 'a' && element <= 'z' || element >= 'A' && element <= 'Z') 
            {
                a++;
            } 
            else if (element == ' ' || element == '\t') 
            {
                sp++;
            }
            index++;
        }

        System.out.println(a + " " + d + " " + sp);
        sc.close();
    }
}
