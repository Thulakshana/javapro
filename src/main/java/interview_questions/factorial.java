package interview_questions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner cs=new Scanner(System.in);
        System.out.println("enter number: ");
        int num=cs.nextInt();

        int factorial=1;

        for(int i=0;i<=num;i++){
            factorial=factorial*i;
        }

        System.out.println("factorial is "+ factorial);
    }
}
