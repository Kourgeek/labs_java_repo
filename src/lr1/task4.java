package lr1;

//4. Напишите программу, в которой пользователю предлагается ввести название месяца и количество дней в этом месяце. Программа выводит сообщение о том, что соответствующий месяц содержит указанное количество дней.

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца");
        String month = in.nextLine();

        System.out.println("Введите количество дней в месяце");
        int days = in.nextInt();


        System.out.printf("В месяце %s ровно %d дней",month, days);

        in.close();
    }
}
