package Array;

import java.util.Scanner;

public class LargestSumSubaArray {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array");

    int N = sc.nextInt();
    int arr[] = new int[N];
    System.out.println("Enter Array");
    int cursum=0;
    int maxsum=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }




    int maxend = arr[0];
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {

        if (arr[i] > maxend + arr[i]) {
            maxend = arr[i];
        } else {
            maxend = maxend + arr[i];
        }
        if (max < maxend) {
            max = maxend;
        }
    }

    System.out.println(max);
}


}
