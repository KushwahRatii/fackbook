package com.packages;

import java.util.*;
public class Reverse {
    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static int reverse(int[] arr,int s, int l){

        if(s>=l)
        {
            return 0;
        }

        swap(arr[s],arr[l]);
        reverse(arr,s+1,l-1);
        return 0;
    }
    public static void main(String[] args){

        int [] arr= new int[3];
        arr[0]=3;
        arr[1]=4;
        arr[2]=7;
        reverse(arr,0,arr.length-1);
        for (int i=0;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
