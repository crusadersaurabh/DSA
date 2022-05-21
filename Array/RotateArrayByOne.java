package Array;

import java.util.Scanner;

public class RotateArrayByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");

        int N = sc.nextInt();
        int arr[] = new int[N];
        int arr2[] = new int[N];
        
        System.out.println("Enter Array");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
 
        for(int i=0;i<arr.length-1;i++)
        {
            if(i==0)
            {
                arr2[i]=arr[N-1];
            }
            arr2[i+1]=arr[i];
        }

        System.out.println("");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr2[i]);
        }



    }
    
}
