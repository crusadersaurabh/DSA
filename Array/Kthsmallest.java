package Array;

import java.util.Scanner;

public class Kthsmallest {

    public static void main(String[] args) {
        int arr[] = {1,5,3,6,9};
        int temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kth Element");
        int kth = sc.nextInt();
        if(kth<arr.length)
        {
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                    if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    }
                }
               
            }

        }
        else
        System.out.println("Enter the kth Element smaller then the Array");

       
        System.out.println("");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
   
        }

        System.out.println("");


        for(int i=0;i<arr.length;i++)
        {
            if(arr[kth-1]==arr[i])
            {
                System.out.println(arr[i]);
            }
        }

    }
    
}
