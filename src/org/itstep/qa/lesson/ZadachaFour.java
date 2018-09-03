package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaFour {
    //задача 2 с циклом вайл
    public static void main(String[]args) {
        Scanner inn = new Scanner(System.in);
        int n = inn.nextInt();
        int f = 1;
        int i = 1;
        while (i <= n) {
            f = i * f;
        i++; }
        System.out.println(f);
    }
}
