/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author yasir
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NewClass {

    static int carDistribution(int n, int[] ar) { 
        Arrays.sort(ar);
        int max_count = 1, res = ar[0];
        int curr_count = 1;
        for (int i = 1; i < n; i++)
        {
            if (ar[i] == ar[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = ar[i - 1];
                }
                curr_count = 1;
            }
        }
     
        // If last element is most frequent
        if (max_count > ar[n-1])
        {
            max_count = curr_count;
            res = ar[n - 1];
        }
     
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0;
                ar_i < n;
                ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = carDistribution(n, ar);

        System.out.println (result);
    }
    
}
