package oop.interfaces;

public class normal_class implements interface_one {

    public void eat(){
        System.out.println("eat");
    }

    public void drink(){
        System.out.println("drink");
    }

    public void sex(){
        System.out.println("sex");
    }

    static void main(String[] args) {
        normal_class app1=new normal_class();
        app1.drink();
        app1.eat();
        app1.sex();

    }
}
