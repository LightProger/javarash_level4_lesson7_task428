package Alexandr_Nikitchenko;

/*
Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //Ввод данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();


        // Преобразуем строки в числа
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s1);
        int c = Integer.parseInt(s2);

        if ((a >= 0)&&(b >= 0)&&(c >= 0)) {
            System.out.println(3);
        } else if (((a >= 0)&&(b <= 0)&&(c >= 0))||((a >= 0)&&(b >= 0)&&(c <= 0))||((a <= 0)&&(b >= 0)&&(c >= 0))) {
            System.out.println(2);
        } else if (((a >= 0)&&(b <= 0)&&(c <= 0))||((a <= 0)&&(b >= 0)&&(c <= 0))||((a <= 0)&&(b <= 0)&&(c >= 0))) {
            System.out.println(1);
        } else System.out.println(0);
    }
}
