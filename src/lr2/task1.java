package lr2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

// 1. Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне. В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
public class task1 {
    public static void main(String[] args) {

        int size_v = 5;
        int size_h = 6;
        int[][] matrix = new int[size_v][size_h];

        Random random = new Random();

        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++){
                matrix[i][j] = random.nextInt(10); // заполним массив
            }
        }
        // выведем его в консоль

        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
                System.out.print('\t');
            }
            System.out.print('\n');
        }

        // Выведем минимальные элементы и их индексы


        int min_value = matrix[0][0];

        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++) {
                if (min_value > matrix[i][j]) {
                    min_value = matrix[i][j]; // нашли минимальный
                }
            }
        }
        System.out.printf("Минимальное значение элемента в матрице %d \n", min_value);
        System.out.printf("Позиции минимальных элементов в матрице:\t");
        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++) {
                if (min_value == matrix[i][j]) {
                    System.out.printf("{%d %d}",i,j);
                    System.out.printf("\t");
                }
            }

        }




    }
}
