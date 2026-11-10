package interview_questions;

public class count_vowel_and_constant {
    static void main(String[] args) {
        String name="thulakshana";
        int vowel=0;
        int constant=0;

        for(int i=0;i<=name.length();i++){
            char ch=name.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel++;
            }else{
                constant++;
            }
        }

        System.out.println(constant);
        System.out.println(vowel);
    }
}
