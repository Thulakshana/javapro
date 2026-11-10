package loop;

public class for_each_loop {
    static void main(String[] args) {

        String[] names={"thula","ran","dissa"};

        for(String name:names){
            System.out.println(name);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////

        int [] marks={12,344,12,34};

        int total=0;

        for(int totalmarks:marks){
            total=total+totalmarks;
        }

        System.out.println(total);


        /////////////////////////////////////////////////////////////////////////////////////////////

        int [] mr={12,34,56,78,90};

        for(int m_student:mr){
            if(m_student>=50){
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        int [] age={11,22,33,44,55,66,77,88};
        for(int st_age:age){
            if(st_age==22){
                break;
            }
            System.out.println(st_age);
        }


        /////////////////////////////////////////////////////////////////////////////////////////////

        int [] agee={11,22,33,44,55,66,77,88};

        for(int st_age:agee){
            if(st_age==22){
                continue;
            }
            System.out.println(st_age);
        }

    }
}
