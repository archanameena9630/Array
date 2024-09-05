package Arry;

// Java: Calculate the average value of array elements
public class Average {
    public static void main(String[] args) {
        int arr[]={20, 30, 25, 35, -16, 60, -100};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double Average=sum/arr.length;
        System.out.println("Average value of the array elements is:"+Average);
    }
}
