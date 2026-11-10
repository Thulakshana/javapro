package oop.hirachical_inheritance;

public class old_phone extends call{
    public void interent(){
        System.out.println("interent");
    }

    static void main(String[] args) {
        old_phone app1=new old_phone();
        app1.interent();
        app1.call();
    }
}
