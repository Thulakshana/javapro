package arrays;

import java.util.Scanner;

public class serch {
    static void main(String[] args) {
        int[]arr={1,5,8,4,2,7};
        Scanner cs=new Scanner(System.in);
        System.out.println("enter number ");
        int num=cs.nextInt();

        boolean found=false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    }
}
