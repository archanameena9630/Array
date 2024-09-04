package Arry;

public class Arry88 {
    public static void main(String[] args) {
        int arr[]={11,12,14,15,16,17};
        int temp=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]-1){
              max=arr[i];
            }
            else{
             temp=max+1;
            }
        }
     System.out.println(temp+" ");
    }   
    }

