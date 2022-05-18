package Array;

import java.util.Scanner;

public class ReverseAray {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        System.out.println("Enter Array");
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         int index = size-1;
        int arrRvr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arrRvr[i]= arr[index-i];
        }
        
        System.out.print(" ");
        System.out.println("Reversed Array is");

        for(int i=0;i<arr.length;i++){
            System.out.println(arrRvr[i]);

        }

    }
    
}
