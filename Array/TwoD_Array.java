package Array;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row_size = sc.nextInt();
        int col_size = sc.nextInt();
        int[][] arr = new int[row_size][col_size];

        for(int i=0; i<row_size;i++){       //inputting value in Array
            for(int j=0; j<col_size;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row_size;i++){
            for(int j=0;j<col_size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
