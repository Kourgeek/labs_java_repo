package lr6;

import java.util.*;
import java.util.stream.Collectors;

public class task1 {

    public static void main(String[] args) {
        /* task1
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = createArray(size);
        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));
        int[] arrResult = filterEvenNumbers(arr);
        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
         */

        /* Task2
        int[] arr1 = createArray(100);
        int[] arr2 = createArray(10);

        System.out.println("Common elements of arr1 & arr2 is:" + Arrays.toString(findCommonElements(arr1,arr2)));

         */


        /* Task3
        String string = "Напишите функцию, которая принимает на вход Список строк и возвращает новый список, " +
                "содержащий только те Cтроки, Которые начинаются с большой буквы.";
        List<String> strings = List.of(string.split(" "));

        List<String> stringsAfter = filterCapitalizedStrings(strings);

        printStrings(stringsAfter);

         */

        /* Task4
        int[] arr = createArray(3);
        printArray(arr);

        printArray(toSquareArray(arr));

         */

        /* Task 6
        List<Integer> lst = new ArrayList<Integer>(){{
            add(10);
            add(20);
            add(3);
        }};
        int divisor = 5;

        System.out.println(NumberDivisor(lst,divisor));

         */

        /* Task7
        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые имеют длину больше заданного значения..";

        int len = 10;

        List<String> strings = List.of(string.split(" "));

        List<String> stringsAfter = filterStrlen(strings, len);

        printStrings(stringsAfter); */

        /* Task8
        int[] arr = createArray(10);

        int morethan = 50;

        System.out.println(Arrays.toString(morethannumber(arr,morethan)));

         */


    }

    private static int[] morethannumber(int[] arr, int morethan) {
        return Arrays.stream(arr).filter(x->x>morethan).toArray();
    }

    public static List<String> filterStrlen(List<String> strings,int len) {
        return strings.stream().filter(x->x.length()>=len).collect(Collectors.toList());
    }

    public static List<Integer> NumberDivisor(List<Integer> lst, int divisor){
        return lst.stream().filter(x->x%divisor==0).collect(Collectors.toList());
    }
    public static int[] toSquareArray(int[] arr) {
        return Arrays.stream(arr).map(x->x*x).toArray();
    }

    public static void printArray(int[] arr) {
        System.out.println("Mассив");
        for(int i: arr){
            System.out.println(i);
        }
    }


    public static void printStrings(List<String> strings){
        for(String s: strings){
            System.out.println(s);
        }
    }
    public static List<String> filterCapitalizedStrings(List<String> strings) {
        return strings.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }

    public static int[] filterEvenNumbers(int[] arr){
        return Arrays.stream(arr).filter(x ->x%2 == 0).toArray();
    }

    public static int[] createArray(int size){
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }



    public static int[] findCommonElements(int[] arr1, int[] arr2){
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                        .anyMatch(y->y==x)).toArray();
    }
}
