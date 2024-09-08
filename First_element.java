package Arry;
// Remove the first element of the array [11, 12, 13, 14].
public class Arry9 {
    public  static void main(String[] args) {
        
        int arr[]={11,12,13,14};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}