package Arry;

public class Arrymin {
    public static void main(String[] args) {
        int arr[]={19,9,12,15,20};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
        if (min>arr[i])
        {
          min=arr[i];
        }
    }
    System.out.println("value"+min);
}
}
