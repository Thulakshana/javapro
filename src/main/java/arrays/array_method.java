package arrays;

import java.util.Arrays;

public class array_method {
    static void main(String[] args) {
        int [] arr={1,2,6,3,8,90,3,11,111};

        System.out.println(Arrays.toString(arr)); //print array

        Arrays.sort(arr); //sort array

        System.out.println(Arrays.toString(arr));

        int index=Arrays.binarySearch(arr,2);
        System.out.println("index is "+index); //search element

        System.out.println(arr.length); //get length

        int[]arr2={1,2,3,4,5};
        System.out.println(Arrays.equals(arr,arr2)); // check equality

        int[]arr3=new int[5];
        Arrays.fill(arr3,10);
        System.out.println(Arrays.toString(arr3)); //fill array











    }
}
