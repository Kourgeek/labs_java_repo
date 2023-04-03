package lr2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class task3 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.printf("Программа реализует шифрование с алгоритмом Шифр цезаря\n");
        System.out.printf("Введите текст для шифровки\n");
        String some_str = id.nextLine();
        System.out.printf("Введите ключ (seed)\t");
        int seed = id.nextInt();

        String encoded_str = encode_caesar(some_str,seed);
        System.out.printf("Текст после преобразования: %s \n",encoded_str);

        System.out.printf("Выполнить обратное преобразование? (y/n)\n");



        while (true){

            String flag = id.next();

            if(flag.charAt(0) =='y'){
                System.out.printf("Обратное преобразование %s", decode_caesar(encoded_str,seed));
                break;
            }
            if(flag.charAt(0)=='n'){
                System.out.printf("До свидания");
                break;
            }
            else {
                System.out.printf("Введите корректный запрос");
            }
        }


    }
    public static String encode_caesar(String some_str, int key) {
        String ciphered = "";
        int strlen = some_str.length();

        for(int i = 0; i< strlen;i++){
            char cur_char = some_str.charAt(i);
            int ascii = (int) cur_char;
            ascii = ascii + key;
            cur_char = (char) ascii;

            ciphered = ciphered.concat(Character.toString(cur_char));
        }
        return ciphered;
    }

    public static String decode_caesar(String some_str, int key) {
        String ciphered = "";
        int strlen = some_str.length();

        for(int i = 0; i< strlen;i++){
            char cur_char = some_str.charAt(i);
            int ascii = (int) cur_char;
            ascii = ascii - key;
            cur_char = (char) ascii;

            ciphered = ciphered.concat(Character.toString(cur_char));
        }
        return ciphered;
    }
}
