package oop.polymorphism_overloading;

public class method_over_loading {

    public void add(){
        int a=10;
        int b=20;

        System.out.println(a+b);
    }

    public void add(int mark1,int mark2){
        System.out.println(mark1+mark2);
    }

    public void add(String name,int age){
        System.out.println("name  "+name+"age is "+age);
    }



    static void main(String[] args) {
        method_over_loading app1=new method_over_loading();
        app1.add();
        app1.add(10,20);
        app1.add("thula",88);
    }
}
