package Arry;

public class Arrymix {
    public static void main(String[] args) {
        int arr []={ 12,33,44,23,65};
        int mix=arr[0];
        for (int i=0;i<arr.length;i++){
            if(mix<arr[i]){
                mix=arr[i];
            }
        }
        System.out.println("value"+mix);
    }
}



