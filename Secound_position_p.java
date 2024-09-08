package Arry;
// Insert an element at the second position in the array [15, 16, 17].....
public class Arry10 {
    public static void main(String[] args) {
        int arr[]={15,16,17};
        int element =16;
        int position=2;
        int arry[]=new int [arr.length+1];
        for(int i=0;i<position;i++){
            arry[i]=arr[i];
        }
        arry[position]=element;
        for(int i=position;i<arr.length;i++){
            arry[i+1]=arr[i];
        
        System.out.println(arr[i]);
    }
}
}