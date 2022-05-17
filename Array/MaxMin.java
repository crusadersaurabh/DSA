package Array;

public class MaxMin {
    public void maxm(int arr[])
    {
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
    
    public static void main(String[] args) {
        MaxMin max = new MaxMin();
        int[] arr = {2,1,4,3,5,6,0};
        max.maxm(arr);
    }
}
