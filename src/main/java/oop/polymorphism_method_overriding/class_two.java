package oop.polymorphism_method_overriding;

public class class_two extends class_one {

    public void add(){
        int c=99;
        int d=88;

        System.out.println(c+d);
    }
    static void main(String[] args) {
        class_two app1=new class_two();
        app1.add();

        class_one app2=new class_one();
        app2.add();


    }
}
