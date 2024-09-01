package Arry;

// Java Program to Count Even and Odd Elements in Array
public class Arry_even_odd {
       public static void main(String[] args) {
        System.out.println(" final number ");
        int arr[]={ 2,3,6,5,8,7,6,9,11,12};
          int evencount=0;
          int oddcount=0;
          for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
          }
          System.out.println(" total even number:"+evencount);
          System.out.println(" odd total number:"+ oddcount);
       }
}
