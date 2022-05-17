package Array;

import java.util.Scanner;

public class ArrayCreation {
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

    System.out.println("array is");

    for(int i=0; i<arr.length;i++){
        System.out.println(arr[i]);
    }



    // 2-D ARRAY
    System.out.println("Enter No of rows");
    int rows = sc.nextInt();
    System.out.println("Enter No of Columns");
    int cols = sc.nextInt();
    int array[][]= new int[rows][cols];
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length;j++){
            array[i][j]=sc.nextInt();
        }
    }

    System.out.println("2D Array is");
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length;j++){
            System.out.print(array[i][j]);
            System.out.print(" ");
        }
        System.out.println(" ");

    }

 
    }

}
