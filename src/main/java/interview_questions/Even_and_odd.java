package interview_questions;

import java.util.Scanner;

public class Even_and_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int val=sc.nextInt();

        if(val%2==0){
            System.out.println("that is even number");
        }else{
            System.out.println("that is odd number");
        }

    }
}
