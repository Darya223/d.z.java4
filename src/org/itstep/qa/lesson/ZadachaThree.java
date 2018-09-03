package org.itstep.qa.lesson;

public class ZadachaThree {
    //первая задача с циклом вайл
    public static void main(String[]args) {
        int i = 1;
        while (i <= 99) {
            if (i%2 != 0)
                System.out.println(i + "нечётные числа"); i++;
        }
    }
}
