package Array;

public class MaxAndMin {
    public static void main(String[] args) {
        int arr[] = {11,5,44,13,7};
        int temp=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
            else if(min>arr[i]){
          
                min=arr[i];
                
            }
            
        }
        System.out.println("Max is");
        System.out.println(temp);
        System.out.println("Min is");
        System.out.println(min);
    
    }
}
  


