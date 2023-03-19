package lr1;
//6. Напишите программу, в которой Пользователь вводит имя и год рождения, в программа отображает сообщение содержащее имя пользователя и его возраст.

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя Пользователя");
        String name = in.nextLine();
        System.out.println("Введите год рождения Пользователя");
        int year = in.nextInt();
        int diff = 2023 - year;

        System.out.printf("Пользователю %s, %d лет",name, diff);
    }
}
