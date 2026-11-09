package interview_questions;

public class reverse_string {
    static void main(String[] args) {
        String name="thula";

        System.out.println(name.length());

        System.out.println(name.charAt(4));

        String reverse="";

        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }

        System.out.println(reverse);
    }
}
