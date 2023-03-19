package lr1;

import java.util.Scanner;

//3. Напишите программу, в которой Пользователь последовательно вводит название текущего дня недели, название месяца и дату (номер дня в месяце). Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the day of week");
        String weekday = in.nextLine();

        System.out.println("Enter the month");
        String month = in.nextLine();

        System.out.println("Enter the date");
        int date = in.nextInt();


        System.out.printf("Today is %s %d %s", weekday,date,month);

        in.close();
    }
}
