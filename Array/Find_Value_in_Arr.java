package Array;

import java.util.Scanner;

public class Find_Value_in_Arr {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size");
    int size = sc.nextInt();
    System.out.println("Enter Value to find");
    int value = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter Array Value");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++){
        if(arr[i]==value){
            System.out.println(value+" is found in Array");
        }
    }
    System.out.println(value+" is Not found in Array");

}    
}
