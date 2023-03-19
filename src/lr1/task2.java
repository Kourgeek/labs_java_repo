package lr1;

//2. Напишите программу, в которой Пользователь вводит имя и возраст. Программа отображает сообщение об имени и возрасте пользователя.

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Name");
        String name = in.nextLine();

        System.out.println("Enter the Age");
        int age = in.nextInt();

        System.out.printf("Пользователь %s имеет возраст %d", name, age);

        in.close();
    }
}
