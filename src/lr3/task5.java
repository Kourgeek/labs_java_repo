package lr3;

import java.util.HashMap;

public class task5 {
    public static void main(String[] args) {
        HashMap<Integer,String> HM = new HashMap<Integer,String>();

        for(int i = 0;i<10;i++){
            HM.put(i,"a");
        }

       for(int i=0;i<HM.size();i++){
           if(i>5){
               System.out.println(HM.get(i));
           }
       }

        int key = 0;

        if(key==0){
            for(int i=0;i< HM.size();i++){
                System.out.print(HM.get(i)+',');
            }
        }
    }


}
