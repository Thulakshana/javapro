package DSA;

import java.util.ArrayList;

public class arraylist_lesson {
    static void main(String[] args) {
        ArrayList arr1=new ArrayList();
        arr1.add(1);
        arr1.add("thula");

        System.out.println(arr1.size());

        System.out.println(arr1.get(0));

        arr1.set(1,50); //edit

        System.out.println(arr1.size());

        System.out.println(arr1.contains(50));

        //arr1.remove(50);

        arr1.add("randeepana");

        System.out.println(arr1.contains("randeepana"));

        System.out.println(arr1.indexOf("randeepana"));



    }
}
