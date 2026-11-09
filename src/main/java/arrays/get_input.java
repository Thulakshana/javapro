package arrays;

import java.util.Scanner;

public class get_input {
    static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int[]arr=new int[5];

        for(int i=0;i<arr.length;i++){
            System.out.println("enter number: ");
            arr[i]=cs.nextInt();
        }



    }
}
