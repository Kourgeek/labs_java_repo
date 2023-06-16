package lr3;

import java.util.ArrayList;
import java.util.LinkedList;

public class task6 {
    public static void main(String[] args) {

        int n=1000000;

        // n = 10_000
        //ArrayList 16 - ms
        //LinkedList 101 - ms

        // n = 100_000
        //ArrayList - 868 ms
        //LinkedList - 7029 ms


        // n = 1_000_000
        //ArrayList - too much
        //LinkedList - too much

        ArrayList<Integer> alist = new ArrayList<>();
        LinkedList<Integer> llist = new LinkedList<>();
        System.out.println("initializing lists");
        for (int i = 0; i < n; i++) {
            alist.add(i,i+1);
            llist.add(i,i+1);
        }

        System.out.println("lists filled");

        long time = System.currentTimeMillis();

        remover(alist);

        System.out.println(System.currentTimeMillis() - time);
        System.out.println("Это время ArrayList");


        time = System.currentTimeMillis();

        remover(llist);
        System.out.println(System.currentTimeMillis() - time);
        System.out.println("Это время LinkedList");


    }

    private static void remover(ArrayList<Integer> alist) {
        if (alist.size()==1){
            return;
        }else{
            for (int i = 0; i < alist.size(); i++) {
                if (i/2!=1){
                    alist.remove(i);
                }
            }
        }
    }
    private static void remover(LinkedList<Integer> llist) {
        if (llist.size()==1){
            return;
        }else{
            for (int i = 0; i < llist.size(); i++) {
                if (i/2!=1){
                    llist.remove(i);
                }
            }
        }
    }
}
