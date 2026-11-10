package interview_questions;

public class swap {
    static void main(String[] args) {
        int a=10;
        int b=20;

        a=a+b; //a=30
        b=a-b; //b=10
        a=a-b; //a=20

        System.out.println(a);
        System.out.println(b);

        int c=50;
        int d=88;

        int temp=c;
        c=d;
        d=temp;

        System.out.println(c);
        System.out.println(d);



    }
}
