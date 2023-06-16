package lr3;

import java.util.Scanner;

public class task3 {


    public static void main(String[] args) {
        Scanner id =  new Scanner(System.in);
        int len = id.nextInt();
        int[] arr = new int[len];

        initiazile(arr,len);
        print_arr(arr,len);



    }
    public static int initiazile(int[] arr,int len) {
        if(len>0){
            arr[len-1]= new Scanner(System.in).nextInt();
            len=len-1;
            initiazile(arr,len);
        }
        return 0;
    }

    public static int print_arr(int[] arr,int len) {
        if(len>0){
            System.out.println(" "+arr[len-1]);
            len=len-1;
            print_arr(arr,len);
        }
        return 0;
    }
}
