package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaTwo {
    //факториал. цикл фор
    public static void main(String[]args) {
        Scanner inn = new Scanner(System.in);
        int n = inn.nextInt();
        int f = 1;
    for (int i = 1; i <= n; i++) {
            f = i * f;}
                System.out.println(f);
        }
    }