package arrays;

public class find_smallest {
    static void main(String[] args) {
        int[]arr={1111,6,111,2,3,666,4,5,6,7,19};

        int samllest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<samllest){
                samllest=arr[i];
            }
        }
        System.out.println("the smallest number is "+samllest);
    }
}
