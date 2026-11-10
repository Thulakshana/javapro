package loop;

import java.util.Scanner;

public class while_loop {

    static void main(String[] args) {
        Scanner cs=new Scanner(System.in);

        String password="";

        while(!password.equals("thula")){
            System.out.println("enter password: ");
            password=cs.nextLine();
        }
        System.out.println("correct passowrd");
        cs.close();
    }

}
