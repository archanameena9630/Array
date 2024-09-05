package Arry;

public class Arry55 {
    public static void main(String[] args) {
        int arr[]={4,5,2,3,1};
        int sb;
        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                sb=arr[i];
                arr[i]=arr[j];
                arr[j]=sb;
            }
        }
        System.out.print(arr[i]);
        }
        System.out.print("sereyal number"+arr[1]);
    }
}

