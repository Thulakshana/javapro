package interview_questions;

public class find_largest_number {
    public static void main(String[] args){
        int a=10;
        int b=11;
        int c=12;

        if(a>b && a>c){
            System.out.println("large one is A");
        }else if(b>a && b>c){
            System.out.println("largest one is B");
        }else{
            System.out.println("large one is C");
        }
    }
}
