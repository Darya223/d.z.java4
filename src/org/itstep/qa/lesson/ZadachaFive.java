package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaFive {
    //даны переменные x и n. вычислить x в стерени n
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int x;
        int n;
        x = inn.nextInt();
        n = inn.nextInt();
        int rez = 1;
        for (int i = 0; i < n; i++) {
            rez = x * rez;
        }
        System.out.println("равно" +rez);
    }
}
