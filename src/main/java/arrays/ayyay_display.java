package arrays;

import java.util.Arrays;

public class ayyay_display {
    static void main(String[] args) {
        int [] number=new int[10];
        Arrays.fill(number,100);
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }

        int [] arr2={1,2,3,4,5,6,7}; // foreach loop
        for(int num1:arr2){
            System.out.println(num1);
        }

        int[][]matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        System.out.println(matrix.length);

        for(int i=0;i<matrix.length;i++){ //print two diamensional array
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
        }





    }
}
