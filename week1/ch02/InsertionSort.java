package com.company;

import java.util.Arrays;

public class Main {
    public  static  void InsertionSort(int a[])
    {
        //int a[]={2,5,3,8,4};
        int i,j,n;
        n=a.length;
        for(j=2;j<n;j++) {
            int key = a[j];
            i = j - 1;
            while (i > 0 && a[i] > key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
    }


    public static void main(String[] args) {
        int a[]={2,5,3,8,4};
        InsertionSort(a);
        System.out.println(Arrays.toString(a));

    }
}
