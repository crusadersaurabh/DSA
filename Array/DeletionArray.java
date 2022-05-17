package Array;

import java.util.Scanner;

public class DeletionArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter Array Value");

    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }

    int arr1[] = new int[size-1];
    System.out.println("Enter Index of  Array Deletion");

    int index= sc.nextInt();

    for(int i=0;i<arr1.length;i++)
    {
        if(i<index){
            arr1[i]=arr[i];
        }
        else if (i==index)
        arr1[i]=arr[i+1];
        else
        arr1[i]=arr[i];
    }
    System.out.println(" ");

    for(int i=0;i<arr1.length;i++){
    System.out.println(arr1[i]);
    }    
    }
    
}
