package lr3;

import java.util.Scanner;

public class task2 {

    public static void to_binary(int k){
        if(k>1){
            to_binary(k/2);
            System.out.printf(""+k%2);
        }
        else
        {
            System.out.printf(""+k);
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите число для перевода в 2ую систему счисления: ");
        Scanner id = new Scanner(System.in);

        int k = id.nextInt();

        System.out.println("Исходное число: "+k);

        System.out.println("Представимо в виде двоичного");

        to_binary(k);

    }
}
