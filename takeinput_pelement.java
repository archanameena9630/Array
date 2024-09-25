package Arry;
import java.util.Scanner;

// Java Program to take input and print elements of array;
public class Arry11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " +(n)+ " array elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements in array are: ");
        for(int i=0;i<n;i++){
            System.err.println(arr[i]);
        }
    }
}
