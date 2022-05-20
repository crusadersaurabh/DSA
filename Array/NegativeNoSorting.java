package Array;

public class NegativeNoSorting {
    public static void main(String[] args) {
        int arr[] = { -11, 2, -3, 4, 5, 6, -7, 8, 9 };
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]<0)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }


        // int j = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] < 0) {
        //         if (i != j) {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //         j++;
        //     }
        // }

        System.out.println("The -ve sorted Araay is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
