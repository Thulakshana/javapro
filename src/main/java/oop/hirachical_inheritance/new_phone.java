package oop.hirachical_inheritance;

public class new_phone extends call{
    public void message(){
        System.out.println("message");
    }

    static void main(String[] args) {
        new_phone app1=new new_phone();
        app1.call();
    }
}
