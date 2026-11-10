package arrays;

public class array_sort_loop {
    static void main(String[] args) {
        int[]num={11,10,15,133,1,7654,234};

        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }

        for(int k=0;k<num.length;k++){
            System.out.println(num[k]);
        }
    }
}
