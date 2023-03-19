package lr1;

//Задания для самостоятельной работы
//1. Напишите программу, в которой Пользователь вводит сначала фамилию, затем имя, затем отчество. После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>».



import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Surname");
        String surname = in.nextLine();

        System.out.println("Enter the Name");
        String name = in.nextLine();

        System.out.println("Enter the Last Name");
        String last_name = in.nextLine();


        System.out.printf("Hello %s %s %s", surname,name,last_name);

        in.close();
    }
}

