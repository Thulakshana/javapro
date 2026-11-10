package arrays;

public class find_largest {
    static void main(String[] args) {
        int [] num={1,5,222,4,9090,9,6666};

        int largest=num[0];

        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("the largest value is "+largest);
    }
}
