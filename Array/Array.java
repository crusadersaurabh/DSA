package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");

        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Values");

    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Array Values");

    for(int i=0;i<size;i++)
    {
        System.out.println(arr[i]);
    }

        // int[] arr = new int[5];

        // arr[0]=0;
        // arr[1]=1;
        // arr[2]=2;
        // arr[3]=3;
        // arr[4]=4;

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);


    }
    
}
