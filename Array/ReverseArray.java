package Array;

public class ReverseArray {
    public void reverse(int arr[],int start,int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseArray array = new ReverseArray();
        int[] arr = {1,2,3,4,5,6,7};
        array.printArray(arr, 7);
        array.reverse(arr, 0, 6);
        array.printArray(arr, 7);
    }
}
