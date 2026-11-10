package oop.multi_level_inheritance;

public class latest_phone extends new_phone {
    public void internet(){
        System.out.println("internet");
    }

    static void main(String[] args) {
        latest_phone app1=new latest_phone();
        app1.call();
        app1.message();
        app1.internet();

    }
}
