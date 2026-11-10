package DSA;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset {
    static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        //hshset = duplicate values thiya ganne na
        name.add("thula");
        name.add("thula");
        name.add("bllom");

        System.out.println("before names "+name);

        HashSet<String> names=new HashSet<>(name);

        System.out.println("hashset names "+names);
    }
}
