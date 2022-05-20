package Array;

import java.util.Scanner;

public class SortZerosOnesTwosArray {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     int arr[] = new int[N];
    //     int temp=0;
    //     System.out.println("Enter Array");

    //     for(int i=0;i<arr.length;i++)
    //     {
    //         arr[i]=sc.nextInt();
    //     }

    //     for(int i=0;i<arr.length;i++)
    //     {
    //         for(int j=i;j<arr.length;j++)
    //         {
    //             if(arr[i]>arr[j]){
    //             temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //             }
    //         }
           
    //     }

    //     System.out.println("Sorted Array is");

    //     for(int i=0;i<arr.length;i++)
    //     {
    //         System.out.println(arr[i]);
    //     }


    // }

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int arr1[] = new int[N];
        int zero=0;
        int one=0;
        int two=0;
        System.out.println("Enter Array");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    

    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            zero++;
            }   
            else if(arr[i]==1)
            {
                one++;
            }
            else
            two++;
        }
        System.out.println("The Count is");

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);



        System.out.println("The Sorted ARRAY IS" );
        for(int i=0;i<arr.length;i++)
        {
            if(i<zero) arr[i]=0;
            else if(i>=zero && i<one+zero) arr[i]=1;
            else
            arr[i]=2;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
    }
    






