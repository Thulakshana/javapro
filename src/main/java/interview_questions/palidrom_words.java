package interview_questions;

import java.util.Scanner;

public class palidrom_words {
    static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("eneter word: ");
        String word=cs.nextLine();

        String reverse="";

        for(int i=word.length()-1;i>=0;i--){
        reverse=reverse+word.charAt(i);
        }

        if(word.equals(reverse)){
            System.out.println("that is palidrom word");
        }else{
            System.out.println("that is not palidrom word");
        }
    }
}
