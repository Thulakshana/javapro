package oop.abscraction;

public class normal_class extends Abscract_class{

@Override
    public void eat(){
        System.out.println("eat");
    }
@Override
    public void drink(){
        System.out.println("drink");
    }

    static void main(String[] args) {
        normal_class app1=new normal_class();
        app1.eating();
        app1.drink();
    }
}
