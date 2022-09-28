import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Массивы. Часть 1.  Домашнее задание - 1 Задание 1
        System.out.println("Массивы. Часть 1.  Домашнее задание - 1 Задание 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double[] k = {1.57, 7.654, 9.986};
        int[] l = {4, 5, 6};

        // Массивы. Часть 1.  Домашнее задание - 1 Задание 2
        System.out.println("Массивы. Часть 1.  Домашнее задание - 1 Задание 2");
        for (int i = 0; i < number.length; i++) {
            if (i != number.length + 1) {
                System.out.println(number[i]);
            }
        }
            for (int i = 0; i < k.length; i++) {
                if (i != k.length + 1) {
                    System.out.println(k[i]);
                }
            }
                for (int i = 0; i < l.length; i++) {
                    if (i != l.length + 1) {
                        System.out.println(l[i]);
                    }
                }

        // Массивы. Часть 1.  Домашнее задание - 1 Задание 3
        System.out.println("Массивы. Часть 1.  Домашнее задание - 1 Задание 3");
        for (int i =number.length -1; i >= 0; i--) {
            if (i != 0) {
                System.out.println(number[i] + ",");
            } else {
                System.out.println(number[i]);
                    }
                }
        for (int i =k.length -1; i >= 0; i--) {
            if (i != 0) {
                System.out.println(k[i] + ",");
            } else {
                System.out.println(k[i]);
            }
        }
        for (int i =l.length -1; i >= 0; i--) {
            if (i != 0) {
                System.out.println(l[i] + ",");
            } else {
                System.out.println(number[i]);
            }
        }
        // Массивы. Часть 1.  Домашнее задание - 1 Задание 4
        System.out.println("Массивы. Часть 1.  Домашнее задание - 1 Задание 4");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] +=1;
            }
        }
        System.out.println(Arrays.toString(number));

    }
}
