package Array;

public class ArrayRotation {
    public void leftrotate(int arr[],int d,int n){
        for(int i=0;i<d;i++){
            leftrotatebyone(arr,n);
        }
    }
    public void leftrotatebyone(int[] arr, int n) {
        int i, temp;
        temp = arr[0];
        for(i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    public void printarray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrayRotation rotate = new ArrayRotation();
        rotate.leftrotate(arr, 2, 7);
        rotate.printarray(arr, 7);
    }
}
