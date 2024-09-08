package Arry;
// Remove the last element of the array [4, 5, 6, 7]
public class Arry7 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7};
    
        int []array=new int [arr.length-1];
        for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
} 
System.out.println("remove  element");
for(int i=0;i<array.length;i++){
    array[i]=arr[i]; 
    System.out.print(array[i]+ " ");
}   }
}
