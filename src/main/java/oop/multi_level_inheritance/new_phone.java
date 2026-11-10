package oop.multi_level_inheritance;

public class new_phone extends old_phone {
    public void message(){
        System.out.println("message");
    }
    static void main(String[] args) {
        new_phone app1=new new_phone();
        app1.call();
        app1.message();
    }
}
