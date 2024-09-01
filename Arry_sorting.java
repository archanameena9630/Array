package Arry;

 class sortinAscending {
    public static void main(String[] args) {
        int arr[]={3,7,2,10,5,8,4,6};
        int num;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;
                }
            }
            System.out.print(arr[i]+"");
        }
        System.out.print(" third small element"+arr[1]);
    }
 }
